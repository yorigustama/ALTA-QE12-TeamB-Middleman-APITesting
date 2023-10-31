package starter.middleman.Inoutbounds;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.middleman.UserProducts.GetUsersProductsAPI;
import starter.utils.Constants;

import java.io.File;

public class PutInoutboundsAPI {
    public static String PUT_UPDATE_INOUTBOUNDS= Constants.BASE_URL+"inoutbounds/{idproducts}";

    public static String PUT_UPDATE_INOUTBOUNDS_INVALID= Constants.BASE_URL+"inoutbounds/{idproducts}";

    @Step("Put Update Inoutbounds")
    public static void setPutUpdateInoutbounds(File json) {
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        String ID_PRODUCTS = GetUsersProductsAPI.setGetFirstProductId();
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .body(json)
                .pathParam("idproducts", ID_PRODUCTS)
                .header("Authorization", "Bearer " + TOKEN);
    }
    @Step("Put Update Invalid Inoutbounds")
    public void setPutUpdateInoutboundsInvalid(int id) {
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);
    }
}
