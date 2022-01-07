package com.tvoMpower.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	
Properties pro;
	
	public ReadConfig()
	{
		
		//Get data from configuration file
		
		String srcpath = System.getProperty("user.dir") +"\\configuration\\\\config.properties";
		
		File src =  new File(srcpath);
		
		try
		{
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}catch(Exception e) {
			System.out.println("Exception is "+ e.getMessage());
		}
		
		
	}
	
	public String getApplicationURL()
	{
		String url= pro.getProperty("baseURL");
		return url;
	}
	


	
	public String getFirstName()
	{
		String firstname= pro.getProperty("fname");
		return firstname;
	}
	
	public String getLastName()
	{
		String lastname= pro.getProperty("lname");
		return lastname;
	}
	
	public int getRoleIndex()
	{
		int rindex= Integer.parseInt(pro.getProperty("roleindex"));
		return rindex;
	}
	public int getBoardIndex()
	{
		int bindex= Integer.parseInt(pro.getProperty("boardindex"));
		return bindex;
	}
	public int getSchoolIndex()
	{
		int sindex= Integer.parseInt(pro.getProperty("schoolindex"));
		return sindex;
	}
	
	public String getEmailId()
	{
		String email= pro.getProperty("emailid");
		return email;
	}
	
	public String getPassword()
	{
		String password= pro.getProperty("pwd");
		return password;
	}
	
	
	public int getSourceIndex()
	{
		int soindex= Integer.parseInt(pro.getProperty("sourceindex"));
		return soindex;
	}
	

}

	
	
	
	

