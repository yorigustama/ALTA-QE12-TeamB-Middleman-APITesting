package starter.middleman.Inventory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetAdminInventoryAPI {
    public static String GET_ADMIN_INVENTORY = Constants.BASE_URL+"admins/inventory";


    @Step("Get list inventory admin")
    public void setGetAdminInventory(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }
}
