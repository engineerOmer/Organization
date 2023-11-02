package engineeromer.com.organization.dto.request;

import engineeromer.com.organization.converter.EnglishLowerCase;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaveOrganizationRequestDto {

    private String organizationNameNumeric;

    @EnglishLowerCase
    private String organizationName;

    private long registryNumber;

    private String email;

    private Date foundedYear;

    private String phoneNumbers;

    private int companySize;
}
