package com.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader
{
	public static Properties envProperties= new Properties();
	public static Properties configProperties= new Properties();
	public static Properties dataProperties= new Properties();
	
	static
	{
		try 
		{
envProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//properties//Environment.properties"));
configProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//properties//"+envProperties.getProperty("env")+"Config.properties"));
dataProperties.load(new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//properties//"+envProperties.getProperty("env")+"data.properties"));		
		
		} 
		catch (FileNotFoundException e) 
		{			
			e.printStackTrace();
		} catch (IOException e) 
		{			
			e.printStackTrace();
		}	
		
	}
	
	public static String getConfigProperties(String key)
	{
		return (String) configProperties.getProperty(key);
		
	}
	
	public static String getDataProperties(String key)
	{
		return (String) dataProperties.getProperty(key);
		
	}

	
	}

