package com.heroes.services;

import com.heroes.documents.Hero;
import com.heroes.repositories.HeroRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HeroService {
    private final HeroRepository heroRepository;

    public Flux<Hero> findAll() {
        return heroRepository.findAll();
    }

    public Mono<Hero> findById(String id) {
        return heroRepository.findById(id);
    }

    public Mono<Hero> save(Hero hero) {
        return heroRepository.save(hero);
    }

    public Mono<Void> deleteById(String id) {
        return heroRepository.deleteById(id);
    }
}
