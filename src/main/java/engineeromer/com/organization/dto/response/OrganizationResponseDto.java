package engineeromer.com.organization.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrganizationResponseDto {

    private String organizationName;

    private String email;

    private Date foundedYear;

    private String phoneNumbers;
}
