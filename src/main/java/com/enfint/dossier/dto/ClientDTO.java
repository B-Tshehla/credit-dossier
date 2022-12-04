package com.enfint.dossier.dto;

import com.enfint.dossier.dataEnum.Gender;
import com.enfint.dossier.dataEnum.MaritalStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {

    private Long id;
    private String lastName;
    private String firstName;
    private String middleName;
    private LocalDate birthDate;
    private String email;
    private Gender gender;
    private MaritalStatus maritalStatus;
    private Integer dependentNumber;
    private Passport passport;
    private EmploymentDTO employment;
    private String account;


}
