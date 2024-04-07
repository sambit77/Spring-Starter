package com.project.starter.repository;

import com.project.starter.data.GreetingsEntity;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface GreetingsRepository extends MongoRepository<GreetingsEntity, String> {
  GreetingsEntity findByExtId(String extId);
  
}
