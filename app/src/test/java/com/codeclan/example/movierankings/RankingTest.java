package com.codeclan.example.movierankings;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;



/**
 * Created by PaulJablonski on 22/05/2017.
 */
public class RankingTest {

    @Test
    public void canAddMovie(){
        Ranking rankingList = new Ranking();
        Movie movie1 = new Movie("Requiem for a Dream", "Drama", 1);
        rankingList.addMovie(movie1);
        assertEquals(1, rankingList.getNumberOfMovies());
    }

    @Test
    public void canGetMovieByRanking(){
        Ranking rankingList = new Ranking();
        Movie movie1 = new Movie("Requiem for a Dream", "Drama", 1);
        Movie movie2 = new Movie("American Beauty", "Drama", 2);
        Movie movie3 = new Movie("Fight Club", "Action", 3);
        rankingList.addMovie(movie1);
        rankingList.addMovie(movie2);
        rankingList.addMovie(movie3);
        Movie returnedMovie = rankingList.getMovieByRanking(2);
        assertEquals(3, rankingList.getNumberOfMovies());
        assertEquals(movie2, returnedMovie);
    }

    @Test
    public void canReplaceMovieAtEndOfList() {
        Ranking rankingList = new Ranking();
        Movie movie1 = new Movie("Requiem for a Dream", "Drama", 1);
        Movie movie2 = new Movie("American Beauty", "Drama", 2);
        Movie movie3 = new Movie("Fight Club", "Action", 3);
        rankingList.addMovie(movie1);
        rankingList.addMovie(movie2);
        rankingList.addMovie(movie3);
        rankingList.replaceMovieAtEnd(movie1);
        assertEquals(movie1, rankingList.getMovieByRanking(3));
    }

    @Test
    public void canFindMovieByTitle(){
        Ranking rankingList = new Ranking();
        Movie movie1 = new Movie("Requiem for a Dream", "Drama", 1);
        Movie movie2 = new Movie("American Beauty", "Drama", 2);
        Movie movie3 = new Movie("Fight Club", "Action", 3);
        rankingList.addMovie(movie1);
        rankingList.addMovie(movie2);
        rankingList.addMovie(movie3);
        assertEquals(movie2, rankingList.findMovieByTitle("American Beauty"));
    }

}