package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.PutOrdersConfirmIdAPI;
import starter.middleman.Orders.PutOrdersDoneAPI;
import starter.utils.Constants;

import java.io.File;

public class PutOrdersDoneStepDef {

    @Steps
    PutOrdersDoneAPI putOrdersDoneAPI;
    @When("Send request put orders done id")
    public void sendRequestPutOrdersDoneId() {
        SerenityRest.when().put(PutOrdersDoneAPI.PUT_ORDERS_DONE_ID);
    }

    @Given("Update done user with json {string} and user id {int}")
    public void updateDoneUserWithJsonAndUserId(String jsonFile, int id) {
        File json = new File(Constants.REQ_BODY+jsonFile);
        putOrdersDoneAPI.setPutOrdersDoneId(json, id);
    }
}
