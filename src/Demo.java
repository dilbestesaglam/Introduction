import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

    public static void main(String[] args) {

        //Create driver object for Chrome Driver
        System.setProperty("webdriver.chrome.driver", "/Users/dilbestesaglam/IdeaProjects/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com"); //Hit url on the browser
        System.out.println(driver.getTitle()); //validate if your page title is correct
        System.out.println(driver.getCurrentUrl()); //validate if you are landed on correct url
        //System.out.println(driver.getPageSource()); //print page source
        driver.navigate().to("http://yahoo.com");
        //driver.navigate().back();
        //driver.navigate().forward();
        driver.close(); //It closes current browser
        //driver.quit(); //It closes all the browsers opened by selenium script







    }
}
