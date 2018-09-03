package com.example.dipes.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView=findViewById(R.id.list_view);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(api.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api Api= retrofit.create(api.class);

        Call<ResponseBody> call= Api.getJson();
//            Call<List<Json>> call=Api.getJsons();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                Log.d("response",response.toString());
//                String Response=response.toString();
                System.out.println(response +"");



            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
            }
        });
//  call.enqueue(new Callback<List<Json>>() {
//      @Override
//      public void onResponse(Call<List<Json>> call, Response<List<Json>> response) {
//          System.out.println(response);
//          List<Json> jsons=response.body();
//
//          for (Json j:jsons){
////              Log.d("userId",j.getUserId());
////              Log.d("id",j.getId());
////              Log.d("title",j.getTitle());
////              Log.d("body",j.getBody());
//              String [] data = new String[jsons.size()];
//              for(int i=0; i<jsons.size(); i++){
//                  data[i]=jsons.get(i).getId();
//                  data[i]=jsons.get(i).getName();
//                  data[i]=jsons.get(i).getRoute_id();
//                  data[i]=jsons.get(i).getStation_id();
//                  data[i]=jsons.get(i).getStudent_id();
//                  data[i]=jsons.get(i).getToken();
//                  data[i]=jsons.get(i).getStudentCheckinCheckout();
//
//
//              }
//              listView.setAdapter(
//                     new ArrayAdapter<String>(
//                             getApplicationContext(),
//                             android.R.layout.simple_list_item_1,
//                             data
//
//                     )
//              );
//
//              }
//
//              }
//
//
//      @Override
//      public void onFailure(Call<List<Json>> call, Throwable t) {
//            Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
//      }
//  });

}
}
