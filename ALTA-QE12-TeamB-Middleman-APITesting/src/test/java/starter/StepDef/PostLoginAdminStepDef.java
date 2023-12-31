package starter.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostLoginAdminStepDef {

    @Steps
    PostLoginAdminAPI postLoginAdminAPI;
    @Given("Login admin with {string} as request body")
    public void loginAdminWithAsRequestBody(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        PostLoginAdminAPI.setPostLoginUser(json);
    }

    @When("Send request login admin")
    public void sendRequestLoginAdmin() {
        SerenityRest.when().post(PostLoginAdminAPI.POST_LOGIN_ADMIN);
    }
}
