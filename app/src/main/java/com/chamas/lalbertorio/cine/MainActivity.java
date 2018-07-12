package com.chamas.lalbertorio.cine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.chamas.lalbertorio.cine.Utility.JsonTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new JsonTask(this, new JsonTask.AsyncResponse() {
            @Override
            public void processFinish(String result) {
//                System.out.println(result);
//                try {
//                    JSONObject theather = new JSONObject(result.trim());
//                    Iterator<?> keys = theather.getJSONObject("aguadilla").keys();
//                    LinkedHashMap<String, JSONArray> movies;
//
//                    while(keys.hasNext()){
//                        String key = (String)keys.next();
//                        if(theather.get(key) instanceof LinkedHashMap<?,?>){
//                            movies = (LinkedHashMap<String, JSONArray>) keys.next();
//                        }
//                    }
//
//
//
//
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }




            }
        }).execute("aguadilla");


    }
}
