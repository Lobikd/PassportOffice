package com.evilcorp.passoffice.application.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class PersonRequestDto {

    private UUID id;
    private String name;
    private String surname;
    private String patronymic;
    private String country;
    private String passportNum;

}
