import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/janineparham/selenium/chromedriver");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://betheltech.net";
        String expectedTitle = "Bethel Tech";
        String actualTitle;
        driver.get(baseUrl);

        actualTitle = driver.getTitle();
        if(actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test passed!");
        } else {
            System.out.println("Test failed");
        }

        driver.close();

    }
}
