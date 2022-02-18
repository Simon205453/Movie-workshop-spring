package com.example.movieworkshoptemplate.controllers;

import com.example.movieworkshoptemplate.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    //Controller methods
    MovieService service = new MovieService();
    @GetMapping("/")
    public String index(){
        return "Hello World welcome to my application";
    }

    @GetMapping("/getFirst")
    public String getFirst(){
        return service.getFirstTitle();
    }

    @GetMapping("/getRandom")
    public String getRandom(){
        return service.getRandomTitle();
    }
    @GetMapping("/getTenSortByPopularity")
    public String getTenSortByPopularity(){
        return service.getTenSortByPopularity();
    }
}
