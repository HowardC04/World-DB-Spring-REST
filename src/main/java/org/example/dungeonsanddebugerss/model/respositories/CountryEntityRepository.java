package org.example.dungeonsanddebugerss.model.respositories;

import org.example.dungeonsanddebugerss.model.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryEntityRepository extends JpaRepository<CountryEntity, String> {
}