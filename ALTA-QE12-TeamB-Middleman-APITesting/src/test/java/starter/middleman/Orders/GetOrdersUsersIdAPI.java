package starter.middleman.Orders;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetOrdersUsersIdAPI {
    public static String GET_ORDERS_USERS_ID = Constants.BASE_URL+"orders/users/7";

//    public static String GET_LIST_USER_INVALID = Constants.BASE_URL+"orders"

    @Step ("Get list orders users id")
    public void setGetOrdersUsersId(){
        SerenityRest.given();
    }
}
