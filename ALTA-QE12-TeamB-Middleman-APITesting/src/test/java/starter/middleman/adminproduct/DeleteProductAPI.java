package starter.middleman.adminproduct;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.PostLoginAdminAPI;
import starter.utils.Constants;

public class DeleteProductAPI {
    public static String DELETE_PRODUCT = Constants.BASE_URL + "users/{id}";


    @Step("Delete product")
    public static void setDeleteProduct(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        String PRODUCT_ID = GetAdminProductAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", PRODUCT_ID);
    }
}
