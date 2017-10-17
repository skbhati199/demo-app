package demoapp.rahul.com.demoapp;

import android.app.Application;

import java.util.List;

import demoapp.rahul.com.demoapp.model.VideoDemoModel;
import demoapp.rahul.com.demoapp.utils.ConstantsUtils;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.POST;

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
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(ConstantsUtils.HTTTP_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit;
    }
}
