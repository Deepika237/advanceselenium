package Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(linkText = "Register")
	private WebElement registerlink;

	@FindBy(linkText = "Log in")
	private WebElement loginlink;

	public WebElement getloginlink() {
		return loginlink;
	}
	public WebElement getRegisterlink() {
		return registerlink;
	}
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
