package starter.middleman.UserProducts;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateUserProductsAPI {
    public static String PUT_UPDATE_USERS = Constants.BASE_URL + "users/products/{idproduct}";

    public static String PUT_UPDATE_USERS_UNSUCCESS = Constants.BASE_URL + "users/products/{idproduct}";
    @Step("Put update users")
    public void setPutUpdateUsers(){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"kaos.jpg");
        String PRODUCT_ID = GetUsersProductsAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "galonqua")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images)
                .pathParam("idproduct", PRODUCT_ID);
    }

    @Step("Put update invalid users")
    public void setPutUpdateUsersUnsuccess(){
        String TOKEN = PostLoginUserAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"kaos.jpg");
        String PRODUCT_ID = GetUsersProductsAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "galonqua")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images)
                .pathParam("idproduct", PRODUCT_ID);
    }


}


