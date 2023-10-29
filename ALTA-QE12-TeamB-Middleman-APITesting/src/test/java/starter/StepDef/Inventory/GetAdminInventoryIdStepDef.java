package starter.StepDef.Inventory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Inventory.GetAdminInventoryIdAPI;
import starter.middleman.Inventory.GetUserInventoryIdAPI;

public class GetAdminInventoryIdStepDef {

    @Steps
    GetAdminInventoryIdAPI getAdminInventoryIdAPI;
    @Given("Get list inventory admin id {int}")
    public void getListInventoryAdminId(int id) {
        getAdminInventoryIdAPI.setGetAdminInventoryId(id);
    }
    @When("Send request get list inventory admin id")
    public void sendRequestGetListInventoryAdminId() {
        SerenityRest.when().get(GetAdminInventoryIdAPI.GET_ADMIN_INVENTORY_ID);
    }


}
