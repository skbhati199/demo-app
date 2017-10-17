package demoapp.rahul.com.demoapp.apiservice;

import java.util.List;

import demoapp.rahul.com.demoapp.model.VideoDemoModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Rahul on 10/17/2017.
 */

public interface DemoService {

    @GET("/videos/browse/limit/10/page/1?restApi=Sesapi&sesapi_platform=1&auth_token=6e2c544c72bc344c1507960883&language=en")
    Call<List<VideoDemoModel>> listRepos();
}
