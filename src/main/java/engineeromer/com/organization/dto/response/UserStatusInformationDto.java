package engineeromer.com.organization.dto.response;

import engineeromer.com.organization.model.Status;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserStatusInformationDto {

    private String fullName;

    private Status status;
}
