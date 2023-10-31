package starter.middleman.Inoutbounds;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

public class DeleteInoutboundsAPI {
    public static String DELETE_INOUTBOUNDS= Constants.BASE_URL+"inoutbounds/{id}";

    public static String DELETE_INOUTBOUNDS_UNSUCCESS= Constants.BASE_URL+"inoutbounds/{id}";


    @Step("Delete a user")
    public void setDeleteInoutbounds(int id) {
        String TOKEN = PostLoginUserAPI.setGetUserToken();
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
