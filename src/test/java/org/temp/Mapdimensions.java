package org.temp;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Mapdimensions {
	static WebDriver driver;
	@Given("User should  launch the browser")
	public void user_should_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-kk\\Projectautomated\\driver\\chromedriver.exe");
		   driver =new ChromeDriver();
		   driver.get("http://www.demo.guru99.com/telecom/");
		   
	}

	@Given("User click the add customer button")
	public void user_click_the_add_customer_button() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
	}

	@When("User provide valid details of customer")
	public void user_provide_valid_details_of_customer(io.cucumber.datatable.DataTable k) {
		System.out.println("when-1");
		Map<String,String> oned = k.asMap(String.class, String.class);
		System.out.println(oned);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(oned.get("fname"));
		driver.findElement(By.id("lname")).sendKeys(oned.get("lname"));
		driver.findElement(By.id("email")).sendKeys(oned.get("gmail"));
		driver.findElement(By.xpath("//textarea[@name='addr']")).sendKeys(oned.get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(oned.get("mob"));
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 Assert.assertTrue((driver.findElement(By.xpath("//td[@align='center']")).isDisplayed()));
	}



}
