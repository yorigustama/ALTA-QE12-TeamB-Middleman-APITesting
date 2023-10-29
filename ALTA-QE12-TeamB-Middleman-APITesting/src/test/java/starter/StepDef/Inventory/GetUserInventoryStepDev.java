package starter.StepDef.Inventory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inventory.GetUsersInventoryAPI;

public class GetUserInventoryStepDev {

    @Steps
    GetUsersInventoryAPI getUsersInventoryAPI;
    @Given("Get list inventory user")
    public void getListInventoryUser() {
        getUsersInventoryAPI.setGetUserInventory();
    }

    @When("Send request get list inventory user")
    public void sendRequestGetListInventoryUser() {
        SerenityRest.when().get(GetUsersInventoryAPI.GET_USER_INVENTORY);
    }
}
