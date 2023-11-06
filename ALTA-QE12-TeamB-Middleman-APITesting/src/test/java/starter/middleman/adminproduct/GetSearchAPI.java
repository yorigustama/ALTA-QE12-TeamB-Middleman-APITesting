package starter.middleman.adminproduct;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import starter.utils.Constants;

import java.io.File;

public class GetSearchAPI {
    public static String GET_ADMINS_SEARCH = Constants.BASE_URL + "admins/products/search";

    @Step("Get admins search")
    public void setGetAdminsSearch(File json) {
        SerenityRest.given()
                .contentType(ContentType.JSON)
                .body(json);
    }
}
