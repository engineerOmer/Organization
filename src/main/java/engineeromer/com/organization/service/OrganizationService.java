package engineeromer.com.organization.service;

import engineeromer.com.organization.dto.request.SaveOrganizationRequestDto;
import engineeromer.com.organization.dto.response.OrganizationResponseDto;
import engineeromer.com.organization.dto.response.UserResponseDto;
import engineeromer.com.organization.model.Organization;
import engineeromer.com.organization.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final ModelMapper modelMapper;

    public OrganizationResponseDto saveOrganization(SaveOrganizationRequestDto saveOrganizationRequestDto) {
        Organization organization = modelMapper.map(saveOrganizationRequestDto,Organization.class);
        organizationRepository.save(organization);
        return modelMapper.map(organization, OrganizationResponseDto.class);
    }

    public List<OrganizationResponseDto> getOrganizationsByNormalizedName(String normalizedName) {
        return organizationRepository.findByName(normalizedName)
                .stream()
                .map(organization -> modelMapper.map(organization, OrganizationResponseDto.class))
                .toList();//responseDto
    }

    public List<OrganizationResponseDto> getAllOrganization() {
        return organizationRepository.findAll()
                .stream()
                .map(organization -> modelMapper.map(organization, OrganizationResponseDto.class))
                .toList();
    }

    public List<UserResponseDto> getAllUsersByOrganization(String organizationName) {
        return
        organizationRepository.findAllUsersByOrganization(organizationName)
                .stream()
                .map(user -> modelMapper.map(user, UserResponseDto.class)).toList();
    }

    public OrganizationResponseDto getOrganizationByRegisterNumber(Long registryNumber) {
        Organization organization = organizationRepository.findByLong(registryNumber);
        return modelMapper.map(organization, OrganizationResponseDto.class);
    }
}
