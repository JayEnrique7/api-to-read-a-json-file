package com.stores.movies.rest.domain;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class MovieInfo {
        @SerializedName("Title")
        @Expose
        private String title;

        @SerializedName("Director")
        @Expose
        private String director;

        @SerializedName("Actors")
        @Expose
        private String actors;

        @SerializedName("Plot")
        @Expose
        private String plot;


        public String getTitle() {
        return title;
        }

        public String getDirector() {
        return director;
        }

        public String getActors() {
        return actors;
        }

        public String getPlot() {
        return plot;
        }
}
