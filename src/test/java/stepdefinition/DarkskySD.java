package stepdefinition;
import cucumber.api.java.en.*;
import framework.webPages.BasePage;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import framework.webPages.HomePage;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class DarkskySD {
    private HomePage homePage=new HomePage();
    private BasePage basePage=new BasePage();


    @Given("^I am on Darksky homepage$")

    public void iamOnHomePage(){
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Dark Sky - 260 Broadway, New York City, NY");
    }

@Then("^I verify timeline is displayed with two hours incremented$")
public void verifyTimeline2HrsIncremented(){Assert.assertEquals(homePage.darkSkyHrs(),homePage.actualHours());}


@When("^I expand today's timeline$")
public void expandDarkSkyTimeline() throws InterruptedException {homePage.clickOnTimeLine();}

@Then("^I verify lowest and highest temp is displayed correctly$")
public void lowestHighestDisplayedCorrectly(){Assert.assertTrue(homePage.verifyHighLowtempDisplayedCorrectly());}


@Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTemperatureNotGreaterLowerThanDaily(){
        Assert.assertTrue(homePage.VerifyGreaterLowerThanCurrentTemp()); }

@When("^I click on DarkSky API$")
    public void clickOnDarkSkyAPI() throws InterruptedException {
        homePage.clickOnDarkSkyAPI(); }

@And("^I click on signup button$")
    public void clickOnDarkSkySignUp() throws InterruptedException {
        homePage.clickOnDarkSkySignUp(); }

@And("^I enter (.+) into (email address|password|confirm password|username) field on DarkSky page$")
    public void enterDataIntoTextFields(String anyText, String textFields) throws InterruptedException {
        switch (textFields){
            case "email address":
                homePage.darkSkyenterEmail(anyText);
                break;
            case "password":
                homePage.darkSkyenterPassword(anyText);
                break;
            case "confirm password":
                homePage.darkSkyConfirmPassword(anyText);
                break; } }

@And("^I click on register button$")
    public void registerOnDarkSky() throws InterruptedException {
        homePage.darkSkyclickOnregister();
}

@Then("^I verify login verify message on DarkSky page$")
    public void verifySignUpMessage(){
        Assert.assertEquals(homePage.getPageHeader(), "Confirmation Email Sent");
}

@And("^I click on login button$")
    public void clickOnLoginButton(){homePage.darkSkyLogin();}

@And("^I click on submit button$")
    public void clickOnSubmit(){homePage.darkSkySubmit();}

@Then("^I verify account login message on DarkSky page$")
    public void verifyLoginMessage(){
        Assert.assertEquals(homePage.getLoginPageHeader(), "Your Account");
}


@When("^I click on Account Settings button$")










}


