package com.evilcorp.passoffice.application.service.impl;

import com.evilcorp.passoffice.application.adapter.PersonAdapter;
import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;
import com.evilcorp.passoffice.application.service.PersonService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonAdapter personAdapter;

    @Override
    public PersonResponseDto addPerson(PersonRequestDto requestDto) {
        return personAdapter.addPerson(requestDto);
    }

    @Override
    public PersonResponseDto getPersonById(UUID personId) {
        return personAdapter.getPersonById(personId);
    }

    @Override
    public PersonResponseDto getPersonByPassportNum(String passportNum) {
        return personAdapter.getPersonByPassportNum(passportNum);
    }

    @Override
    public void deletePersonById(UUID personId) {
        personAdapter.deletePersonById(personId);
    }

    @Override
    public void deletePersonByPassportNum(String passportNum) {
        personAdapter.deletePersonByPassportNum(passportNum);
    }
}
