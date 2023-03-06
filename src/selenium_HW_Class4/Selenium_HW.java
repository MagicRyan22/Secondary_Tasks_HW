package selenium_HW_Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_HW {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");


            WebElement checkBox=driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
            boolean selected=checkBox.isSelected();
            System.out.println(selected);
            if (!selected){
                checkBox.click();
            }
            selected=checkBox.isSelected();
            System.out.println(selected);
            var checkBoxes=driver.findElements(By.cssSelector("input[class='cb1-element']"));
            for (var button : checkBoxes) {
                String checkBox1 = button.getAttribute("value");
                if (checkBox1.equalsIgnoreCase("Option-3")) {
                    button.click();
                }
            }
            try {
                Thread.sleep(1000);
            }catch (Exception e){
                System.out.println(e);
            }
            driver.quit();
    }
}
