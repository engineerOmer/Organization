package engineeromer.com.organization.repository;

import engineeromer.com.organization.dto.response.OrganizationResponseDto;
import engineeromer.com.organization.model.Organization;
import engineeromer.com.organization.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization,Integer> {
    List<Organization> findByName(String normalizedName);

    List<User> findAllUsersByOrganization(String organizationName);

    Organization findByLong(Long registryNumber);
}
