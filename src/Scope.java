import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {

    public static void main(String[] args) throws InterruptedException {

        //1.Give me the count of links on the page
        //2.Count of footer section

        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://qaclickacademy.com/practice.php");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement columndriver = footerdriver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));

        List<WebElement> listOfHeaderUrl = columndriver.findElements(By.tagName("a"));
        int sizeOfHeaderUrl = listOfHeaderUrl.size();
        System.out.println(sizeOfHeaderUrl);
        String clickonlinkTab = Keys.chord(Keys.COMMAND, Keys.ENTER);

        //4.click on each link in the column and check if the pages are opening
        for (int i = 1; i < sizeOfHeaderUrl; i++) {
            listOfHeaderUrl.get(i).sendKeys(clickonlinkTab);
            Thread.sleep(1000L);
            //open all the tabs


        }
        Set<String> abc = driver.getWindowHandles();
        Iterator<String> it = abc.iterator();
        while (it.hasNext())
        {
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());

        }
    }
}
