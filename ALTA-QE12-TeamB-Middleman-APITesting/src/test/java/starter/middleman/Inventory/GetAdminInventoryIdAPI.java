package starter.middleman.Inventory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetAdminInventoryIdAPI {
    public static String GET_ADMIN_INVENTORY_ID = Constants.BASE_URL+"admins/inventory/{id}";


    @Step("Put orders confirm id")
    public void setGetAdminInventoryId(int id) {
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .pathParam("id", id);
    }
}
