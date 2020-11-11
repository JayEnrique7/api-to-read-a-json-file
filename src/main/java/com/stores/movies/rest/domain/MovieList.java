package com.stores.movies.rest.domain;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class MovieList {

    @SerializedName("Movies")
    @Expose
    private List<Movies> movies = new ArrayList<Movies>();

    public List<Movies> getMovies() {
        return movies;
    }

}


