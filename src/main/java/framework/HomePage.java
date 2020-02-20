package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(linkText = "Checkboxes")
    private WebElement checkBoxesPageLink;
    public CheckboxPage clickCheckBoxLink(){
        driver.findElement(By.linkText("Checkboxes")).click();
        return new CheckboxPage(driver);
    }

}
