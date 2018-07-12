package com.chamas.lalbertorio.cine.Network;

import com.chamas.lalbertorio.cine.Model.RetroMovies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GetDataService {

    @GET("theater/{th}")
    Call<List<RetroMovies>> listRepos(@Path("th") String theater);

//    @GET("users/{user}/repos")
//    Call<List<Repo>> listRepos(@Path("user") String user);

}
