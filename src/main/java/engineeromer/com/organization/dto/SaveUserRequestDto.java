package engineeromer.com.organization.dto;

import engineeromer.com.organization.model.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SaveUserRequestDto {

    private String fullName;

    private String nickName;

    private String email;

    private Status status;

}
