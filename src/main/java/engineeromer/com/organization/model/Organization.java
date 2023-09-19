package engineeromer.com.organization.model;

import engineeromer.com.organization.converter.EnglishLowerCase;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String organizationNameNumeric;

    @EnglishLowerCase
    private String organizationName;

    private long registryNumber;

    private String email;

    private Date foundedYear;

    private String phoneNumbers;

    private int companySize;

    @ManyToMany
    @JoinTable(name = "user_organization",
            joinColumns = @JoinColumn(name = "organization_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> users;
}
