package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("firstname")).sendKeys("Slava");
        Thread.sleep(1000);
        driver.findElement(By.name("lastname")).sendKeys("Friz");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email__")).sendKeys("sdservice@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sdservice@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("MM2222");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_month")).sendKeys("Jul");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_day")).sendKeys("26");
        Thread.sleep(1000);
        driver.findElement(By.name("birthday_year")).sendKeys("1981");
        Thread.sleep(1000);
        driver.findElement(By.name("sex")).click();
        Thread.sleep(1000);
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(1000);
        driver.close();
        Thread.sleep(1000);
       // driver.quit();
    }
}
