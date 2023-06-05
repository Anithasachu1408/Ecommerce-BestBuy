package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class BottomHomePage extends WebUtil{
	
	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement us;
	
	@FindBy(xpath = "//a[@class='body-copy-sm mr-200']")
	WebElement Accessibility;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[2]")
	WebElement TermsandConditions;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[3]")
	WebElement privacy;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[4]")
	WebElement InterestBasedAd;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[5]")
	WebElement StatePrivacy;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[6]")
	WebElement CA;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[7]")
	WebElement LimitUSe;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[8]")
	WebElement TargetedAdv;
	
	@FindBy(xpath="(//a[@class='body-copy-sm mr-200'])[9]")
	WebElement CASupplyChain;
	
	public BottomHomePage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

		public void BottomLinksValidation() {
			try {
				eleClick(us);
				expWait(Accessibility, 2);
				eleClick(Accessibility);
				driver.getTitle();
				String title =driver.getTitle();
				System.out.println(title);
				test.log(Status.PASS, "Accessibility title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating Accessibility title");
				e.printStackTrace();
			}
			
			try {
				expWait(TermsandConditions, 2);
				eleClick(TermsandConditions);
				String title1 =driver.getTitle();
				System.out.println(title1);
				test.addScreenCaptureFromPath(getScreenShot("TermsandConditions"));
				test.log(Status.PASS, "TermsandConditions title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TermsandConditions title");
				e.printStackTrace();
			}
			
			try {
				expWait(privacy, 2);
				eleClick(privacy);
				String title2 =driver.getTitle();
				System.out.println(title2);
				test.addScreenCaptureFromPath(getScreenShot("privacy"));
				test.log(Status.PASS, "privacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating privacy title");
				e.printStackTrace();
			}
			
			try {
				expWait(InterestBasedAd, 2);
				eleClick(InterestBasedAd);
				String title3 =driver.getTitle();
				System.out.println(title3);
				test.addScreenCaptureFromPath(getScreenShot("InterestBasedAd"));
				test.log(Status.PASS, "InterestBasedAd title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating InterestBasedAd title");
				e.printStackTrace();
			}
			
			try {
				expWait(StatePrivacy, 2);
				eleClick(StatePrivacy);
				String title4 =driver.getTitle();
				System.out.println(title4);
				test.addScreenCaptureFromPath(getScreenShot("StatePrivacy"));
				test.log(Status.PASS, "StatePrivacy title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating StatePrivacy title");
				e.printStackTrace();
			}
			
			try {
				expWait(CA, 2);
				eleClick(CA);
				String title5 =driver.getTitle();
				System.out.println(title5);
				test.addScreenCaptureFromPath(getScreenShot("CA"));
				test.log(Status.PASS, "CA title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CA title");
				e.printStackTrace();
			}
			
			navigateback();
			
		
			try {
				expWait(LimitUSe, 2);
				eleClick(LimitUSe);
				String title6 =driver.getTitle();
				System.out.println(title6);
				test.addScreenCaptureFromPath(getScreenShot("LimitUSe"));
				test.log(Status.PASS, "LimitUSe title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating LimitUSe title");
				e.printStackTrace();
			}
			navigateback();
			
			
			try {
				expWait(TargetedAdv, 2);
				eleClick(TargetedAdv);
				String title7 =driver.getTitle();
				System.out.println(title7);
				test.addScreenCaptureFromPath(getScreenShot("TargetedAdv"));
				test.log(Status.PASS, "TargetedAdv title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating TargetedAdv title");
				e.printStackTrace();
			}
			navigateback();
			
			try {
				expWait(CASupplyChain, 2);
				eleClick(CASupplyChain);
				String title8 =driver.getTitle();
				System.out.println(title8);
				test.addScreenCaptureFromPath(getScreenShot("CASupplyChain"));
				test.log(Status.PASS, "CASupplyChain title validated");
			} catch (Exception e) {
				test.log(Status.FAIL, "Issue in validating CASupplyChain title");
				e.printStackTrace();
			}
	}



}
