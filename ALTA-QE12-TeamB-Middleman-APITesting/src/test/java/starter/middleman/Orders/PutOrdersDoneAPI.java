package starter.middleman.Orders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PutOrdersDoneAPI {

    public static String PUT_ORDERS_DONE_ID = Constants.BASE_URL+"/orders/done/{id}";

    @Step("Put orders done")
    public void setPutOrdersDoneId(File json, int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id)
                .contentType(ContentType.JSON).body(json);
    }
}
