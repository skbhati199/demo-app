package demoapp.rahul.com.demoapp;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import demoapp.rahul.com.demoapp.utils.ConstantsUtils;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Rahul on 10/17/2017.
 */

public class DemoApp extends Application {

    private static Retrofit retrofit;


    @Override
    public void onCreate() {
        super.onCreate();


    }

    public static Retrofit getRetrofit() {
        Gson gson = new GsonBuilder()
                .create();

        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(ConstantsUtils.HTTTP_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

        return retrofit;
    }
}
