import model.User;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import services.ResponseUser;
import services.RetrofitUsersService;

public class MainTest {

    public static void main(String args[]){
         Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        RetrofitUsersService service = retrofit.create(RetrofitUsersService.class);

        Call<ResponseUser> call = service.getUser(2);
        try{
            Response<ResponseUser> response = call.execute();
            User user = response.body().data;

            System.out.print(user.allData());
        }
        catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
