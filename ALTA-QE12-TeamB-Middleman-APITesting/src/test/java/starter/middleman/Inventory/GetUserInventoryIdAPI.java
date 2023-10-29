package starter.middleman.Inventory;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class GetUserInventoryIdAPI {
    public static String GET_USER_INVENTORY_ID = Constants.BASE_URL+"users/inventory/{id}";


    @Step("Put orders confirm id")
    public void setGetUserInventoryId(int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);
    }
}
