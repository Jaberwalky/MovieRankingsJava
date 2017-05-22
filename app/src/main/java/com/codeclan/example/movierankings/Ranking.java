package com.codeclan.example.movierankings;

import java.util.ArrayList;

/**
 * Created by PaulJablonski on 22/05/2017.
 */

public class Ranking {

    private ArrayList<Movie> rankings;

    public Ranking() {
        this.rankings = new ArrayList<>();
    }


    public ArrayList<Movie> getRankings() {
        return new ArrayList<>(this.rankings);
    }
}
