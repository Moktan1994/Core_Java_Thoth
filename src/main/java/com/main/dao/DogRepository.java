package com.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.entities.DogEntity;

@Repository
public interface DogRepository extends JpaRepository<DogEntity, Integer>{

}
