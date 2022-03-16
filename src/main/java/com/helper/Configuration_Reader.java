package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\asus\\eclipse-workspace_8\\Maven_Project\\src\\main\\java\\com\\helper\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);

	}

	public String getUrl() throws Throwable {

		String url = p.getProperty("url");

		return url;

	}

	public String getEmail() throws Throwable {

		String email = p.getProperty("email");

		return email;
	}

	public String getPassword() throws Throwable {

		String password = p.getProperty("password");

		return password;

	}

}
