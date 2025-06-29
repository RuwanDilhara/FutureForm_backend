package org.icet.future_form.entity;

import jakarta.persistence.*;
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
@Table(name = "users")
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;
    private String fullName;
    private String contactNumber;
    private String email;
    private UserRole role;
    private LocalDate birthday;

    @Transient
    private String password;

    private LocalDate createAt;
    private LocalDate updateAt;
    private boolean isActive;
    private String country;
}
