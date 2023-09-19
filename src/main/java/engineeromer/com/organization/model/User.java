package engineeromer.com.organization.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String fullName;

    private String nickName;

    private String email;

    private Status status;

    @OneToMany(mappedBy = "user")
    private List<Invitation> invitation;

    @ManyToMany(mappedBy = "users")
    private Set<Organization> organizations;
}
