package com.webtest.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class TestDemo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//如果chrome浏览器没有默认安装在C盘，需要制定其路径
		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Documents/autotest/selenuim/ChromeDrive/chromedriver");
		//定义驱动对象为 chromedriver 对象
		WebDriver driver = new ChromeDriver();
		//驱动的网址
        driver.get("http://www.yingbeijf.com/index");
        //浏览器窗口变大
        driver.manage().window().maximize();
        //定位输入框元素
        //WebElement txtbox = driver.findElement(By.cssSelector(".textcenter.ft14.ftbold"));
        //txtbox.click();
        
      WebElement txtbox_appdown = driver.findElement(By.cssSelector(".ft16.ftbold.relative"));
      txtbox_appdown.click();
      
      WebElement txtbox_aboutus = driver.findElement(By.cssSelector(".ft16.ftbold"));
      txtbox_aboutus.click();
        
      WebElement txtbox_firstpage = driver.findElement(By.cssSelector(".textcenter.ft14.ftbold"));
      txtbox_firstpage.click();
          
       /* WebElement txtbox_mobile = driver.findElement(By.id("bo_1"));
        txtbox_mobile.click();
        txtbox_mobile.sendKeys("13917357664");
        
        WebElement txtbox_pwd = driver.findElement(By.id("userPwd"));
        txtbox_pwd.click();
        txtbox_pwd.sendKeys("F12345678");
       
        //定位按钮元素
        WebElement login_btn = driver.findElement(By.cssSelector(".pointer.btn_money.textcenter.mt20.login-btn"));
        login_btn.click();
        //关闭驱动*/
        //driver.close();		
	}

}
