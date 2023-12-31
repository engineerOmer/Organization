package engineeromer.com.organization.controller;

import engineeromer.com.organization.dto.request.SaveUserRequestDto;
import engineeromer.com.organization.dto.response.OrganizationResponseDto;
import engineeromer.com.organization.dto.response.UserResponseDto;
import engineeromer.com.organization.dto.response.UserStatusInformationDto;
import engineeromer.com.organization.dto.request.UserUpdateRequestDto;
import engineeromer.com.organization.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/user")
public class UserController {

    private final UserService userService;

    @PostMapping("/saveUser")
    public ResponseEntity<UserResponseDto> saveCampaign(@RequestBody SaveUserRequestDto saveUserRequestDto){
        return new ResponseEntity<>(userService.saveUser(saveUserRequestDto), HttpStatus.CREATED);
    }

    @GetMapping("/getStatus")
    public ResponseEntity<UserStatusInformationDto> getUserByStatus(Integer id){
        return new ResponseEntity<>(userService.getStatus(id),HttpStatus.OK);
    }

    @GetMapping("/getByEmail")
    public ResponseEntity<UserResponseDto> getUserByEmail(@RequestParam String email){
        return new ResponseEntity<>(userService.getUserByEmail(email),HttpStatus.OK);
    }

    @GetMapping("/getByNickName")
    public ResponseEntity<UserResponseDto> getUserByNickName(@RequestParam String nickName){
        return new ResponseEntity<>(userService.getUserByNickName(nickName),HttpStatus.OK);
    }

    @PutMapping("/situationUpdate")
    public ResponseEntity<UserResponseDto> situationUpdateUser(@RequestBody UserUpdateRequestDto userUpdateRequestDto){
        return new ResponseEntity<>(userService.changeStatusInformationUser(userUpdateRequestDto),HttpStatus.OK);
    }


    @DeleteMapping("/deleteUser")
    public ResponseEntity<String>  deleteUser(@RequestParam Integer id){
        return new ResponseEntity<>(userService.deleteUser(id),HttpStatus.OK);
    }

    @GetMapping("/usersOrganizations")
    public ResponseEntity<List<OrganizationResponseDto>> getAllOrganizationsByUser(@RequestParam Long userId){
        return new ResponseEntity<>(userService.getAllOrganizationsByUser(userId),HttpStatus.OK);
    }


}
