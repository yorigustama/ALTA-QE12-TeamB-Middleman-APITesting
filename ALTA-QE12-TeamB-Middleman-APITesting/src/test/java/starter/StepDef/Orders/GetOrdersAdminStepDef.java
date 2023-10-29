package starter.StepDef.Orders;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.GetOrdersAdminAPI;
import starter.utils.Constants;

import java.io.File;

public class GetOrdersAdminStepDef {

    @Steps
    GetOrdersAdminAPI getOrdersAdminAPI;
    @Given("Get list orders admin")
    public void getListOrdersAdmin() {
        getOrdersAdminAPI.setGetOrdersAdmin();

    }

    @When("Send request get list orders admin")
    public void sendRequestGetListOrdersAdmin() {
        SerenityRest.when().get(GetOrdersAdminAPI.GET_ORDERS_ADMIN);
    }

    @And("Validate get list orders user JSON schema {string}")
    public void validateGetListOrdersUserJSONSchema(String jsonFile) {
        File json =new File(Constants.JSON_SCHEMA+jsonFile);
        SerenityRest.and().assertThat().body(JsonSchemaValidator.matchesJsonSchema(json));
    }
}
