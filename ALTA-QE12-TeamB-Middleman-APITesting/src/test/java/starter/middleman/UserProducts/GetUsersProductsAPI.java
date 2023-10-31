package starter.middleman.UserProducts;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

public class GetUsersProductsAPI {
    public static String GET_USERS_PRODUCT = Constants.BASE_URL + "users/products";

    public static String GET_USERS_PRODUCT_UNSUCCESS = Constants.BASE_URL + "users/products";


    @Step("Get first product id")
    public static String setGetFirstProductId(){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        return SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .when().get(GetUsersProductsAPI.GET_USERS_PRODUCT)
                .then().extract().response().jsonPath().getString("data[0].id");
    }

    @Step("Get all users product")
    public static void setGetUsersProduct(){
        SerenityRest.given().contentType(ContentType.JSON);
    }

    @Step("Get Invalid User")
    public static void setGetUsersProductUnsuccess(){
        SerenityRest.given().contentType(ContentType.JSON);
    }
}
