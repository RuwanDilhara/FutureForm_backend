package org.icet.future_form.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CompanyDTO {
    private Integer companyId;
    private String companyName;
    private String contactPersonName;
    private String websiteUrl;
    private String linkedInUrl;
    private String industry;
    private String companySize;
    private String description;
}
