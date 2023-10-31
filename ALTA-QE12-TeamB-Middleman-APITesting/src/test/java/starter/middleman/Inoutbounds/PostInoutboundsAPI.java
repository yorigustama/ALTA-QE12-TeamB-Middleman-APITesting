package starter.middleman.Inoutbounds;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostInoutboundsAPI {
    public static String POST_CREATE_INBOUNDS= Constants.BASE_URL+"inoutbounds";

    public static String POST_CREATE_INBOUNDS_UNSUCCESS= Constants.BASE_URL+"inoutbounds";

    @Step("Post Create New Cart")
    public void setPostCreateInbounds(File json){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON).body(json);

    }

    @Step("Post Create New Cart Invalid")
    public void setPostCreateInboundsUnsuccess(File json){
        String TOKEN = PostLoginAdminAPI.setGetUserToken();
        SerenityRest.given()
                .header("Authorization", "Bearer " + TOKEN)
                .contentType(ContentType.JSON).body(json);

    }
}
