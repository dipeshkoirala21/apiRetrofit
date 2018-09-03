package com.example.dipes.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

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



//        APIInterface Api= retrofit.create(APIInterface.class);
        APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);

        Call<HistoryDetails>  calls = apiInterface.gethistorydetails("S10-1","2018-08-01");


        calls.enqueue(new Callback<HistoryDetails>() {
            @Override
            public void onResponse(Call<HistoryDetails> call, Response<HistoryDetails> response) {


                Log.d("TAG",response.code()+"");

                String displayResponse = "";



            }

            @Override
            public void onFailure(Call<HistoryDetails> call, Throwable t) {

            }


        });







//        Call<ResponseBody> call= Api.getJson("S10-1","2018-08-01");
//           Call<List<HistoryDetails>> call=Api.getJsons();

//  call.enqueue(new Callback<List<HistoryDetails>>() {
//      @Override
//      public void onResponse(Call<List<HistoryDetails>> call, Response<List<HistoryDetails>> response) {
//          List<HistoryDetails> jsonList=response.body();
//
//          if (response.isSuccessful()) {
//              System.out.println(" title: " + jsonList.get(0).getId());
//
//          } else {
//          System.out.println(response.errorBody());
//      }
//
//          for (HistoryDetails j:jsonList){
////              Log.d("userId",j.getUserId());
////              Log.d("id",j.getId());
////              Log.d("title",j.getTitle());
////              Log.d("body",j.getBody());
//              String [] data = new String[jsonList.size()];
//              for(int i=0; i<jsonList.size(); i++){
//                  data[i]=jsonList.get(i).getId();
//                  data[i]=jsonList.get(i).getName();
//                  data[i]=jsonList.get(i).getRoute_id();
//                  data[i]=jsonList.get(i).getStation_id();
//                  data[i]=jsonList.get(i).getStudent_id();
//                  data[i]=jsonList.get(i).getToken();
//                  data[i]=jsonList.get(i).getStudentCheckinCheckout();
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
//      public void onFailure(Call<List<HistoryDetails>> call, Throwable t) {
//            Toast.makeText(getApplicationContext(),t.getMessage(),Toast.LENGTH_SHORT).show();
//      }
//  });

}
}
