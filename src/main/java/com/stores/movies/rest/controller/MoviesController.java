package com.stores.movies.rest.controller;

import com.stores.movies.rest.constants.UrlConstants;
import com.stores.movies.rest.controller.api.BaseControllerApi;
import com.stores.movies.rest.domain.MovieInfo;
import com.stores.movies.rest.domain.Movies;
import com.stores.movies.rest.services.MoviesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class MoviesController extends BaseControllerApi<MoviesService> implements UrlConstants {

    public MoviesController(MoviesService moviesService) {
        super(moviesService);
    }

    @GetMapping(MOVIES_TITLE_LIST_PATH)
    public List<String> restGetListMovieTitle() {
        return getService().getTitles();
    }

    @GetMapping(MOVIE_PATH)
    public List<Movies> restGetSingleMovie(@PathVariable(value = TITLE) @NotNull String title) {
        return getService().getSingleMovie(title);
    }

    @GetMapping(MOVIE_LANGUAGE_PATH)
    public List<Movies> restGetLanguageMovie(@PathVariable(value = LANGUAGE) @NotNull String language) {
        return getService().getMovieLanguages(language);
    }

    @GetMapping(MOVIE_INFO_PATH)
    public List<MovieInfo> restGetInfo(@PathVariable(value = INFO) @NotNull String info) {
        return getService().getInfoMovies(info);
    }
}
