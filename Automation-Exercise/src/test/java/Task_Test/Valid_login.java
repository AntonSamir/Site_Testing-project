package Task_Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Valid_login {
    WebDriver driver;
    Test1 loc = new Test1();
    @Given("User Open Browser Navigate the website Page login")
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

    @When("User Press login button")
    public void valid_scenario_Login_Button() {

        loc.Clic_Login(driver).click();
    }
    @And("User input Valid Data “ name”, ”Email”")
    public void Valid_email_and_Password_Login() {
        loc.Enter_Email(driver).sendKeys("antonsamir4@gmail.com");
        loc.Enter_Password(driver).sendKeys("123456789LKas//");
    }
    @Then("User Press Login button")
    public void Click_login() {
        loc.Clic_login(driver).click();
    }
}
