package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.CheckboxPage;
import framework.HomePage;
import org.junit.Assert;
import utils.BaseTest;

public class CheckboxTests extends BaseTest {
    BaseTest baseTest=new BaseTest();
    private CheckboxPage checkboxPage;
    private HomePage homePage;
@Given("^user is on homepage$")
    public void userIshomepage(){
    homePage=baseTest.setUp();
}
@When("^user clicks to the Checkboxes link$")
    public void userClicksToTheCheckboxesLink(){
    checkboxPage =homePage.clickCheckBoxLink();
}
@Then("^user sees the Checkboxes text$")
    public void userSeesTheCheckboxesText(){
    String result=checkboxPage.getCheckboxPageTexth3();
    Assert.assertEquals("Checkboxes",result);
}
@When("^user clicks to the first check box$")
    public void userClicksToTheFirstCheckBox(){
    checkboxPage.clickToTheCheckbox1();
}
@Then("^checkbox will be checked$")
    public void isCheckbox1Checked(){
    String result =checkboxPage.isCheckbox1Checked();
    Assert.assertEquals("true",result);
}
@When("^user clicks to the second check box$")
    public void userClicksToTheSecondCheckbox(){
    checkboxPage.clickToTheCheckbox2();
}
@Then("^checkbox will be unchecked$")
    public void isCheckbox2Checked(){
    String result =checkboxPage.isCheckbox2Checked();
    Assert.assertEquals(null,result);
}
@And("^user quits the browser$")
    public void userQuitsTheBrowser(){
    baseTest.tearDown();
}

}
