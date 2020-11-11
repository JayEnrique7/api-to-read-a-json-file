package com.stores.movies.rest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class MovieInfoList {

        @SerializedName("Movies")
        @Expose
        private List<MovieInfo> moviesInfo = new ArrayList<MovieInfo>();

        public List<MovieInfo> getMovieInfo() {
            return moviesInfo;
        }
}
