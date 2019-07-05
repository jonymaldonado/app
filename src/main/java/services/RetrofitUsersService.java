package services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitUsersService {
    @GET("/data/2.5/weather?zip={cod}&APPID=298c30cd2042a6c580e8c55c359e8a22")
    Call<ResponseUser> getUser(@Path("cod") int cod);
}
