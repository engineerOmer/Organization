package engineeromer.com.organization.controller;

import engineeromer.com.organization.dto.request.InvitationRequest;
import engineeromer.com.organization.dto.response.InvitationResponseDto;
import engineeromer.com.organization.service.InvitationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/invitation")
public class InvitationController {

    private final InvitationService invitationService;

    @PostMapping("/sendInvitationUser")
    public ResponseEntity<InvitationResponseDto> sendInvitationUser(@RequestBody InvitationRequest invitationRequest){
        return new ResponseEntity<>(invitationService.sendInvitationUser(invitationRequest), HttpStatus.OK);
    }
}
