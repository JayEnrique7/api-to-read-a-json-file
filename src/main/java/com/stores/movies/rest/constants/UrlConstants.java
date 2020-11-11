package com.stores.movies.rest.constants;

public interface UrlConstants {
    String SLASH = "/";
    String OPEN_BRACE = "{";
    String CLOSE_BRACE = "}";

    String MOVIES = "movies";
    String MOVIE = "movie";
    String TITLE_LIST = "title-list";
    String TITLE = "title";
    String LANGUAGE = "language";
    String INFO = "info";

    String MOVIES_TITLE_LIST_PATH = SLASH + MOVIES + SLASH + TITLE_LIST;
    String MOVIE_PATH = SLASH + MOVIE + SLASH + OPEN_BRACE + TITLE + CLOSE_BRACE;
    String MOVIE_LANGUAGE_PATH = SLASH + LANGUAGE + SLASH + OPEN_BRACE + LANGUAGE + CLOSE_BRACE;
    String MOVIE_INFO_PATH = SLASH + INFO + SLASH + OPEN_BRACE + INFO + CLOSE_BRACE;
}
