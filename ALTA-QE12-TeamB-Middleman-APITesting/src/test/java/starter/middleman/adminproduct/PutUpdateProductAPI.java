package starter.middleman.adminproduct;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PutUpdateProductAPI {
    public static String PUT_UPDATE_PRODUCT = Constants.BASE_URL + "admins/products/{id}";

    @Step("Put update product")
    public void setPutUpdateProduct(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"trans.png");
        String PRODUCT_ID = GetAdminProductAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "galon")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images)
                .pathParam("id", PRODUCT_ID);
    }
    @Step("Put update without product name")
    public void setPutUpdateWithoutProductName(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        String PRODUCT_ID = GetAdminProductAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "galon")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .pathParam("id", PRODUCT_ID);
    }
}
