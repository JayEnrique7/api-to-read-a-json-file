package com.stores.movies.rest.services;

import com.stores.movies.rest.domain.MovieInfo;
import com.stores.movies.rest.domain.MovieList;
import com.stores.movies.rest.domain.Movies;
import com.stores.movies.rest.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class MoviesService extends JsonReaderService {

    @Override
    public MovieList readerFile() {
        return super.readerFile();
    }

    public String searchingData (String value) {
        return "\\b(" + value.toLowerCase() + ")\\b";
    }

    public List<String> getTitles() {
        List<String> titles = new ArrayList<>();
        for (Movies movies : readerFile().getMovies()) {
            titles.add(movies.getTitle());
        }
        unexpectedErrorMsg(titles);
        return titles;
    }

    public List<Movies> getMovieLanguages(String language) {
        List <Movies> movieList = new ArrayList<>();
        for (Movies movies : readerFile().getMovies()) {
            if (movies.getLanguage().toLowerCase().matches(searchingData(language))) {
                movieList.add(movies);
            }
        }
        resourceNotFoundErrorMsg(movieList, language);
        return movieList;
    }

    public List<MovieInfo> getInfoMovies(String title) {
        List <MovieInfo> movieList = new ArrayList<>();
        for (MovieInfo movieInfo : readerInfoFile().getMovieInfo()) {
            if (movieInfo.getTitle().toLowerCase().matches(searchingData(title))) {
                movieList.add(movieInfo);
            }
        }
        resourceNotFoundErrorMsg(movieList, title);
        return movieList;
    }

    public List<Movies> getSingleMovie(String title) {
        List <Movies> movieList = new ArrayList<>();
        for (Movies movies : readerFile().getMovies()) {
            if (movies.getTitle().toLowerCase().matches(searchingData(title))) {
                movieList.add(movies);
            }
        }
        resourceNotFoundErrorMsg(movieList, title);
        return movieList;
    }

    private void resourceNotFoundErrorMsg(List list, String searching) {
        if (list.isEmpty()) {
            throw new ResourceNotFoundException("The data " + searching + " does not found");
        }
    }
}
