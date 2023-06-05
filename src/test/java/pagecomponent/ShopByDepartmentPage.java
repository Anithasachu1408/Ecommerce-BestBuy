package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class ShopByDepartmentPage extends WebUtil {

	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement us;

	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement hamburgermenu;

	@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[3]")
	WebElement ComputerTables;

	@FindBy(xpath = "(//button[@class=\"c-button-unstyled hamburger-menu-flyout-list-item \"])[7]")
	WebElement ComputerAccessories;

	@FindBy(xpath = "(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
	WebElement Webcams;

	@FindBy(xpath = "(//button[@type='button'])[33]")
	WebElement AddtoCart;

	public ShopByDepartmentPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}

	public void ShopByDept() {
		try {
			expWait(us,2);
			eleClick(us);
			expWait(hamburgermenu,2);
			eleClick(hamburgermenu);
			//expWait(ComputerTables,2);
			eleClick(ComputerTables);
			expWait(ComputerAccessories,2);
			eleClick(ComputerAccessories);
			expWait(Webcams,2);
			eleClick(Webcams);
			expWait(AddtoCart,2);
			eleClick(AddtoCart);
			test.log(Status.PASS, "Adding item in ShopByDept is successful");
			test.addScreenCaptureFromPath(getScreenShot("ShopByDept"));
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in Adding item in ShopByDept");
			e.printStackTrace();
		}
	}
	
}

