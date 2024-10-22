package com.evilcorp.passoffice.application.service;

import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;

import java.util.UUID;

public interface PersonService {

    PersonResponseDto addPerson(PersonRequestDto requestDto);

    PersonResponseDto getPersonById(UUID personId);

    PersonResponseDto getPersonByPassportNum(String passportNum);

    void deletePersonById(UUID personId);

    void deletePersonByPassportNum(String passportNum);

}
