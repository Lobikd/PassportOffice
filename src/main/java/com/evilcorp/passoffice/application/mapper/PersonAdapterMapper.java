package com.evilcorp.passoffice.application.mapper;

import com.evilcorp.passoffice.application.dto.PersonRequestDto;
import com.evilcorp.passoffice.application.dto.PersonResponseDto;
import com.evilcorp.passoffice.application.entity.PersonEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.ERROR,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface PersonAdapterMapper {

    PersonEntity personRequestDtoToPersonEntity(PersonRequestDto personDto);

    PersonResponseDto personEntityToPersonResponseDto(PersonEntity personEntity);

}
