package starter.StepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.middleman.Login.PostLoginUserAPI;
import starter.utils.Constants;

import java.io.File;

public class PostLoginUser {
    @Given("Login user with {string} as request body")
    public void loginUserWithAsRequestBody(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        PostLoginUserAPI.setPostLoginUser(json);
    }

    @When("Send request login user")
    public void sendRequestLoginUser() {
        SerenityRest.when().post(PostLoginUserAPI.POST_LOGIN_USER);
    }

}
