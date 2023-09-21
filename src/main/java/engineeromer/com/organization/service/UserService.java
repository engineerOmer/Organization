package engineeromer.com.organization.service;

import engineeromer.com.organization.dto.SaveUserRequestDto;
import engineeromer.com.organization.dto.UserResponseDto;
import engineeromer.com.organization.dto.UserStatusInformationDto;
import engineeromer.com.organization.dto.UserUpdateRequestDto;
import engineeromer.com.organization.model.Status;
import engineeromer.com.organization.model.User;
import engineeromer.com.organization.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public UserResponseDto saveUser(SaveUserRequestDto saveUserRequestDto) {
        User user = modelMapper.map(saveUserRequestDto,User.class);
        userRepository.save(user);
        return modelMapper.map(user,UserResponseDto.class);
    }

    public UserStatusInformationDto getStatus(int id) {
       User user = userRepository.findById(id).orElseThrow();
        return modelMapper.map(user,UserStatusInformationDto.class);
    }

    public UserResponseDto getUserByEmail(String email){
        User user = userRepository.findByEmail(email);
        return modelMapper.map(user,UserResponseDto.class);
    }

    public UserResponseDto getUserByNickName(String nickName){
        User user = userRepository.findByEmail(nickName);
        return modelMapper.map(user,UserResponseDto.class);
    }

    public UserResponseDto changeStatusInformationUser(UserUpdateRequestDto userUpdateRequestDto) {
        int id = userUpdateRequestDto.getId();
        Status status = userUpdateRequestDto.getStatus();
        User user = userRepository.findById(id).orElseThrow();
        user.setStatus(status);
        return modelMapper.map(userRepository.save(user), UserResponseDto.class);
    }

    public String deleteUser(int id) {
        userRepository.findById(id).orElseThrow();
        userRepository.deleteById(id);
        return "kullanici silindi";
    }
}
