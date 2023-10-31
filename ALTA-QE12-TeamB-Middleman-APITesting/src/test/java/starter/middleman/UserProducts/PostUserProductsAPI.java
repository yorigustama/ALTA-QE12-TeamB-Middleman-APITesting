package starter.middleman.UserProducts;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

import java.io.File;

public class PostUserProductsAPI {
    public static String POST_ADD_PRODUCTS_USERS = Constants.BASE_URL+"users/products";

    public static String POST_ADD_PRODUCTS_USERS_UNSUCCESS = Constants.BASE_URL+"users/products";

    @Step("Post Add Orders")
    public void setPostAddProductsUsers(){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"kaos.jpg");
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name","gula")
                .multiPart("unit", "5")
                .multiPart("stock", "50")
                .multiPart("price", "25000")
                .multiPart("product_image", images);
    }

    @Step("Post Create New Cart Invalid")
    public void setPostAddProductsUsersUnsuccess(){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"kaos.jpg");
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images);
    }


}
