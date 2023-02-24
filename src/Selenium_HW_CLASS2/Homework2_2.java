package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Slava",Keys.TAB,"Friz",Keys.TAB,"sdservice00@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sdservice00@gmail.com",Keys.TAB,"MM2222",Keys.TAB,Keys.TAB,"Jul",Keys.TAB,"26",Keys.TAB,"1981");
        driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
        driver.findElement(By.name("websubmit")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Continue")).click();
        driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
        Thread.sleep(1000);
        driver.quit();





    }
}
