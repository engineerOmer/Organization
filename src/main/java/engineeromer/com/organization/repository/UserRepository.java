package engineeromer.com.organization.repository;

import engineeromer.com.organization.dto.UserResponseDto;
import engineeromer.com.organization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    User findByEmail(String email);
    User findByNickName(String nickName);


}
