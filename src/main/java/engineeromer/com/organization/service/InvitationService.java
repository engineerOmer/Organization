package engineeromer.com.organization.service;

import engineeromer.com.organization.dto.request.InvitationRequest;
import engineeromer.com.organization.dto.response.InvitationResponseDto;
import engineeromer.com.organization.model.Invitation;
import engineeromer.com.organization.model.Status;
import engineeromer.com.organization.model.User;
import engineeromer.com.organization.repository.InvitationRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;


@RequiredArgsConstructor
@Service
public class InvitationService{

    private final InvitationRepository invitationRepository;
    private final ModelMapper modelMapper;

    private final UserService userService;

    public InvitationResponseDto sendInvitationUser(InvitationRequest invitationRequest){
        Invitation invitation = modelMapper.map(invitationRequest, Invitation.class);
        User user = userService.getUserById(invitationRequest.getUserId());
        invitation.setUser(Collections.singletonList(user));
        controlStatusForInvitationByUser(invitation);
        invitation.setStatus(Status.PENDING);
        invitationRepository.save(invitation);
        return modelMapper.map(invitation, InvitationResponseDto.class);
    }

    public List<User> controlStatusForInvitationByUser(Invitation invitation) {
        Status status = invitation.getStatus();

        return invitation.getUser().stream().filter(user -> !Objects.equals(status, Status.PENDING)).toList();

    }

}
