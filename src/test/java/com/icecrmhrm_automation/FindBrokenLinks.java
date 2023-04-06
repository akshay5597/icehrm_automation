package com.icecrmhrm_automation;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLinks {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver","chromedriver.exe");
      WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		List<WebElement> links=driver.findElements(By.tagName("a"));    // get all elements with tagname "a"
		for(int i=0;i<=links.size();i++)
		{
			WebElement element=links.get(i);                            // get single element from array
			String url=element.getAttribute("href");                    // get href value of single element
		//	System.out.println(url);
			if(url!=null && !url.equals("javascript:void(0)"))
			{
				try
				{
					URL uri=new URL(url);                               // convert String url into actual URL
					URLConnection urlConnection= uri.openConnection();  //open the url connection
					HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;// upcast urlConnection in HttpURLConnection
					httpURLConnection.connect();                        // hitting the url
					int statuscode=httpURLConnection.getResponseCode(); // get the status code of an url
					if(statuscode>=300)
					{
						System.out.println("Broken Url :"+"status code: "+statuscode+" url: "+url);//print broken links
					}
					httpURLConnection.disconnect();
				}
				catch(Exception ignored) {
			}
		}
	}
  driver.close();
}
}