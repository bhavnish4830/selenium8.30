package zerodhaproject;

import java.util.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class first {

	public static void main(String[] args) {
		
		
		int  a= 500000;
		int k=11;
		
		for(int i =0; i< k;i++)
		{
			a = a+ a/2;
			
		}
		System.out.println(a);
	}

}
