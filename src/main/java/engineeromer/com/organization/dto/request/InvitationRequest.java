package engineeromer.com.organization.dto.request;


import engineeromer.com.organization.model.Organization;
import engineeromer.com.organization.model.Status;
import lombok.*;


@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class InvitationRequest {
    private String invitationMessage;

    private Status status;
    private Long userId;

    private int organizationId;

    private Organization organization;
}
