package starter.middleman.UserProducts;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class DeleteUserProductsAPI {
    public static String DELETE_USER_PRODUCTS= Constants.BASE_URL+"users/products/{id}";
    public static String DELETE_USER_PRODUCTS_INVALID= Constants.BASE_URL+"users/products/{id}";


    @Step("Delete a user Products")
    public void setDeleteUserProducts(int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);
    }

    @Step("Delete invalid user")
    public void DeleteInvalidUser(Object param) {
        SerenityRest.given()
                .pathParam("id", param);

    }
}
