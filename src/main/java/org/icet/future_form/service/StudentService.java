package org.icet.future_form.service;

import org.icet.future_form.dto.StudentDTO;

import java.util.List;

public interface StudentService {
    List<StudentDTO> getAllStudent();
    StudentDTO getStudentById(Integer studentId);
    List<StudentDTO> getStudentUniversity(String university);
    List<StudentDTO> getStudentFaculty(String faculty);
    List<StudentDTO> getStudentDegreeProgram(String degreeProgram);

}
