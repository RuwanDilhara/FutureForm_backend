package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AdminDTO {
    private Integer adminId;
    private String designation;
//    private AdminRole adminRole;
}
