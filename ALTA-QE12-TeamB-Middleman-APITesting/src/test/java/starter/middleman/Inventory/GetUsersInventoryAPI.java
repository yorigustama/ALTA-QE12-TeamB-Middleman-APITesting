package starter.middleman.Inventory;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetUsersInventoryAPI {
    public static String GET_USER_INVENTORY = Constants.BASE_URL+"users/inventory";


    @Step("Get list inventory users")
    public void setGetUserInventory(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }

}
