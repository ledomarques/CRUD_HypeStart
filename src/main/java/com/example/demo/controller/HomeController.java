package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import static com.example.demo.util.Constants.PAGINA_INICIAL;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public Mono<String> homePage() { return Mono.just(PAGINA_INICIAL); }
}
