package Task_Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
public class Invalid_login {
    WebDriver driver;
    SoftAssert soft = new SoftAssert();
    Test2 loc = new Test2();
    @Given("User open Browser Navigate the website Page login")
    public void open_browser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        options.addArguments("--remote-allow-origins");
        driver.navigate().to("https://automationexercise.com/");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("User Click login button")
    public void Invalid_scenario_login_Button() {

        loc.Clic_Login(driver).click();

    }
    @And("User input InValid Data “ name”, ”Email”")
    public void Invalid_email_and_Password_Login() {
        loc.Enter_Email(driver).sendKeys("anton@gmail.com");
        loc.Enter_Password(driver).sendKeys("123456789");
    }
    @Then("User Click Login button")
    public void Click_login() {
        loc.Clic_login(driver).click();
        soft.assertTrue(loc.Message(driver).isDisplayed());
    }
}