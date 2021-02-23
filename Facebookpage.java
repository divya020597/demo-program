package org.pages;

import org.mvn.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage extends Baseclass {
	public Facebookpage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	private WebElement txtusername;
	@FindBy(id="pass")
	private WebElement txtpassword;
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	@FindBy(xpath="//button[@id='u_0_b']")
	private WebElement loginbtn;
	
	

}
