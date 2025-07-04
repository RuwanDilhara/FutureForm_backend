package org.icet.future_form.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "companies")
@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer companyId;
    private String companyName;
    private String contactPersonName;
    private String websiteUrl;
    private String linkedInUrl;
    private String industry;
    private String companySize;
    private String description;
}
