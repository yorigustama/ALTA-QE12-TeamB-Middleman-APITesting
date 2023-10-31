package starter.middleman.UserProducts;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

import java.io.File;

public class GetUserSearchProductsAPI {
    public static String GET_USER_PRODUCT_SEARCH = Constants.BASE_URL+"users/products/search";

    public static String GET_USER_PRODUCT_UNSUCCESS = Constants.BASE_URL+"users/products";


    @Step("Get list Products Users serch")
    public void setGetUserProductSearch(String search){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .queryParam("productname", search)
                .header("Authorization", "Bearer " + TOKEN);
    }
    @Step("Get list Products Users serch")
    public void setGetUserProductUnsuccess(String search){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        SerenityRest
                .given()
                .contentType(ContentType.JSON)
                .queryParam("productname", search)
                .header("Authorization", "Bearer " + TOKEN);
    }
}
