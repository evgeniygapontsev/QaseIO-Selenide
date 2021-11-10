package adapters;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import models.Response;
import models.Suite;


public class SuiteAdapter extends BaseAdapter{

    public void createSuite(Suite suite, String code) {
        post(new Gson().toJson(suite), "v1/suite/" + code);
    }

    public void deleteSuite(String code, int id) {
        del("v1/suite/" + code + "/" + id);
    }

    public Response<Suite> getSuite(String code, int id) {
        String body = g("v1/suite/" + code + "/" + id);
        return new Gson().fromJson(body, new TypeToken<Response<Suite>>() {}.getType());
    }
}
