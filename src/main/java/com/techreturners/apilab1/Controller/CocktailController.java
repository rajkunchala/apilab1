package com.techreturners.apilab1.Controller;

import com.techreturners.apilab1.Model.Coffee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class CocktailController {

    private final AtomicLong counter = new AtomicLong();

    @GetMapping(value = "/cocktail")
    public Coffee coffee(@RequestParam(value = "name", defaultValue = "Old Fashioned") String name){

        return new Coffee(counter.incrementAndGet(), name);

    }
}
