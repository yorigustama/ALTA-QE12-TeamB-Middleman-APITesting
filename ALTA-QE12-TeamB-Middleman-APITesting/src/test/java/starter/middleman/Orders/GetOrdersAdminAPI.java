package starter.middleman.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetOrdersAdminAPI {
    public static String GET_ORDERS_ADMIN = Constants.BASE_URL+"orders/admins";


    @Step("Get list orders users")
    public void setGetOrdersAdmin(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }
}
