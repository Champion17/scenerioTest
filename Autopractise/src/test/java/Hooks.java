



import Contact.DriverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hooks
{
    @Before
    public void setup()
     {
      new DriverManager().openBrowser();
     }


      @After
    public void teardown()
      {
       new DriverManager().closeBrowser();
      }
}
