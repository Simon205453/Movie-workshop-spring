package com.example.movieworkshoptemplate.repositories;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class MovieDataRepository {
public ArrayList<String[]> moviesList = new ArrayList<>();
    public void movieLoader() {
        File f = new File("resources/imdb-data.csv");
        try {
            Scanner sc = new Scanner(f);
            sc.nextLine();
            while(sc.hasNext()){
                String line = sc.nextLine();
                System.out.println(line);
                String[] lineSplit = line.split(";");
                moviesList.add(lineSplit);
            }
        } catch (Exception e) {
        }
    }
    //Methods to get data from file
}
