package Task_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Test {

    WebElement Clic_Job1 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        return ant;
    }

    WebElement  Enter_Name (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
        return ant;
    }
    WebElement Enter_Email (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]"));
        return ant;
    }

    WebElement Clic_Job3  (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button"));
        return ant;
    }
    WebElement Clic_Job4 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"id_gender1\"]"));
        return ant;
    }
    WebElement  Enter_Password (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        return ant;
    }
    /// Choose Birthdate //////////////////////////////
    WebElement Day (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"days\"]"));
        return ant;
    }

    WebElement  Day1 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"days\"]/option[5]"));
        return ant;
    }
    WebElement Month (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"months\"]"));
        return ant;
    }
    WebElement Month1  (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"months\"]/option[6]"));
        return ant;
    }
    WebElement Year (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"years\"]"));
        return ant;
    }
    WebElement  Year1 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"years\"]/option[25]"));
        return ant;
    }
    ///Choose Birthdate  ///////////////////////////
    WebElement Clic_Confirm1 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"newsletter\"]"));
        return ant;
    }
    WebElement Clic_Confirm2 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"optin\"]"));
        return ant;
    }

    WebElement Enter_FName (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"first_name\"]"));
        return ant;
    }
    WebElement Enter_LName (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"last_name\"]"));
        return ant;
    }
    WebElement Company (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"company\"]"));
        return ant;
    }
    WebElement Adress1 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"address1\"]"));
        return ant;
    }
    WebElement Adress2 (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"address2\"]"));
        return ant;
    }
    WebElement Country1 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"country\"]"));
        return ant;
    }
    WebElement Country2 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"country\"]/option[2]"));
        return ant;
    }
    WebElement State (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"state\"]"));
        return ant;
    }
    WebElement City (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"city\"]"));
        return ant;
    }
    WebElement Zipcode (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"zipcode\"]"));
        return ant;
    }
    WebElement Mobile_Number (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"mobile_number\"]"));
        return ant;
    }
    WebElement Creat_Account (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button"));
        return ant;
    }
    WebElement Check_Sucess (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div"));
        return ant;
    }
    WebElement Continue1 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        return ant;
    }
    WebElement Delete_account (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a"));
        return ant;
    }
    WebElement Check_Sucess2 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/h2/b"));
        return ant;
    }
    WebElement Continue2 (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/a"));
        return ant;
    }
}
