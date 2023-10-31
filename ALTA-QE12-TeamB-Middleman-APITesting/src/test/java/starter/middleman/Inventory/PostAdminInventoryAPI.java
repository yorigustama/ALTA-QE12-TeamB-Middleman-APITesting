package starter.middleman.Inventory;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostAdminInventoryAPI {
    public static String POST_INVENTORY_ADMIN = Constants.BASE_URL+"admins/inventory";

    @Step("Post Add inventory")
    public void setPostInventoryAdmin(File json){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON).body(json);
    }
}
