package framework.webPages;

import gherkin.lexer.Th;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.context.annotation.Primary;
import stepdefinition.SharedSD;
import sun.security.provider.SHA;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class HomePage extends BasePage{


	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("firstName");
	private By lastNameTextField = By.id("lastName");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	private By messengerLink = By.id("");
	private By darkSkyHours = By.xpath("//span[contains(@class,'hour')]//span");
	private By darkSkyTemperatures= By.xpath("//span[contains(@style,'opacity')]//span");
	private By darkSkyLowestTemperature=By.xpath("//span[@class='first']");
	private By darkSkyCurrentTemperature=By.xpath("//span[@class='summary swap']");
	private By darkSkyLowestTemp=By.xpath("//span[@class='summary-high-low']//span[contains(text(),'˚')][2]");
	private By darkSkyHighestTemp=By.xpath("//span[@class='summary-high-low']//span[contains(text(),'˚')][3]");
	private By darkSkyTimeLine=By.xpath("//a[1]//span[2]//span[2]");
	private By darkSkyTimelineHigh=By.xpath("//span[@class='lowTemp swap']//span[@class='temp'][contains(text(),'˚')]");
	private By darkSkyTimelineLow=By.xpath("//span[@class='highTemp swip']//span[@class='temp'][contains(text(),'˚')]");
	private By darkSkyAPI=By.xpath("//div[@class='inner']//a[contains(text(),'Dark Sky API')]");
	private By darkSkySignup=By.xpath("//a[@class='button filled']");
	private By darkSkyEmailField=By.xpath("//input[@placeholder='hacker@example.com']");
	private By darkSkyPasswordField=By.xpath("//input[@name='password']");
	private By darkSkyConfirmationPassword=By.xpath("//input[@name='confirmation']");
	private By darksSkyRegister=By.xpath("//button[@type='submit']");
	private By darkSkyPageHeader=By.xpath("//h1[contains(text(),'Confirmation Email Sent')]");
	private By darkSkyLogIn=By.xpath("//a[contains(text(),'Log In')]");
	private By darkSkySubmit=By.xpath("//button[@type='submit']");
	private By darkSkyLoginPageHeader=By.xpath("//h2[contains(text(),'Your Account')]");
	private By darkSkyAccountSettings=By.xpath("//a[contains(text(),'Account Settings')]");
	private By darkSkyBillingEmail= By.xpath("//input[@name='billing_email']");
	private By darkSkyAccountPassword=By.xpath("//form[@class='edit-account']//input[@name='password']");
	private By darkSkyDailyUsage=By.xpath("//input[@name='call-limit']");
	private By darkSkyUpdateButton=By.xpath("//form[@class='edit-account']//button[@type='submit'][contains(text(),'Update')]");
	private By darkSkyCardHolderName=By.xpath("//input[@name='cardholder_name']");
	private By darkSkyCardNumber=By.xpath("//input[@data-stripe='number']");
	private By darkSkyCardSelectMonth=By.xpath("//select[@data-stripe='exp-month']");
	private By darkSkySelectYear=By.xpath("//select[@data-stripe='exp-year']");
	private By darkSkyCVC=By.xpath("//input[@placeholder='123']");
	private By darkSkyAddressLine1=By.xpath("//input[@data-stripe='address_line1']");
	private By darkSkyAddressLine2=By.xpath("//input[@data-stripe='address_line2']");
	private By darkSkyAddressCity=By.xpath("//input[@data-stripe='address_city']");
	private By darkSkyAddressState=By.xpath("//input[@data-stripe='address_state']");
	private By darkSkyAddressZip=By.xpath("//input[@data-stripe='address_zip']");
	private By darkSkyAddressCountry=By.xpath("//input[@data-stripe='address_country']");
	private By darkSkyAddCard=By.xpath("//button[contains(text(),'Add Card')]");
	private By darkSkyInvoiceAddress=By.xpath("//textarea[@name='invoice-address']");









////span[@class='temp'][contains(text(),'˚')]
	//span[@class='lowTemp swap']//span[@class='temp']

	public boolean VerifyGreaterLowerThanCurrentTemp(){
		//getTextFromElement(darkSkyCurrentTemperature);
		//String currentt=SharedSD.getDriver().findElement(By.xpath("//span[@class='summary swap']")).getText();
		getTextFromElement(darkSkyLowestTemp);
		getTextFromElement(darkSkyHighestTemp);
		int currentTemperature=Integer.parseInt(getTextFromElement(darkSkyCurrentTemperature).substring(0,2));
		int lowestTemperature=Integer.parseInt(getTextFromElement(darkSkyLowestTemp).substring(5,7));
		int highestTemperature=Integer.parseInt(getTextFromElement(darkSkyHighestTemp).substring(6,8));
		if(currentTemperature>=lowestTemperature && currentTemperature<=highestTemperature){
			return true;
		}
		else {
			return false; } }

	public void darkSkyClickOnSettings(){clickOn(darkSkyAccountSettings);}

	public void darkSkyEnterBillingEmail(String enterBillingEmail) throws InterruptedException {setValue(darkSkyBillingEmail, enterBillingEmail);Thread.sleep(3000);}

	public void darkSkyEnterAcctPassword(String enterAcctPassword) throws InterruptedException{setValue(darkSkyAccountPassword, enterAcctPassword);Thread.sleep(3000);}

	public void darkSkyEnterUsage(String usage) throws InterruptedException{setValue(darkSkyDailyUsage, usage);Thread.sleep(3000);}

	public void darkSkyClickOnUpdate(){clickOn(darkSkyUpdateButton);}

	public void darkSkyEnterCardholdersName(String enterCardHoldersName)throws InterruptedException{setValue(darkSkyCardHolderName, enterCardHoldersName);
		Thread.sleep(3000); }

	public void enterDarkSkyEnterCardNumber(String cardNumber)throws InterruptedException{setValue(darkSkyCardNumber,cardNumber);Thread.sleep(3000);}

	public void darkSkySubmit(){clickOn(darkSkySubmit);}

	public void darkSkyLogin(){clickOn(darkSkyLogIn);}

	public String getPageHeader(){
		return getTextFromElement(darkSkyPageHeader); }

	public String getLoginPageHeader(){
		return getTextFromElement(darkSkyLoginPageHeader);
	}

	public void clickOnDarkSkyAPI() throws InterruptedException {clickOn(darkSkyAPI);Thread.sleep(3000);}
	public void clickOnDarkSkySignUp() throws InterruptedException {clickOn(darkSkySignup);Thread.sleep(3000);}
	public void darkSkyenterEmail(String enterEmail) throws InterruptedException {setValue(darkSkyEmailField, enterEmail);Thread.sleep(3000);}
	public void darkSkyenterPassword(String enterPassword) throws InterruptedException {setValue(darkSkyPasswordField, enterPassword);Thread.sleep(3000);}
	public void darkSkyConfirmPassword(String reenterPassword) throws InterruptedException {setValue(darkSkyConfirmationPassword, reenterPassword);Thread.sleep(3000);}
	public void darkSkyclickOnregister() throws InterruptedException {clickOn(darksSkyRegister); Thread.sleep(3000);}

	public boolean verifyHighLowtempDisplayedCorrectly(){
		getTextFromElement(darkSkyTimelineLow);
		getTextFromElement(darkSkyTimelineHigh);
		getTextFromElement(darkSkyLowestTemp);
		getTextFromElement(darkSkyHighestTemp);

		int lowestTemperature=Integer.parseInt(getTextFromElement(darkSkyLowestTemp).substring(5,7));
		int highestTemperature=Integer.parseInt(getTextFromElement(darkSkyHighestTemp).substring(6,8));
		int timeLineLowTemp=Integer.parseInt(getTextFromElement(darkSkyTimelineLow).substring(0,2));
		int timeLineHighTemp=Integer.parseInt(getTextFromElement(darkSkyTimelineHigh).substring(0,2));
		if(timeLineLowTemp<=timeLineHighTemp && timeLineLowTemp==lowestTemperature && timeLineHighTemp==highestTemperature){
			return true;
		}
else{
	return false;
		}
	}

	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}

	public void clickOnDarkSkyHourTimeline() throws InterruptedException {

		((JavascriptExecutor)SharedSD.getDriver()).executeScript("arguments[0].scrollIntoView(true);",darkSkyTimeLine);
		Thread.sleep(3000);
		clickOn(darkSkyTimeLine);}

		public void clickOnTimeLine() throws InterruptedException {

	WebElement element = SharedSD.getDriver().findElement(By.xpath("//a[1]//span[2]//span[2]"));
        ((JavascriptExecutor) SharedSD.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(3000);
        element.click();
        Thread.sleep(3000);}


	public List getHoursFromDarksky(){getWebElements(darkSkyHours);
		List<String> darkSkyHours = new ArrayList<String>();
	return darkSkyHours;}

	public List<String> darkSkyHrs(){
		List<WebElement> hours=SharedSD.getDriver().findElements(darkSkyHours);
		List<String>HourValues=new ArrayList<String>();
		for (WebElement hour:hours){
			HourValues.add(hour.getText());
		}
		return HourValues;
	}

	public int[] darkSkyTemperatured(){
		List<WebElement>dailyTemperatures=SharedSD.getDriver().findElements(darkSkyTemperatures);
		int [] dailyTemp={};
		for(int i=0; i<dailyTemperatures.size();i++){
			String text=dailyTemperatures.get(i).getText();
			dailyTemp[i]=Integer.parseInt(text);

		}
		return dailyTemp;
	}



	String CheckInDate(){
		Calendar calendar=Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH,1);
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd");
		return dateFormat.format(calendar.getTime()); }


	public List<String> actualHours() {
		ArrayList<String> hours = new ArrayList<String>();
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat df=new SimpleDateFormat("ha");

		SimpleDateFormat startHourFormat= new SimpleDateFormat("H");
		int startHour = Integer.parseInt(startHourFormat.format(cal.getTime()));

		SimpleDateFormat endHourFormat= new SimpleDateFormat("H");
		cal.add(Calendar.HOUR,22);
		int endHour=Integer.parseInt(endHourFormat.format(cal.getTime()));

		for (int i=startHour+2; i<=startHour+22; i+=2){
			cal.set(Calendar.HOUR_OF_DAY,i);
			hours.add(df.format(cal.getTime()).toLowerCase());}
			hours.add(0,"Now");

			return hours;}



	}


















