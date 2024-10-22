package com.evilcorp.passoffice.application.controller;

import com.evilcorp.passoffice.api.dto.PersonDto;
import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;
import com.evilcorp.passoffice.application.mapper.PersonControllerMapper;
import com.evilcorp.passoffice.application.service.PersonService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
public class PersonController {

    private final PersonControllerMapper mapper;
    private final PersonService personService;

    @PostMapping("/add-person")
    public UUID addPerson(@RequestBody @Valid PersonRequestDto requestDto) {
        return personService.addPerson(requestDto).getId();
    }

    @GetMapping("/get/{personId}")
    public PersonDto getPersonById(@PathVariable UUID personId) {
        PersonResponseDto person = personService.getPersonById(personId);
        return mapper.toPerson(person);
    }

    @GetMapping("/get/{passportNum}")
    public PersonDto getPersonByPassportNum(@PathVariable String passportNum) {
        PersonResponseDto person = personService.getPersonByPassportNum(passportNum);
        return mapper.toPerson(person);
    }

    @DeleteMapping("/delete/{personId}")
    public void deletePersonById(@PathVariable UUID personId) {
        personService.deletePersonById(personId);
    }

    @DeleteMapping("/delete/{passportNum}")
    public void deletePersonByPassportNum(@PathVariable String passportNum) {
        personService.deletePersonByPassportNum(passportNum);
    }

    @PatchMapping(value = "/update/{personId}")
    public UUID updatePerson(@PathVariable UUID personId,
                             @RequestBody @Valid PersonRequestDto updateRequestDto) {
//        PersonRequestDto personRequestDto = repository.findById(personId)
//                .orElseThrow(() -> new DataNotFoundException("Person with personId = " + personId + " not found"));
//        repository.delete(personRequestDto);
//        mapper.updatePersonRequest(personRequestDto, updateRequestDto);
//        PersonRequestDto updatePerson = repository.save(personRequestDto);
//        return updatePerson.getId();
        return null;
    }

    @PostMapping(value = "/overwriting/{personId}")
    public UUID overwritingPerson(@PathVariable UUID personId,
                                  @RequestBody @Valid PersonRequestDto overwritingRequestDto) {
//        PersonRequestDto personRequestDto = repository.findById(personId)
//                .orElseThrow(() -> new DataNotFoundException("Person with personId = " + personId + " not found"));
//        repository.delete(personRequestDto);
//        mapper.overwritingPersonRequest(personRequestDto, overwritingRequestDto);
//        PersonRequestDto overwritingPerson = repository.save(personRequestDto);
//        return overwritingPerson.getId();
        return null;
    }
}