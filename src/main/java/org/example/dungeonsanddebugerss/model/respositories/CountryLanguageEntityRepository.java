package org.example.dungeonsanddebugerss.model.respositories;

import org.example.dungeonsanddebugerss.model.entities.CountryLanguageEntity;
import org.example.dungeonsanddebugerss.model.entities.CountryLanguageEntityId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryLanguageEntityRepository extends JpaRepository<CountryLanguageEntity, CountryLanguageEntityId> {
}