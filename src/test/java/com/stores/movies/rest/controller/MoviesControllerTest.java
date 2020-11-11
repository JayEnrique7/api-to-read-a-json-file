package com.stores.movies.rest.controller;

import com.stores.movies.rest.services.MoviesService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.SpyBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@RunWith(SpringJUnit4ClassRunner.class)
public class MoviesControllerTest {

    @SpyBean
    MoviesController moviesController;

    @MockBean
    MoviesService moviesService;

    @Test
    public void TestRestGet() {
        List<String> movieListTest = new ArrayList<>();

        movieListTest.add("batman");
        movieListTest.add("Indiana jones");
        movieListTest.add("Dragon Ball Z");
        movieListTest.add("Zoolander");

        when(moviesService.getTitles()).thenReturn(movieListTest);

        assertNotNull(moviesController.restGetListMovieTitle());
        assertEquals(4, moviesController.restGetListMovieTitle().size());
    }
}
