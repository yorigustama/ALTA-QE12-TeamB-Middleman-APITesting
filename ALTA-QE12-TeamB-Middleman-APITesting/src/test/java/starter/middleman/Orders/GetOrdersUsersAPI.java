package starter.middleman.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetOrdersUsersAPI {
    public static String GET_ORDERS_USERS = Constants.BASE_URL+"orders/users";

//    public static String GET_LIST_USER_INVALID = Constants.BASE_URL+"orders"

    @Step ("Get list orders users")
    public void setGetOrdersUsers(){
        SerenityRest.given();
    }
}
