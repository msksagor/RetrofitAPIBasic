package com.msksagor.learnretrofitbasic;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPI {
    @GET("bins/16rw42")
    Call<Example> getAPIResponce();
}
