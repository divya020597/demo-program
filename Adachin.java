package org.pages;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mvn.Baseclass;

public class Adachin extends Baseclass {
	@BeforeClass
	public static void browserLaunch() {
		launchbrowser();
	    }
	@Before
	public void url() {
    System.out.println("date"+new Date());
	}
	@Test
	public void test1() {
		launchurl("https://adactinhotelapp.com/");
		AdachinJunit ad = new AdachinJunit();
		implictwait(50, TimeUnit.SECONDS);
	    filltextbox(ad.getTxtuserName(),"PavithraPrabhu");
	    filltextbox(ad.getTxtpasswd(), "prabhu2701");
	    btnclick(ad.getBtnclick());
	    bytxt(ad.getLocation(), "London");
	    bytxt(ad.getHotel(), "Hotel Hervey");
	    bytxt(ad.getRoomtype(), "Double");
	    bytxt(ad.getNoroom(), "1 - One");
	    filltextbox(ad.getChckin(), "09/09/2021");
	    filltextbox(ad.getChckout(), "10/09/2021");
	    bytxt(ad.getAdltperroom(), "1 - One");
	    bytxt(ad.getChldperroom(), "1 - One");
	    btnclick(ad.getSearch());
	    btnclick(ad.getSelectoptn());
	    btnclick(ad.getContinues());
	    filltextbox(ad.getFirstname(), "kjhkfhsf");
	    filltextbox(ad.getLastname(), "sf");
	    filltextbox(ad.getAddress(), "kjhkfhsf");
	    filltextbox(ad.getCrdno(), "1234567891012345");
	    bytxt(ad.getCardtype(), "American Express");
	    bytxt(ad.getMonth(), "April");
	    bytxt(ad.getYears(),"2021");
	    filltextbox(ad.getCvvnumber(), "987");
	    btnclick(ad.getBooknow());
	    String txt = getAttribute(ad.getOrderno());
	    System.out.println(txt);
	    
	}
	@After
	public void afterTime() {
         System.out.println("end time"+new Date());
	}
	@AfterClass
	public static void afterClass() {
       quit();
	}

}
