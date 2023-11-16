package engineeromer.com.organization.repository;

import engineeromer.com.organization.model.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface InvitationRepository extends JpaRepository<Invitation,Integer> {

}
