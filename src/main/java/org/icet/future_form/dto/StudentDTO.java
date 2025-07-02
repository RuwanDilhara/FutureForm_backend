package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDTO {
    private Integer studentID;
    // Academic Info
    private String university;
    private String faculty;
    private String degreeProgram;
    private int academicYear;
    private double gpa;

    // Skills & Preferences
    private List<String> technicalSkills;
    private List<String> softSkills;
    private List<String> preferredIndustries;
    private List<String> languages;

    // Portfolio
    private String cvUrl;
    private String githubUrl;
    private String linkedInUrl;

    // Past Internship Experience
    private List<InternshipExperienceDTO> pastInternships;

    private List<String> certifications;
    private List<String> achievements;
}