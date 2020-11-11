package com.stores.movies.rest.services;

import com.stores.movies.rest.domain.MovieInfo;
import com.stores.movies.rest.exceptions.ResourceNotFoundException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class MoviesServiceTest extends JsonReaderService {

    @SpyBean
    MoviesService moviesService;

    public void testGetTitles() {
        assertEquals(22, moviesService.getTitles().size());
    }

    @Test(expected = ResourceNotFoundException.class)
    public void testLanguage() {
        moviesService.getMovieLanguages("Swedish");
    }

    @Test
    public void testMovies() {
        List<MovieInfo> movieInfoListTest = moviesService.getInfoMovies("Avatar");
        assertEquals(1, movieInfoListTest.size());
    }

    @Test(expected = ResourceNotFoundException.class)
    public void testMoviesFail() {
        moviesService.getInfoMovies("Robocop");
    }
}
