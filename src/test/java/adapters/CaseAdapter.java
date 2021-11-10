package adapters;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import models.CaseInfo;
import models.Response;


public class CaseAdapter extends BaseAdapter{

    public void createCase(CaseInfo caseInfo, String code) {
        post(new Gson().toJson(caseInfo), "v1/case/" + code);
    }

    public void deleteCase(String code, int id) {
        del("v1/case/" + code + "/" + id);
    }

    public Response<CaseInfo> getCase(String code, int id) {
        String body = g("v1/case/" + code + "/" + id);
        return new Gson().fromJson(body, new TypeToken<Response<CaseInfo>>() {}.getType());
    }
}

