package com.evilcorp.passoffice.application.mapper;

import com.evilcorp.passoffice.api.dto.PersonDto;
import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;
import com.evilcorp.passoffice.application.entity.PersonEntity;
import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PersonControllerMapper {

    PersonDto toPerson(PersonResponseDto personDto);

    @BeanMapping(ignoreByDefault = true, nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePersonRequest(@MappingTarget PersonRequestDto personRequestDto, PersonRequestDto updateRequestDto);

    void overwritingPersonRequest(@MappingTarget PersonRequestDto personRequestDto, PersonRequestDto updateRequestDto);
}
