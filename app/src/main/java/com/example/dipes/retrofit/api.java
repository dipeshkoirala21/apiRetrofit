package com.example.dipes.retrofit;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by dipes on 9/1/2018.
 */

public interface api {

    String BASE_URL="http://103.213.31.238/tracker_backend/public/api/v1/student/";

    @GET("all?student_id=S10-1&date=2018-08-01/")
    Call<ResponseBody> getJson();
//    Call<List<Json>> getJsons();



}
