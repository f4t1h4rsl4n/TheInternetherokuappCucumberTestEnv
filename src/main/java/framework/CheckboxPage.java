package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckboxPage {
    private WebDriver driver;
    private List<WebElement> list;
    public CheckboxPage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(tagName = "h3")
    private WebElement checkboxPageh3Text;
    @FindBy(linkText = " checkbox 1")
    private WebElement checkBox1;
    @FindBy(linkText = " checkbox 2\n")
    private WebElement checkBox2;

    public void clickToTheCheckbox1(){
        list=driver.findElements(By.tagName("input"));
       list.get(0).click();
    }
    public void clickToTheCheckbox2(){
        list.get(1).click();
    }
    public String isCheckbox1Checked(){
        return list.get(0).getAttribute("checked");
    }
    public String isCheckbox2Checked(){
        return list.get(1).getAttribute("checked");
    }
    public String getCheckboxPageTexth3(){
        return driver.findElement(By.tagName("h3")).getText();
    }


}
