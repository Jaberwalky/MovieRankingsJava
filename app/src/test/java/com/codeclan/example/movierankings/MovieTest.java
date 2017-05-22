package com.codeclan.example.movierankings;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by PaulJablonski on 22/05/2017.
 */
public class MovieTest {

    @Test
    public void canGetTitle(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        assertEquals("Requiem For A Dream", movie.getTitle());
    }

    @Test
    public void canSetTitle(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        movie.setTitle("Requiem for a Dream");
        assertEquals("Requiem for a Dream", movie.getTitle());
    }

    @Test
    public void canGetGenre(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        assertEquals("Drama", movie.getGenre());
    }

    @Test
    public void canSetGenre(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        movie.setGenre("Horror");
        assertEquals("Horror", movie.getGenre());
    }

    @Test
    public void canGetRanking(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetRanking(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        movie.setRanking(5);
        assertEquals(5, movie.getRanking());
    }

    @Test
    public void canReturnToString(){
        Movie movie = new Movie("Requiem For A Dream", "Drama", 1);
        assertEquals("Movie : Requiem For A Dream, Genre : Drama, Ranking : 1", movie.toString());
    }

}