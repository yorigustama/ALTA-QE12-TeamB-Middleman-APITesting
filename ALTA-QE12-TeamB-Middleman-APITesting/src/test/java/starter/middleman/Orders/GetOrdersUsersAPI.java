package starter.middleman.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetOrdersUsersAPI {
    public static String GET_ORDERS_USERS = Constants.BASE_URL+"orders/users";

    @Step ("Get list orders users")
    public void setGetOrdersUsers(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }
}
