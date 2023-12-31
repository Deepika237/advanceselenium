package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbutton;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}