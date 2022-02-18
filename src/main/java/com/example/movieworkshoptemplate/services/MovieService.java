package com.example.movieworkshoptemplate.services;

import com.example.movieworkshoptemplate.models.Movie;
import com.example.movieworkshoptemplate.repositories.MovieDataRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class MovieService {
    //Services called from controllers that returns what the client requests
    MovieDataRepository movies = new MovieDataRepository();
    public String getFirstTitle(){
        movies.movieLoader();
        String getFirst = getMovie(movies.moviesList.get(0)).getTilte();
        return getFirst;
    }
    public String getRandomTitle(){
        Random rand = new Random();
        movies.movieLoader();
        int randomInt = rand.nextInt(movies.moviesList.size());
        String getRandom = getMovie(movies.moviesList.get(randomInt)).getTilte();
        return getRandom;
    }
    public String getTenSortByPopularity(){
        movies.movieLoader();
        Random rand = new Random();
        ArrayList<Movie> movieArr = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            int tempint = rand.nextInt(movieArr.size());
            movieArr.add(getMovie(movies.moviesList.get(tempint)));
        }
        Collections.sort(movieArr);
        String output = "";
        for (int i = 0; i < 10; i++) {
            output += "<b>Popularity: </b>" + movieArr.get(i).getTilte();
            output += "<b> Title: </b>" + movieArr.get(i).getTilte();
            output += "<br>";
        }
        return output;
    }

    private static Movie getMovie(String[] movieString){
        int year = Integer.parseInt(movieString[0]);
        int lenght = Integer.parseInt(movieString[1]);
        String title = movieString[2];
        String subject = movieString[3];
        int popularity = Integer.parseInt(movieString[4]);
        boolean hasAward = movieString[5].equalsIgnoreCase("yes") ? true : false;
        Movie movie = new Movie(year, lenght, title, subject, popularity, hasAward);
        return movie;
    }
}
