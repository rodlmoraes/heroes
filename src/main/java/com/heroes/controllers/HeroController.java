package com.heroes.controllers;

import com.heroes.documents.Hero;
import com.heroes.services.HeroService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/v1/heroes")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class HeroController {
    private final HeroService heroService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Hero> save(@RequestBody Hero hero) {
        return heroService.save(hero);
    }

    @GetMapping
    public Flux<Hero> findAll() {
        return heroService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Hero> findById(@PathVariable String id) {
        return heroService.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> deleteById(@PathVariable String id) {
        return heroService.deleteById(id);
    }
}
