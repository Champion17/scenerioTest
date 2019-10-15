package Contact;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class AddToCartStepDefs extends DriverManager {



    AddToCartPage acp = new AddToCartPage();



    @Then("^user should be on the dresses page$")
    public void user_should_be_on_the_dresses_page()
    {
        Assert.assertTrue(acp.landedOnTheDressesPage());
    }

    @When("^user clicksd the printed dress button$")
    public void user_clicksd_the_printed_dress_button()
    {
        acp.clickOnPrintedDresses();
    }


    @Then("^user should be on the printed dress page$")
    public void user_should_be_on_the_printed_dress_page()
    {
        Assert.assertTrue(acp.landedOnThePrintedDressesPage());
    }

    @When("^user clicks on the add to cart button$")
    public void user_clicks_on_the_add_to_cart_button()
    {
        acp.clickOnTheAddToCartButton();
    }

    @Then("^user should see the pop up window messaage Product successfully added to your shopping cart$")
    public void user_should_see_the_pop_up_window_messaage_Product_successfully_added_to_your_shopping_cart()
    {
        Assert.assertTrue(acp.productSuccessfullyAddedMsg());
    }

    @When("^user clicks on the clicks on the proceed tpo check out button$")
    public void user_clicks_on_the_clicks_on_the_proceed_tpo_check_out_button()
    {
        acp.clickOnTheProceedCheckoutButton();
    }

    @Then("^user should be on the shopping to cart summary page$")
    public void user_should_be_on_the_shopping_to_cart_summary_page()
    {
        Assert.assertTrue(acp.landedOnTheShoppingCartSummaryPage());
    }

    @When("^user clicks on the trash button$")
    public void user_clicks_on_the_trash_button()
    {
        acp.clickOnTrashButton();
    }

    @Then("^user should see the your shopping cart is empty message$")
    public void user_should_see_the_your_shopping_cart_is_empty_message()
    {
        Assert.assertTrue(acp.YourShoppingCartIsEmptyMsg());
    }













}
