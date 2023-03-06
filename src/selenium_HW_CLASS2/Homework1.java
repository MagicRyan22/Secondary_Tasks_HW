package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Slava");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.lastName")).sendKeys("Friz");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.street")).sendKeys("2100 Candlelight ct");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.city")).sendKeys("Helmetta");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.state")).sendKeys("NJ");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("08828");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("929-444-2316");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.ssn")).sendKeys("465-5555-6666");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.username")).sendKeys("MagicMike");
        Thread.sleep(1000);
        driver.findElement(By.id("customer.password")).sendKeys("MM2222");
        Thread.sleep(1000);
        driver.findElement(By.id("repeatedPassword")).sendKeys("MM2222");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        Thread.sleep(1000);
        driver.quit();


    }
}
