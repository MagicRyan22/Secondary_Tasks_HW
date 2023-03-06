package selenium_HW_Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_HW {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//a[text()='Proceed Anyway']")).click();

        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys("This is a joke");

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        WebElement message= driver.findElement(By.xpath("//label[text()='Your Message: ']"));
        System.out.println(message.getText());
        WebElement messageIs=driver.findElement(By.xpath("//span[text()='This is a joke']"));
        System.out.println(messageIs.getText());
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("10");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("20");
        driver.findElement(By.xpath("//button[text()='Get Total']")).click();
    }
}
