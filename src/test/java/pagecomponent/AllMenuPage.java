package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class AllMenuPage extends WebUtil{
	
	@FindBy(xpath="(//a[@class=\"us-link\"])[1]")
	WebElement us;
	
	@FindBy(xpath="//a[text()=\"Top Deals\"]")
	WebElement topdeals;
	
	@FindBy(xpath="//a[text()=\"Deal of the Day\"]")
	WebElement Dealoftheday;
	
	@FindBy(xpath="//a[text()=\"Totaltech Membership\"]")
	WebElement Totaltech;
	
	@FindBy(xpath="//a[text()=\"Credit Cards\"]")
	WebElement Creditcards;
	
	@FindBy(xpath="//a[text()=\"Gift Cards\"]")
	WebElement GiftCards;
	
	@FindBy(xpath="//a[text()=\"Gift Ideas\"]")
	WebElement GiftIdeas;
	
	@FindBy(xpath="//a[text()=\"Health & Wellness\"]")
	WebElement HealthWellness;
	
	@FindBy(xpath="//a[text()='Best Buy Outlet']")
	WebElement BestBuyOutlet;
	
	@FindBy(xpath="//span[@class=\"v-p-right-xxs utility-nav-drawer-btn-label\"]")
	WebElement more;
	
	@FindBy(xpath="//a[@class=\"utility-menu-flyout-list-item\"]")
	WebElement BestBuyBusiness;
	
	@FindBy(xpath="//button[@class=\"c-button-link menuCloseBtn accountMenuCloseButton\"]")
	WebElement close;
	
	public AllMenuPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void Menu() throws InterruptedException {
		try {
			eleClick(us);
			expWait(topdeals,2);
			eleClick(topdeals);
			String title =driver.getTitle();
			Assert.assertEquals(title, "Top Deals and Featured Offers on Electronics - Best Buy");
			test.log(Status.PASS, "TopDeals Title validated");
			test.addScreenCaptureFromPath(getScreenShot("topdeals"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating TopDeals title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Dealoftheday);
			String title1 =driver.getTitle();
			Assert.assertEquals(title1, "Deal of the Day: Electronics Deals - Best Buy");
			test.log(Status.PASS, "Dealoftheday Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Dealoftheday"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Dealoftheday title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Totaltech);
			String title2 =driver.getTitle();
			Assert.assertEquals(title2, "Best Buy Totaltech™ – Best Buy");
			test.log(Status.PASS, "Totaltech Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Totaltech"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Totaltech title");
			e.printStackTrace();
		}
		
		try {
			eleClick(Creditcards);
			String title3 =driver.getTitle();
			Assert.assertEquals(title3, "Best Buy Credit Card: Rewards & Financing");
			test.log(Status.PASS, "Creditcards Title validated");
			test.addScreenCaptureFromPath(getScreenShot("Creditcards"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Creditcards title");
			e.printStackTrace();
		}
  
		try {
			eleClick(GiftCards);
			String title4 =driver.getTitle();
			Assert.assertEquals(title4, "Gifts Cards and E-Gift Cards - Best Buy");
			test.log(Status.PASS, "GiftCards Title validated");
			test.addScreenCaptureFromPath(getScreenShot("GiftCards"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftCards title");
			e.printStackTrace();
		}
		
		try {
			eleClick(GiftIdeas);
			String title5 =driver.getTitle();
			Assert.assertEquals(title5, "Gift Ideas 2023: Best Gifts to Give This Year - Best Buy");
			test.log(Status.PASS, "GiftIdeas Title validated");
			test.addScreenCaptureFromPath(getScreenShot("GiftIdeas"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating GiftIdeas title");
			e.printStackTrace();
		}
		try {
			eleClick(HealthWellness);
			String title6 =driver.getTitle();
			Assert.assertEquals(title6, "Health & Wellness Solutions & Technology - Best Buy");
			test.log(Status.PASS, "HealthWellness Title validated");
			test.addScreenCaptureFromPath(getScreenShot("HealthWellness"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating HealthWellness title");
			e.printStackTrace();
		}
		
		try {
			eleClick(BestBuyOutlet);
			String title7 = driver.getTitle();
			Assert.assertEquals(title7, "Best Buy Outlet: Clearance Electronics Outlet Store – Best Buy");
			test.log(Status.PASS, "BestBuyOutlet Title validated");
			test.addScreenCaptureFromPath(getScreenShot("BestBuyOutlet"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating BestBuyOutlet title");
			e.printStackTrace();
		}
		
		try {
			eleClick(more);
			expWait(BestBuyBusiness,2);
			eleClick(BestBuyBusiness);
			String title8 = driver.getTitle();
			Assert.assertEquals(title8, "Best Buy for Business - Best Buy");
			test.log(Status.PASS, "Best Buy for Business validated");
			test.addScreenCaptureFromPath(getScreenShot("BestBuyBusiness"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in validating Best Buy for Business validated title");
			e.printStackTrace();
		}
		  
		try {
			eleClick(more);
			expWait(close,2);
			eleClick(close);
			test.log(Status.PASS, "closed icon sucessfully");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in closing icon");
			e.printStackTrace();
		}
	}

}
	

	
	
