package starter.middleman.carts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostCartsAPI {
    public static String POST_CREATE_USERS = Constants.BASE_URL + "users";

    @Step("Post create new carts")
    public void setPostCreateUsers(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        File images = new File(Constants.IMAGE_FILE+"trans1.png");
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .multiPart("product_name", "susu")
                .multiPart("unit", "4")
                .multiPart("stock", "3")
                .multiPart("price", "20000")
                .multiPart("product_image", images);
    }
}
