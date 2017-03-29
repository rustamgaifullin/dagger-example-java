package io.rustam.components.retrofit;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WikipediaService {
    @GET("api.php?action=query&prop=revisions&rvprop=content&format=json")
    Call<ResponseBody> content(@Query("titles") String titles);
}
