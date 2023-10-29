package starter.middleman.Inventory;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostInventoryUsersAPI {
    public static String POST_INVENTORY_USERS = Constants.BASE_URL+"users/inventory";

    @Step("Post Add Orders")
    public void setPostInventoryUsers(File json){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON).body(json);

    }
}
