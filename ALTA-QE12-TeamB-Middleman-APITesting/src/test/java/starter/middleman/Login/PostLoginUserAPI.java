package starter.middleman.Login;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class PostLoginUserAPI {
    public static String POST_LOGIN_USER = Constants.BASE_URL+"login";

    @Step("Get user token")
    public static String setGetUserToken(){
        File json = new File(Constants.REQ_BODY+"LoginUserAccountValid.json");
        return SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json)
                .when().post(POST_LOGIN_USER)
                .then().extract().response().jsonPath().getString("data.token");
    }
    @Step("Login")
    public static void setPostLoginUser(File json){
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }

}
