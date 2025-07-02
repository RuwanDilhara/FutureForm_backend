package org.icet.future_form.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String username;
    private String fullName;
    private String contactNumber;
    private String email;
    private String profileUrl;
    private String coverImageUrl;
    private UserRole role;
    private LocalDate birthday;

    @JsonIgnore
    private String password;

    private LocalDate createAt;
    private LocalDate updateAt;
    private boolean isActive;
    private String country;
    private String city;
    private String address;

}
