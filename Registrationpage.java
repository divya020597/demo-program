package org.pages;

import java.util.concurrent.TimeUnit;

import org.mvn.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registrationpage extends Baseclass { 
	public static void main(String[] args)throws Exception {

		launchbrowser();
		launchurl("https://www.snapdeal.com/");
		maxi();
		implictwait(50, TimeUnit.SECONDS);
		Pageload pg = new Pageload();
		filltextbox(pg.getSearchbox(),"heatsphones");
		WebElement clk = driver.findElement(By.xpath("//button[@class=\"searchformButton col-xs-4 rippleGrey\"]"));
		btnclick(clk);
		WebElement pd = driver.findElement(By.xpath("(//img[@class=\"product-image \"])[1]"));
		btnclick(pd);
		wndwhnd();
		implictwait(50, TimeUnit.SECONDS);
		//scrolldwnandup("//div[@id='buy-button-id']");
		WebElement e = driver.findElement(By.xpath("//div[@id='add-cart-button-id']"));
		btnclick(e);
		
	}
	

}
