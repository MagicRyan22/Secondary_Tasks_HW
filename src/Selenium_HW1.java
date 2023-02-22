import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

/**
 * 1. launch the browser
 * 2. navigate to amazon web site
 * 3. print out the title and the url in the console
 * 4. close the browser
 */
public class Selenium_HW1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.amazon.com/");
        String url=driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();
        Thread.sleep(2000);
        driver.quit();
    }
}
