package com.codeclan.example.movierankings;

/**
 * Created by PaulJablonski on 22/05/2017.
 */

public class Movie {

    private String title;
    private String genre;
    private int ranking;

    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getRanking() {
        return this.ranking;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }

    public void setRanking(int newRanking) {
        this.ranking = newRanking;
    }

    @Override
    public String toString(){
        return "Movie : " + this.title +", Genre : " + this.genre + ", Ranking : " + this.ranking;
    }
}
