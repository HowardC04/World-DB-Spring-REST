package org.example.dungeonsanddebugerss.model.respositories;

import org.example.dungeonsanddebugerss.model.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityEntityRepository extends JpaRepository<CityEntity, Integer> {

    List<CityEntity> findByName(String name);
}