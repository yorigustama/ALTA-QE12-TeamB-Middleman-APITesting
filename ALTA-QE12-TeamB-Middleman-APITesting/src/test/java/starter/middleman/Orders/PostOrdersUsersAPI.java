package starter.middleman.Orders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostOrdersUsersAPI {
    public static String POST_ORDERS_USERS = Constants.BASE_URL+"orders/users";

    @Step("Post Add Orders")
    public void setPostOrdersUsers(File json){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON).body(json);

    }
}
