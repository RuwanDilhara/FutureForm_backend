package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.icet.future_form.utill.enums.Gender;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private Integer studentId;
    private String firstName;
    private String lastName;
    private String country;
    private String address;
    private String contact;
    private String email;
    private Gender gender;
}