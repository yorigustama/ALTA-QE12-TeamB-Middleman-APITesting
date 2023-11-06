package starter.middleman.Orders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PutOrdersConfirmIdAPI {
    public static String PUT_ORDERS_CONFIRM_ID = Constants.BASE_URL+"/orders/confirm/{id}";

    @Step("Put orders confirm id")
    public void setPutOrdersConfirmId(File json, int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id)
                .contentType(ContentType.JSON).body(json);
    }
}
