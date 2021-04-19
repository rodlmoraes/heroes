package com.heroes.repositories;

import com.heroes.documents.Hero;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface HeroRepository extends ReactiveMongoRepository<Hero, String> {
}
