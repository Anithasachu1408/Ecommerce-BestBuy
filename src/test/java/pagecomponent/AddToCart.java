package pagecomponent;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import utility.WebUtil;

public class AddToCart extends WebUtil {

	@FindBy(xpath = "(//a[@class='us-link'])[1]")
	WebElement us;

	@FindBy(xpath = "//input[@id='gh-search-input']")
	WebElement searchbox;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement MagnifierIcon;

	@FindBy(xpath = "//button[@data-sku-id='6509652']")
	WebElement AddtoCart;
	
	@FindBy(xpath="//button[@class='c-close-icon c-modal-close-icon']")
	WebElement iconclose;
	
	@FindBy(linkText ="Go to Cart")
	WebElement gotocart;
	
	@FindBy(xpath="(//button[@aria-expanded='false'])[10]")
	WebElement Shippingto;
	
	@FindBy(xpath="//input[@id='location']")
	WebElement Enterzip;
	
	@FindBy(xpath ="//button[text()='Update']")
	WebElement update;
	
	@FindBy(xpath ="//button[@class='btn btn-lg btn-block btn-primary']")
	WebElement checkout;
	
	@FindBy(xpath ="//button[@class ='c-button c-button-secondary c-button-lg cia-guest-content__continue guest' and @type='button']")
	WebElement guest;
	
	@FindBy(xpath ="//input[@id='user.emailAddress']")
    WebElement emailtextbox;

    @FindBy(xpath ="//input[@id='user.phone']")
    WebElement phonetextbox;
    
    @FindBy(xpath ="//button[@class='btn btn-lg btn-block btn-secondary']")
    WebElement continuepaymentbtn;
    


	public AddToCart() {
		PageFactory.initElements(WebUtil.driver, this);

	}

	public void addtoshoppingcart() {
		try {
			eleClick(us);
			expWait(searchbox, 2);
			sendkeysMethod(searchbox, "apple macbook");
			expWait(MagnifierIcon, 2);
			eleClick(MagnifierIcon);
			expWait(AddtoCart, 2);
			eleClick(AddtoCart);
			test.addScreenCaptureFromPath(getScreenShot("addtoshoppingcart"));
			test.log(Status.PASS, "addtoshoppingcart is successful");
		} catch (Exception e) {
			test.log(Status.FAIL, "Issue in addtoshoppingcart");
			e.printStackTrace();
		}
	}
	
	public void Checkout()   {
		try {
			eleClick(us);
			expWait(searchbox, 2);
			sendkeysMethod(searchbox, "apple macbook");
			expWait(MagnifierIcon, 2);
			eleClick(MagnifierIcon);
			expWait(AddtoCart, 2);
			eleClick(AddtoCart);
			expWait(gotocart, 2);
			eleClick(gotocart);
			expWait(iconclose, 2);
			eleClick(iconclose);
			expWait(checkout, 3);
			eleClick(checkout);
			expWait(guest, 3);
			eleClick(guest);
			expWait(emailtextbox,3);
			sendkeysMethod(emailtextbox,"dineshsachu747@gmail.com");
			expWait(phonetextbox,3);
			sendkeysMethod(phonetextbox,"9876543210");
			expWait(continuepaymentbtn,2);
			eleClick(continuepaymentbtn);
			test.addScreenCaptureFromPath(getScreenShot("Checkout"));
			test.log(Status.PASS,"Checkout successful");
		} catch (Exception e) {
			test.log(Status.FAIL, "Checkout Failed");
			e.printStackTrace();
		}
		
		
	}
  
}
