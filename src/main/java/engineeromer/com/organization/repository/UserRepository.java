package engineeromer.com.organization.repository;

import engineeromer.com.organization.model.Organization;
import engineeromer.com.organization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    User findByEmail(String email);
    User findByNickName(String nickName);

    List<Organization> findAllOrganizationsByUser(Long id);


}
