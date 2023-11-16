package engineeromer.com.organization.dto.response;

import engineeromer.com.organization.model.Status;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class InvitationResponseDto {

    private String invitationMessage;

    private Status status;

    private String organizationName;


}
