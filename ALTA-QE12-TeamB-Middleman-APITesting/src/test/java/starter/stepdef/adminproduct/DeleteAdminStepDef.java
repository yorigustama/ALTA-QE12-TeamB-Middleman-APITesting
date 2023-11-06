package starter.stepdef.adminproduct;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import starter.middleman.adminproduct.DeleteProductAPI;

public class DeleteAdminStepDef {

    @Given("Delete product with id")
    public void deleteProductWithId() {
        DeleteProductAPI.setDeleteProduct();
    }

    @When("Send request delete product")
    public void sendRequestDeleteProduct() {
        SerenityRest.when().delete(DeleteProductAPI
                .DELETE_PRODUCT);
    }
}
