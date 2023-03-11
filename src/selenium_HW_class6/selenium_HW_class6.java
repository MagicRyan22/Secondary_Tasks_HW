package selenium_HW_class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class selenium_HW_class6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();

        //  1)
        driver.navigate().to("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.findElement(By.xpath("//div[@id='finish']")).click();
        WebElement isPresent=driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        System.out.println("Hello World is displayed? : "+isPresent.isDisplayed());


        //  2)
        driver.navigate().to("https://the-internet.herokuapp.com/iframe");
        driver.switchTo().frame("mce_0_ifr");
        WebElement textBox=driver.findElement(By.xpath("//body[@id='tinymce']"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys("Hello World!");
        System.out.println(textBox.getText());
        driver.switchTo().defaultContent();
        driver.quit();



    }
}
