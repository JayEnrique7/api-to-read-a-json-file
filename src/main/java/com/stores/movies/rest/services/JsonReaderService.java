package com.stores.movies.rest.services;
import com.google.gson.Gson;
import com.stores.movies.rest.domain.MovieInfoList;
import com.stores.movies.rest.domain.MovieList;
import com.stores.movies.rest.exceptions.UnexpectedErrorException;

import java.io.*;
import java.util.List;

public abstract class JsonReaderService {
    public MovieList readerFile() {
        Gson gson = new Gson();
        MovieList movieList = new MovieList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/json/movies.json"));
            movieList = gson.fromJson(br, MovieList.class);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        unexpectedErrorMsg(movieList.getMovies());
        return movieList;
    }

    public MovieInfoList readerInfoFile() {
        Gson gson = new Gson();
        MovieInfoList movieInfoList = new MovieInfoList();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/json/movies.json"));
            movieInfoList = gson.fromJson(br, MovieInfoList.class);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
        unexpectedErrorMsg(movieInfoList.getMovieInfo());
        return movieInfoList;
    }

    public void unexpectedErrorMsg(List list) {
        if (list.isEmpty()) {
            throw new UnexpectedErrorException("Unexpected Error");
        }
    }
}
