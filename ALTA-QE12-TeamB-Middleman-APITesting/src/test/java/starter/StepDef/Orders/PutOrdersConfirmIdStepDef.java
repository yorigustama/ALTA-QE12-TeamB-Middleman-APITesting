package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.PutOrdersConfirmIdAPI;
import starter.utils.Constants;

import java.io.File;

public class PutOrdersConfirmIdStepDef {

    @Steps
    PutOrdersConfirmIdAPI putOrdersConfirmIdAPI;
    @Given("Update user with json {string} and user id {int}")
    public void updateUserWithJsonAndUserId(String jsonFile, int id) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        putOrdersConfirmIdAPI.setPutOrdersConfirmId(json, id);
    }


    @When("Send request put orders confirm id")
    public void sendRequestPutOrdersConfirmId() {
        SerenityRest.when().put(PutOrdersConfirmIdAPI.PUT_ORDERS_CONFIRM_ID);
    }
}
