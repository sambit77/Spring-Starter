package com.project.starter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.starter.data.GreetingsEntity;

public interface GreetingsRepository extends MongoRepository<GreetingsEntity, String> {
  GreetingsEntity findByExtId(String extId);
  
}
