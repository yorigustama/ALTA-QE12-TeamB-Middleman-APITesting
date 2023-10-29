package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.GetOrdersAdminAPI;

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
}
