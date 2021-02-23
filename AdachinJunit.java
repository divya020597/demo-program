package org.pages;

import org.mvn.Baseclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdachinJunit extends Baseclass {
	public AdachinJunit() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement txtuserName;
	@FindBy(id="password")
	private WebElement txtpasswd;
	@FindBy(id="login")
	private WebElement btnclick;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotel;
	@FindBy(id="room_type")
	private WebElement roomtype;
	@FindBy(id="room_nos")
	private WebElement noroom;
	@FindBy(id="datepick_in")
	private WebElement chckin;
	@FindBy(id="datepick_out")
	private WebElement chckout;
	@FindBy(id="adult_room")
	private WebElement adltperroom;
	@FindBy(id="child_room")
	private WebElement chldperroom;
	@FindBy(id="Submit")
	private WebElement search;
	@FindBy(id="radiobutton_0")
	private WebElement selectoptn;
	@FindBy(id="continue")
	private WebElement continues;
	@FindBy(id="first_name")
	private WebElement firstname;
	@FindBy(id="last_name")
	private WebElement lastname;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement crdno;
	@FindBy(id="cc_type")
	private WebElement cardtype;
	@FindBy(id="cc_exp_month")
	private WebElement month;
	@FindBy(id="cc_exp_year")
	private WebElement years;
	@FindBy(id="cc_cvv")
	private WebElement cvvnumber;
	@FindBy(id="book_now")
	private WebElement booknow;
	@FindBy(id="order_no")
	private WebElement orderno;
	
	public WebElement getSelectoptn() {
		return selectoptn;
	}
	public WebElement getContinues() {
		return continues;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCrdno() {
		return crdno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoroom() {
		return noroom;
	}
	public WebElement getChckin() {
		return chckin;
	}
	public WebElement getChckout() {
		return chckout;
	}
	public WebElement getAdltperroom() {
		return adltperroom;
	}
	public WebElement getChldperroom() {
		return chldperroom;
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotel() {
		return hotel;
	}
	public WebElement getTxtuserName() {
		return txtuserName;
	}
	public WebElement getTxtpasswd() {
		return txtpasswd;
	}
	public WebElement getBtnclick() {
		return btnclick;
	}

}
