package Task_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Test2 {

    WebElement Clic_Login (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
        return ant;
    }
    WebElement Enter_Email (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        return ant;
    }
    WebElement  Enter_Password (WebDriver driver){
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
        return ant;
    }
    WebElement Clic_login  (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        return ant;
    }
    WebElement Message (WebDriver driver) {
        WebElement ant = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/p"));
        return ant;
    }
}
