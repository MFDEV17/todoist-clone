package com.mfdev.api.core.service.user;

import com.mfdev.api.core.dto.user.CreateUserDto;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<String> createUser(CreateUserDto dto);

    ResponseEntity<String> deleteUserByUsername(String username);

    ResponseEntity<String> deleteUserById(Long id);

    ResponseEntity<String> updateUsername(String newUsername);;

    ResponseEntity<String> updatePassword(String oldPassword, String newPassword);

    ResponseEntity<String> updateEmail(String newEmail);
}
