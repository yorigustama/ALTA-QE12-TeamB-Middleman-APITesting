package starter.middleman.adminproduct;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostAdminProductAPI {
    public static String POST_ADD_PRODUCT = Constants.BASE_URL + "admins/products";

    @Step("Post add product")
    public void setPostAddProduct(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"trans.png");
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "galon")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images);
    }
    @Step("Post add empty product name")
    public void setPostAddInvalidProductName(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"trans1.png");
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "")
                .multiPart("unit", "2")
                .multiPart("stock", "4")
                .multiPart("price", "30000")
                .multiPart("product_image", images);
    }
}
