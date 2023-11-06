package starter.middleman.carts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.adminproduct.GetAdminProductAPI;
import starter.utils.Constants;

public class DeleteCartsAPI {
    public static String DELETE_CARTS = Constants.BASE_URL + "carts/{id}";

    @Step("Delete carts")
    public void setDeleteCarts(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        String PRODUCT_ID = GetAdminProductAPI.setGetFirstProductId();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", PRODUCT_ID);
    }
}
