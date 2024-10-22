package com.evilcorp.passoffice.application.adapter.impl;

import com.evilcorp.passoffice.application.adapter.PersonAdapter;
import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;
import com.evilcorp.passoffice.application.entity.PersonEntity;
import com.evilcorp.passoffice.application.exception.DataNotFoundException;
import com.evilcorp.passoffice.application.mapper.PersonAdapterMapper;
import com.evilcorp.passoffice.application.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class PersonAdapterImpl implements PersonAdapter {

    private final PersonRepository repository;
    private final PersonAdapterMapper mapper;

    @Override
    public PersonResponseDto addPerson(PersonRequestDto requestDto) {
        PersonEntity personEntity = mapper.personRequestDtoToPersonEntity(requestDto);
        PersonEntity personResponseDto = repository.save(personEntity);
        return mapper.personEntityToPersonResponseDto(personResponseDto);
    }

    @Override
    public PersonResponseDto getPersonById(UUID personId) {
        PersonEntity person = repository.findById(personId)
                .orElseThrow(() -> new DataNotFoundException("Person with personId = " + personId + " not found"));
        return mapper.personEntityToPersonResponseDto(person);
    }

    @Override
    public PersonResponseDto getPersonByPassportNum(String passportNum) {
        PersonEntity person = repository.findByPassportNum(passportNum)
                .orElseThrow(() -> new DataNotFoundException("Person with passport number = " + passportNum + " not found"));
        return mapper.personEntityToPersonResponseDto(person);
    }

    @Override
    public void deletePersonById(UUID personId) {
        PersonEntity deletePerson = repository.findById(personId)
                .orElseThrow(() -> new DataNotFoundException("Person with personId = " + personId + " not found"));
        repository.delete(deletePerson);
    }

    @Override
    public void deletePersonByPassportNum(String passportNum) {
        PersonEntity deletePerson = repository.findByPassportNum(passportNum)
                .orElseThrow(() -> new DataNotFoundException("Person with passport number = " + passportNum + " not found"));
        repository.delete(deletePerson);
    }
}
