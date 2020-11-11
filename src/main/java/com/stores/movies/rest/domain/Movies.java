package com.stores.movies.rest.domain;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Movies {

    @SerializedName("Title")
    @Expose
    private String title;

    @SerializedName("Year")
    @Expose
    private int year;

    @SerializedName("Rated")
    @Expose
    private String rated;

    @SerializedName("Released")
    @Expose
    private String released;

    @SerializedName("Runtime")
    @Expose
    private String runtime;

    @SerializedName("Genre")
    @Expose
    private String genre;

    @SerializedName("Director")
    @Expose
    private String director;

    @SerializedName("Writer")
    @Expose
    private String writer;

    @SerializedName("Actors")
    @Expose
    private String actors;

    @SerializedName("Plot")
    @Expose
    private String plot;

    @SerializedName("Language")
    @Expose
    private String language;

    @SerializedName("Country")
    @Expose
    private String country;

    @SerializedName("Awards")
    @Expose
    private String awards;

    @SerializedName("Poster")
    @Expose
    private String poster;

    @SerializedName("Metascore")
    @Expose
    private String metaScore;

    @SerializedName("imdbRating")
    @Expose
    private double imdbRating;

    @SerializedName("imdbVotes")
    @Expose
    private int imdbVotes;

    @SerializedName("imdbID")
    @Expose
    private String imdbID;

    @SerializedName("Type")
    @Expose
    private String type;

    @SerializedName("Response")
    @Expose
    private boolean response;


    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getReleased() {
        return released;
    }

    public String getRuntime() {
        return runtime;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public String getWriter() {
        return writer;
    }

    public String getActors() {
        return actors;
    }

    public String getPlot() {
        return plot;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    public String getAwards() {
        return awards;
    }

    public String getPoster() {
        return poster;
    }

    public String getMetaScore() {
        return metaScore;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public int getImdbVotes() {
        return imdbVotes;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return type;
    }

    public boolean getResponse() {
        return response;
    }

}
