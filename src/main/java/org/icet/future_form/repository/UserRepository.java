package org.icet.future_form.repository;

import org.icet.future_form.dto.UserDTO;
import org.icet.future_form.entity.User;
import org.icet.future_form.utill.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String username);

    List<User> findByFullName(String fullName);

    List<User> findByBirthday(LocalDate birthday);

    List<User> findByCreateAt(LocalDate createDate);

    List<User> findByUpdateAt(LocalDate updateAt);

    List<User> findByRole(UserRole role);

    List<User> findByIsActive(boolean isActive);

    User findByEmail(String email);

    User findByContactNumber(String contactNumber);
}
