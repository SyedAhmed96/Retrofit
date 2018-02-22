package com.example.ahmed.retrofit.rest;

/**
 * Created by Ahmed on 2/21/2018.
 */

import retrofit2.Call;
import com.example.ahmed.retrofit.model.MoviesResponse;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {
    @GET("movie/top_rated")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);

    @GET("movie/{id}")
    Call<MoviesResponse> getMovieDetails(@Path("id") int id, @Query("api_key") String apiKey);
}