package engineeromer.com.organization.dto;

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
