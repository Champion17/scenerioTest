package Contact;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage extends DriverManager {

    public AddToCartPage(){

        PageFactory.initElements(driver,this);

    }


    @FindBy(how = How.XPATH,using = "//h2[@class='title_block']")
    private WebElement dresses_title_block;
    @FindBy(how = How.XPATH,using = "//a[@class='product-name'and @href='http://automationpractice.com/index.php?id_product=3&controller=product'and @title='Printed Dress']")
    private WebElement printed_dresses;
    @FindBy(how = How.XPATH,using = "//span[@id='our_price_display']")
    private WebElement price_display;
    @FindBy(how = How.ID,using = "add_to_cart")
    private WebElement add_to_cart_button;
    @FindBy(how = How.XPATH,using = "//div[@class='layer_cart_product col-xs-12 col-md-6']//h2[1]")
    private WebElement product_successfully_added;
    @FindBy(how = How.XPATH,using = "//span[contains(text(),'Proceed to checkout')]")
    private WebElement proceed_checkout_button;
    @FindBy(how = How.XPATH,using = "//i[@class='icon-trash']")
    private WebElement trash_button;


    public void navigatesToAutomationPractisePage(){

        driver.navigate().to("http://automationpractice.com/index.php");
        Utils.waitForSomeTime();

    }



    public boolean landedOnTheDressesPage()
    {
        Assert.assertTrue(dresses_title_block.isDisplayed());
        return true;

    }

    public void clickOnPrintedDresses()
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,750)");
        Utils.waitForSomeTime();
        printed_dresses.click();
        Utils.waitForSomeTime();


    }

    public boolean landedOnThePrintedDressesPage()
    {
        Assert.assertTrue(price_display.isDisplayed());
        return true;
    }


    public void clickOnTheAddToCartButton()
    {
        Utils.waitForSomeTime();
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,550)");
        Utils.waitForSomeTime();
        add_to_cart_button.click();
        Utils.waitForSomeTime();

    }

    public boolean productSuccessfullyAddedMsg()
    {
        Utils.waitForSomeTime();
        Assert.assertTrue(product_successfully_added.isDisplayed());
        return true;
    }

    public void clickOnTheProceedCheckoutButton(){

        proceed_checkout_button.click();
        Utils.waitForSomeTime();
    }

    public boolean landedOnTheShoppingCartSummaryPage()
    {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("SHOPPING-CART SUMMARY"));
        return true;

    }

    public void clickOnTrashButton()
    {
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,550)");
        Utils.waitForSomeTime();
        trash_button.click();
        Utils.waitForSomeTime();

    }

    public boolean YourShoppingCartIsEmptyMsg()
    {
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Your shopping cart is empty."));
        return true;
    }


}
