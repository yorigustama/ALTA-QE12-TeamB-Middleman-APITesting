package starter.StepDef.Inventory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inventory.PostInventoryUsersAPI;
import starter.middleman.Login.PostLoginAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class PostInventoryUserStepDef {

    @Steps
    PostInventoryUsersAPI postInventoryUsersAPI;
    @Given("Add inventory user with json {string}")
    public void addInventoryUserWithJson(String jsonFile) {
        File json = new File(Constants.REQ_BODY + jsonFile);
        postInventoryUsersAPI.setPostInventoryUsers(json);
    }

    @When("Send request post inventory user")
    public void sendRequestPostInventoryUser() {
        SerenityRest.when().post(PostInventoryUsersAPI.POST_INVENTORY_USERS);
    }
}
