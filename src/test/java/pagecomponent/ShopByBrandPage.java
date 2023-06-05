package pagecomponent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class ShopByBrandPage extends WebUtil{
	
	@FindBy(xpath="(//a[@class='us-link'])[1]")
	WebElement us;
	
	@FindBy(xpath = "(//button[@type='button'])[2]")
	WebElement hamburgermenu;
	
	@FindBy(xpath="(//button[@class=\"c-button-unstyled top-four v-fw-medium\"])[3]")
	WebElement Brands;
	
	@FindBy(xpath="(//a[@class=\"hamburger-menu-flyout-list-item  \"])[5]")
	WebElement Sony;
	
	@FindBy(linkText="Sony home audio")
	WebElement sonyhomeaudio;
	
	@FindBy(xpath="(//button[@class=\"c-button c-button-primary c-button-sm c-button-block c-button-icon c-button-icon-leading add-to-cart-button\"])[1]")
	WebElement addtocart;
	
	public ShopByBrandPage() {
		PageFactory.initElements(WebUtil.driver, this);
	}
	
	public void ShopByBrand() {
		
		try {
			eleClick(us);
			expWait(hamburgermenu,2);
			eleClick(hamburgermenu);
			expWait(Brands,2);
			eleClick(Brands);
			expWait(Sony,2);
			eleClick(Sony);
			expWait(sonyhomeaudio,2);
			eleClick(sonyhomeaudio);
			expWait(addtocart,2);
			eleClick(addtocart);
			test.addScreenCaptureFromPath(getScreenShot("ShopByBrand"));
			test.log(Status.PASS, "ShopByBrand successfull");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in ShopByBrand");
			e.printStackTrace();
		}
	}
	

}
