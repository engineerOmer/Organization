package engineeromer.com.organization.controller;


import engineeromer.com.organization.dto.request.SaveOrganizationRequestDto;
import engineeromer.com.organization.dto.response.OrganizationResponseDto;
import engineeromer.com.organization.dto.response.UserResponseDto;
import engineeromer.com.organization.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/organization")
public class OrganizationController {

    private final OrganizationService organizationService;

    @PostMapping("/saveOrganization")
    public ResponseEntity<OrganizationResponseDto> saveOrganization(@RequestBody final SaveOrganizationRequestDto saveOrganizationRequestDto){
        return new ResponseEntity<>(organizationService.saveOrganization(saveOrganizationRequestDto), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<OrganizationResponseDto>> getOrganizationsByNormalizedName(@RequestParam String normalizedName){
        return new ResponseEntity<>(organizationService.getOrganizationsByNormalizedName(normalizedName),HttpStatus.OK);
    }

    @GetMapping("/retrunAllOrganization")
    public ResponseEntity<List<OrganizationResponseDto>> getAllOrganization(){
        return new ResponseEntity<>(organizationService.getAllOrganization(),HttpStatus.OK);
    }

    @GetMapping("/getAllUsersbyOrganization")
    public ResponseEntity<List<UserResponseDto>> getAllUsersByOrganization(@RequestParam String organizationName){
        return new ResponseEntity<>(organizationService.getAllUsersByOrganization(organizationName),HttpStatus.OK);
    }

    @GetMapping("/getOrganizationByRegisterNumber")
    public ResponseEntity<OrganizationResponseDto> getOrganizationByRegisterNumber(@RequestParam Long registryNumber){
        return new ResponseEntity<>(organizationService.getOrganizationByRegisterNumber(registryNumber),HttpStatus.OK);
    }


}
