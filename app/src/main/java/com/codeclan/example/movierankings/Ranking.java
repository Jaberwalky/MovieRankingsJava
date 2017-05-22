package com.codeclan.example.movierankings;

import java.util.ArrayList;

/**
 * Created by PaulJablonski on 22/05/2017.
 */

public class Ranking {

    private ArrayList<Movie> rankings;

    public Ranking(){
        this.rankings = new ArrayList<Movie>();
    }


    public void addMovie(Movie movie) {
        this.rankings.add(movie);
    }

    public int getNumberOfMovies() {
        return this.rankings.size();
    }

    public Movie getMovieByRanking(int i) {
        return rankings.get(i - 1);
    }

    public void replaceMovieAtEnd(Movie movie) {
        int index = this.getNumberOfMovies() - 1;
        this.rankings.set(index, movie);
    }


    public Movie findMovieByTitle(String title) {
        Movie foundMovie = null;
        for (Movie movie : this.rankings) {
            if (movie.getTitle() == title) {
                foundMovie = movie;
            }
        }
        return foundMovie;
    }


}
