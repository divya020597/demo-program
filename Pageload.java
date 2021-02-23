package org.pages;

import org.mvn.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Pageload extends Baseclass{
	public Pageload() {
    PageFactory.initElements(driver, this);
	}
	@FindBy(id="inputValEnter")
	private WebElement searchbox;
	
	private WebElement sendtxt;
	private WebElement txtusername;
	private WebElement txtpassname;
	//@FindBy(class="searchformButton col-xs-4 rippleGrey")
	private WebElement btnlogin;
	
	public WebElement getSearchbox() {
		return searchbox;
	}
	public WebElement getSendtxt() {
		return sendtxt;
	}
	public WebElement getTxtpassname() {
		return txtpassname;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	
	

}
