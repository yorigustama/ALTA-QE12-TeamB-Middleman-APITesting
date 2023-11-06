package starter.middleman.carts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetCartsAPI {
    public static String GET_CARTS_USER = Constants.BASE_URL + "carts/{id}";

    @Step("Get carts user")
    public void setGetCartsUser(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
    @Step("Get carts user not found")
    public void setGetCartsUserNotFound(int id){
        SerenityRest.given()
                .pathParam("id", id);
    }
}
