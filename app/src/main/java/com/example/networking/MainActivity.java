package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener{

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this).execute(JSON_URL);
    }


    @Override
    public void onPostExecute(String json) {
        Log.d("MainActivity", json);
        Gson gson = new Gson();

        Type type = new TypeToken<ArrayList<Mountain>>() {}.getType();
        ArrayList<Mountain> dynastyArrayList = gson.fromJson(json, type);

        RecyclerView view = findViewById(R.id.recycler_view);
        MountainAdapter adapter = new MountainAdapter(MainActivity.this, dynastyArrayList, new MountainAdapter.OnClickListener() {
            @Override
            public void onClick(Mountain item) {
                Log.d("==>","On Click works");
            }
        });

        view.setAdapter(adapter);
        view.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
}