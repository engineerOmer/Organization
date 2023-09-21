package engineeromer.com.organization.controller;

import engineeromer.com.organization.dto.SaveUserRequestDto;
import engineeromer.com.organization.dto.UserResponseDto;
import engineeromer.com.organization.dto.UserStatusInformationDto;
import engineeromer.com.organization.dto.UserUpdateRequestDto;
import engineeromer.com.organization.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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


}
