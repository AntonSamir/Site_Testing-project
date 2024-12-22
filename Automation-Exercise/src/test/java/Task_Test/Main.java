package Task_Test;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;
public class Main {
    WebDriver driver;
    SoftAssert soft = new SoftAssert();
    Test loc = new Test();
    @Given("User Open Browser Navigate the website Page Sign up")
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

    @When("user Press Signup button")
    public void valid_scenario_Signup_Button() {

        loc.Clic_Job1(driver).click();

    }
    @And("user input Valid Data “ name”, ”Email”")
    public void valid_Nameoremail_signup() {
        loc.Enter_Name(driver).sendKeys("Anton");
        loc.Enter_Email(driver).sendKeys("antonsamir4@gmail.com");
    }
    @Then("user Press Signup button")
    public void Click_continue() {

        loc.Clic_Job3(driver).click();
    }
    @When("user input All Valid Data “ name”, ”Email” ,”FName” ,” LName” , “Password”,”phone”")
    public void valid_data_Signup() {

        loc.Clic_Job4(driver).click();
        loc.Enter_Password(driver).sendKeys("123456789LKas//");
        /// /////Choose Birthdate///////////////
        loc.Day(driver).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc.Day1(driver).click();
        loc.Month(driver).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc.Month1(driver).click();
        loc.Year(driver).click();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc.Year1(driver).click();
        /// /////Choose Birthdate///////////////
        loc.Clic_Confirm1(driver).click();
        loc.Clic_Confirm2(driver).click();
        loc.Enter_FName(driver).sendKeys("Anton");
        loc.Enter_LName(driver).sendKeys("Samir");
        loc.Company(driver).sendKeys("Fresh electronics");
        loc.Adress1(driver).sendKeys("Giza");
        loc.Adress2(driver).sendKeys("Haram");
        loc.Country1(driver).click();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        loc.Country2(driver).click();
        loc.State(driver).sendKeys("Canda");
        loc.City(driver).sendKeys("Giza");
        loc.Zipcode(driver).sendKeys("4887");
        loc.Mobile_Number(driver).sendKeys("01287090732");
    }
    @And("User click on the ”Creat Account” button")
    public void Creat_Account_button() {

        loc.Creat_Account(driver).click();
    }
    @Then("Message successfully submission")
    public void successfully_Message() {
        soft.assertTrue(loc.Check_Sucess(driver).isDisplayed());
        loc.Continue1(driver).click();
    }
    @When("User click on the ”Delete Account” button")
    public void valid_scenario_Delete_Account_Button() {

        loc.Delete_account(driver).click();

    }
    @Then("Message successfully deleted")
    public void Click_continue2() {
        soft.assertTrue(loc.Check_Sucess2(driver).isDisplayed());
        loc.Continue2(driver).click();
    }


}
