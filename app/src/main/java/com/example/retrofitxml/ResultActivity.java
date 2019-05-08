package com.example.retrofitxml;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ResultActivity extends AppCompatActivity {

    List<Item> mItems = new ArrayList<>();
    public String queryValuta;
    public String queryValutaNem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle querys = getIntent().getExtras();
        queryValuta = querys.getString("valuta").trim();
        queryValutaNem = querys.getString("valutanem").trim();
        getArfolyamok();

    }

    private Object getArfolyamok() {
        Api arfolyamokApi =RetrofitInstance.getApi();
        Call<Arfolyamok> call = arfolyamokApi.getArfolyamok("valuta","eur");

        call.enqueue(new Callback<Arfolyamok>() {
            @Override
            public void onResponse(Call<Arfolyamok> call, Response<Arfolyamok> response) {
                Log.i("Retrofit", response.message());
                Arfolyamok arfolyamok = response.body();

                if (arfolyamok != null){

                    mItems = response.body().getmDeviza().getmItems();

                    Log.i("Retrofit", "Test eredmény" + mItems);


                    final ItemAdapter adapter = new ItemAdapter(ResultActivity.this, (ArrayList<Item>) mItems);
                    ListView listView =(ListView) findViewById(R.id.list);
                    listView.setAdapter(adapter);
                }else {
                    Log.i("Retrofit", "Nincs eredmény");
                }

            }

            @Override
            public void onFailure(Call<Arfolyamok> call, Throwable t) {
                String message = t.getMessage();
                Log.d("failure", message);
                Log.d("Retrofit", "Hiba!");

            }
        });
        return mItems;
    }
}
