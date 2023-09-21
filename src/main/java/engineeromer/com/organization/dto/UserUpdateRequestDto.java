package engineeromer.com.organization.dto;

import engineeromer.com.organization.model.Status;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserUpdateRequestDto {

    private int id;

    private Status status;
}
