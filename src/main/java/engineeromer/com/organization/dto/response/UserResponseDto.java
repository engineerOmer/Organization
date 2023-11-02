package engineeromer.com.organization.dto.response;

import engineeromer.com.organization.model.Status;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserResponseDto {

    private String fullName;

    private String nickName;

    private String email;

    private Status status;
}
