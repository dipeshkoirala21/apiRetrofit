package com.example.dipes.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dipes on 9/1/2018.
 */

public interface APIInterface {

//    String BASE_URL="http://103.213.31.238/tracker_backend/public/APIInterface/v1/student";

    @GET("all?")
//    Call<ResponseBody> getJson();
    Call<List<HistoryDetails>> getJsons();
//    Call<List<HistoryDetails>> getJsons(@Query("student_id") String student_id,@Query("date") String date);


    @GET("all?")
    Call<HistoryDetails> gethistorydetails(@Query("student_id") String student_id, @Query("date") String date);


}
