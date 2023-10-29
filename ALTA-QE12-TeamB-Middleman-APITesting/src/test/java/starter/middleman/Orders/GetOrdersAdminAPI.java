package starter.middleman.Orders;

import jnr.constants.Constant;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetOrdersAdminAPI {
    public static String GET_ORDERS_ADMIN = Constants.BASE_URL+"orders/admins";


    @Step
    public void setGetOrdersAdmin(){
        SerenityRest.given();
    }
}
