package starter.middleman.Orders;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class GetOrdersUsersIdAPI {
    public static String GET_ORDERS_USERS_ID = Constants.BASE_URL+"orders/users/{id}";

//    public static String GET_LIST_USER_INVALID = Constants.BASE_URL+"orders"

    @Step("Put orders confirm id")
    public void setGetOrdersUsersId(int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);

    }
}
