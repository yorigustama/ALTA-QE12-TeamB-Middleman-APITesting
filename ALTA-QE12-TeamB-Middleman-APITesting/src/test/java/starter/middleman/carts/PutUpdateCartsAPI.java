package starter.middleman.carts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.MiddlemanResponses;
import starter.utils.Constants;

public class PutUpdateCartsAPI {
    public static String PUT_UPDATE_CARTS = Constants.BASE_URL + "carts/{id}";

    @Step("Put Update Carts")
    public void setPutUpdateCarts(String id){
        SerenityRest.given()
                .pathParam(MiddlemanResponses.ID, id);
    }
}
