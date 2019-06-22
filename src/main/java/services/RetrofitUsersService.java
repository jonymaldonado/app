package services;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetrofitUsersService {
    @GET("/api/users/{id}")
    Call<ResponseUser> getUser(@Path("id") int userId);
}
