package testcomponent;

import org.testng.annotations.Test;

import enginecomponent.Base;
import pagecomponent.AddToCart;
import pagecomponent.AllMenuPage;
import pagecomponent.BottomHomePage;
import pagecomponent.HomePage;
import pagecomponent.ShopByBrandPage;
import pagecomponent.ShopByDepartmentPage;

@Test
public class RegressionTesting extends Base {

	@Test
	public void testcase01() throws InterruptedException {
		HomePage obj = new HomePage();
		obj.SignInPositiveScenario();
	}

	@Test
	public void testcase02() throws InterruptedException {
		HomePage obj = new HomePage();
		obj.SignInNegativeScenario();

	}

	@Test
	public void testcase03() throws InterruptedException {
		AllMenuPage obj = new AllMenuPage();
		obj.Menu();

	}

	@Test
	public void testcase04() {
		BottomHomePage obj = new BottomHomePage();
		obj.BottomLinksValidation();
	}

	@Test
	public void testcase05() {
		AddToCart obj = new AddToCart();
		obj.addtoshoppingcart();
	}

	@Test
	public void testcase06() throws InterruptedException {
		ShopByDepartmentPage obj = new ShopByDepartmentPage();
		obj.ShopByDept();
	}

	@Test
	public void testcase07() {
		ShopByBrandPage obj = new ShopByBrandPage();
		obj.ShopByBrand();
	}

	@Test
	public void testcase08() {
		AddToCart obj = new AddToCart();
		obj.Checkout();
	}
}
