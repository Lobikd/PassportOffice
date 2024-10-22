package com.evilcorp.passoffice.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {

    private UUID id;
    private String name;
    private String surname;
    private String patronymic;
    private String country;
    private String passportNum;

}
