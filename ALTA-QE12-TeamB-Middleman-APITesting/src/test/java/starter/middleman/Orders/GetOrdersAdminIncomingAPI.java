package starter.middleman.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetOrdersAdminIncomingAPI {
    public static String GET_ORDERS_ADMIN_INCOMING = Constants.BASE_URL+"orders/admins/incoming";

    @Step("Get list orders users")
    public void setGetOrdersAdminIncoming(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }
}
