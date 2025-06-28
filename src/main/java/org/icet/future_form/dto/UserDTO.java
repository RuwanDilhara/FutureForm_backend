package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.icet.future_form.utill.enums.UserRole;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserDTO {
    private Integer userId;
    private String userName;
    private String fullName;
    private String contact;
    private String email;
    private UserRole role;
    private String password;
    private LocalDate createAt;
    private LocalDate updateAt;
}
