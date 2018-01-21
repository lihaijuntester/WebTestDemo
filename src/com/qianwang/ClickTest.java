package com.qianwang;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//如果chrome浏览器没有默认安装在C盘，需要制定其路径
		System.setProperty("webdriver.chrome.driver", "/Users/arvin/Documents/autotest/selenuim/ChromeDrive/chromedriver");
		//定义驱动对象为 chromedriver 对象
		WebDriver driver = new ChromeDriver();
		driver.get("http://youdao.com");
		WebElement element = driver.findElement(By.id("translateContent"));
		//一定要注意这边使用的complier levelg一定要大于1.4,否则会报错；
		//element.sendKeys("selenium");
	    element.sendKeys(new String[] {"selenium"});
		element.submit();
		driver.quit();
	}

}
