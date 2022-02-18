package com.example.movieworkshoptemplate.models;

//Movie POJO
public class Movie implements Comparable<Movie>{
    private int year;
    private int lenght;
    private String tilte;
    private String subject;
    private int popularity;
    private boolean hasAward;

    public Movie(int year, int lenght, String tilte, String subject, int popularity, boolean hasAward) {
        this.year = year;
        this.lenght = lenght;
        this.tilte = tilte;
        this.subject = subject;
        this.popularity = popularity;
        this.hasAward = hasAward;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", lenght=" + lenght +
                ", tilte='" + tilte + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", hasAward=" + hasAward +
                '}';
    }

    public int getYear() {
        return year;
    }

    public int getLenght() {
        return lenght;
    }

    public String getTilte() {
        return tilte;
    }

    public String getSubject() {
        return subject;
    }

    public int getPopularity() {
        return popularity;
    }

    public boolean isHasAward() {
        return hasAward;
    }

    @Override
    public int compareTo(Movie o) {
        return this.popularity - o.popularity;
    }
}
