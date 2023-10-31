package starter.middleman.adminproduct;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

public class GetAdminProductAPI {
    public static String GET_ADMIN_PRODUCT = Constants.BASE_URL + "admins/products";

    @Step("Get first product id")
    public static String setGetFirstProductId(){
        return SerenityRest.given()
                .when().get(GetAdminProductAPI.GET_ADMIN_PRODUCT)
                .then().extract().response().jsonPath().getString("data[0].id");
    }

    @Step("Get all admins product")
    public static void setGetAdminProduct(){
        SerenityRest.given().contentType(ContentType.JSON);
    }

}
