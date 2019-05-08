package com.example.retrofitxml;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Api {
    @GET("./")
    Call<Arfolyamok> getArfolyamok(@Query("valuta") String valuta, @Query("valutanem") String valutanem);
}
