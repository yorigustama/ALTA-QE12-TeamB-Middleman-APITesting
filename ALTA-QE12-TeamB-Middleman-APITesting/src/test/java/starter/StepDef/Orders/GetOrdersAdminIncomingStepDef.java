package starter.StepDef.Orders;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import starter.middleman.Orders.GetOrdersAdminIncomingAPI;

public class GetOrdersAdminIncomingStepDef {

    @Steps
    GetOrdersAdminIncomingAPI getOrdersAdminIncomingAPI;
    @Given("Get list orders admin incoming")
    public void getListOrdersAdminIncoming() {
        getOrdersAdminIncomingAPI.setGetOrdersAdminIncoming();

    }

    @When("Send request get list orders admin incoming")
    public void sendRequestGetListOrdersAdminIncoming() {
        SerenityRest.when().get(GetOrdersAdminIncomingAPI.GET_ORDERS_ADMIN_INCOMING);
    }
}
