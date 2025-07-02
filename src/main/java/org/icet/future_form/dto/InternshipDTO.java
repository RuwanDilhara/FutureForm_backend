package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class InternshipDTO {
    private Integer internshipId;
    private String title;
    private String description;
    private String location;
    private LocalDate postedDate;
    private LocalDate deadline;
    private boolean isOpen;
}