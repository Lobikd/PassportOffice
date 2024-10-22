package com.evilcorp.passoffice.application.repository;

import com.evilcorp.passoffice.application.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface PersonRepository extends JpaRepository<PersonEntity, UUID> {

    Optional<PersonEntity> findByPassportNum(String passportNum);

}
