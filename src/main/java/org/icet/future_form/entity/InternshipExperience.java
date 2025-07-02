package org.icet.future_form.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "InternshipExperiences")
@Entity
public class InternshipExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer internshipExperienceId;
    private String companyName;
    private String position;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;
    private String referenceLetterUrl;
}
