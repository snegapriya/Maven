package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.pomclass.Home_Page;
import com.pomclass.Login_Page;

public class Page_Object_Manager {

	public WebDriver driver; // null
	// private classname objname;

	private Home_Page home;

	private Login_Page login;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
	}

	public Home_Page getInstanceHome() {

		if (home == null) {

			home = new Home_Page(driver);
		}
		return home;
	}

	public Login_Page getInstanceLogin() {

		if (login == null) {

			login = new Login_Page(driver);
		}
		return login;

	}

}
