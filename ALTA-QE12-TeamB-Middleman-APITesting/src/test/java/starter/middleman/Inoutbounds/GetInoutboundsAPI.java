package starter.middleman.Inoutbounds;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

public class GetInoutboundsAPI {
    public static String GET_INOUTBOUNDS_ADMIN = Constants.BASE_URL+"inoutbounds";

    public static String GET_INOUTBOUNDS_ADMIN_UNSUCCESS = Constants.BASE_URL+"inoutbounds";

    @Step("Get list inoutbounds admin")
    public void setGetInoutboundsAdmin(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }

    @Step("Get list inoutbounds invalid admin")
    public void setGetInoutboundsInvalidAdmin(){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest
                .given()
                .header("Authorization", "Bearer " + TOKEN);
    }
}
