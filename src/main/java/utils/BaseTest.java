package utils;

import framework.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    private WebDriver driver;
    public HomePage setUp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\artem\\" +
                "IdeaProjects\\theinternetherokuappTestProject\\src\\main\\resources\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        return new HomePage(driver);
    }
    public void tearDown(){
        driver.quit();
    }

}
