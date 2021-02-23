package org.pages;

import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mvn.Baseclass;
import org.mvn.ExcelRead;
import org.openqa.selenium.remote.server.handler.SendKeys;

import static org.mvn.ExcelRead.*;

public class DatadrivenTestng extends Baseclass {
	@BeforeClass
	public static void beforeclass() {
		System.out.println("before launch");
		launchbrowser();
	}

	@Before
	public void before() {
		System.out.println("start time ...." + new Date());
	}

	@After
	public void after() {
		System.out.println("end time...." + new Date());
	}

	@AfterClass
	public static void afterclass() {
		// quit();
	}

	@Test
	public void test() throws Exception {
		launchurl("https://www.facebook.com/");
		implictwait(50, TimeUnit.SECONDS);
		Facebookpage fb = new Facebookpage();
		filltextbox(fb.getTxtusername(), getdata("sheet1", 1, 1));
		dataupdate("sheet1", 3, 0, "priya", "krishnapriya");
		filltextbox(fb.getTxtpassword(), getdata("sheet1", 3, 0));
		System.out.println(getAttribute(fb.getTxtusername()));
		System.out.println(getAttribute(fb.getTxtpassword()));
		btnclick(fb.getLoginbtn());
		// Thread.sleep(3000);
		// screenShot("fbdd");
	}

}
