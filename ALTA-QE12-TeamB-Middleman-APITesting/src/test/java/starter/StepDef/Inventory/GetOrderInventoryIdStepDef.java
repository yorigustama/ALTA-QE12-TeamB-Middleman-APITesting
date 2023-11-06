package starter.StepDef.Inventory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inventory.GetUserInventoryIdAPI;

public class GetOrderInventoryIdStepDef {

    @Steps
    GetUserInventoryIdAPI getUserInventoryIdAPI;
    @Given("Get list inventory user id {int}")
    public void getListInventoryUserId(int id) {
        getUserInventoryIdAPI.setGetUserInventoryId(id);
    }

    @When("Send request get list inventory user id")
    public void sendRequestGetListInventoryUserId() {
        SerenityRest.when().get(GetUserInventoryIdAPI.GET_USER_INVENTORY_ID);
    }
}
