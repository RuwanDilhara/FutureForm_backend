package org.icet.future_form.service;

import org.icet.future_form.dto.UserDTO;
import org.icet.future_form.utill.enums.UserRole;

import java.time.LocalDate;
import java.util.List;

public interface UserService {
    List<UserDTO>getAll();
    UserDTO getUserById(Integer userId);
    UserDTO getUserByUserName(String userName);
    List<UserDTO> getUsersByName(String fullName);
    List<UserDTO> getUsersByBirthDay(LocalDate birthday);
    List<UserDTO> getUsersByCreateAt(LocalDate createDate);
    List<UserDTO> getUsersByUpdateAt(LocalDate updateAt);
    List<UserDTO> getUsersByRole(UserRole role);
    List<UserDTO> getUsersByActiveStatus(boolean isActive);
    UserDTO getUserByEmail(String email);
    UserDTO getUserByContactNumber(String contactNumber);
    UserDTO createUser(UserDTO user);
    UserDTO updateUser(UserDTO user);
    boolean deleteUserById(Integer userId);

}
