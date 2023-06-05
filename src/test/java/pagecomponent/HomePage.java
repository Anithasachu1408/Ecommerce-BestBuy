package pagecomponent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class HomePage extends WebUtil {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement us;

	@FindBy(xpath = "//span[text()='Account']")
	WebElement account;

	@FindBy(xpath = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	WebElement Signin;

	@FindBy(xpath = "//input[@type='email']")
	WebElement Username;

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//button[@class=\"c-button c-button-secondary c-button-lg c-button-block c-button-icon c-button-icon-leading cia-form__controls__submit \"]")
	WebElement Submit;

	

	public HomePage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void SignInPositiveScenario() throws InterruptedException {
		try {
			expWait(us, 2);
			eleClick(us);
			expWait(account, 2);
			eleClick(account);
			expWait(Signin, 2);
			eleClick(Signin);
			sendkeysMethod(Username, "dineshsachu747@gmail.com");
			sendkeysMethod(Password, "Dinesh@24");
			eleClick(Submit);
			test.addScreenCaptureFromPath(getScreenShot("SignInPositiveScenario"));
			test.log(Status.PASS, "Signin Successful");
		} catch (Exception e) {
			test.log(Status.FAIL, "Signin Failed");
			e.printStackTrace();
		}
	}

	public void SignInNegativeScenario() throws InterruptedException {

		try {
			eleClick(us);
			expWait(account, 2);
			eleClick(account);
			expWait(Signin, 2);
			eleClick(Signin);
			sendkeysMethod(Username, "hkdkael@gmail.co");
			sendkeysMethod(Password, "fhjafkjdfj");
			eleClick(Submit);
			test.addScreenCaptureFromPath(getScreenShot("SignInNegativeScenario"));
			test.log(Status.PASS, "Signin with incorrect credentials successfull");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in signin up with incorrect credentials");
			e.printStackTrace();
		}
	}

	
        
		

	
}
