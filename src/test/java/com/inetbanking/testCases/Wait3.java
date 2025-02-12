package com.inetbanking.testCases;

public class Wait3 {

	public static void main(String[] args) {
		Here's an example of how to create a Selenium test case using Page Object Model (POM) in Java with TestNG. This example includes the use of explicit wait to wait for a specific element to be clickable before interacting with it. Let’s assume we are testing a simple login page.

		### Project Structure

		`

		### Step 2: Base Test Setup (`BaseTest.java`)

		This base class will initialize the WebDriver and provide basic setup and teardown methods.

		```java
		package base;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterClass;
		import org.testng.annotations.BeforeClass;

		public class BaseTest {
		    protected WebDriver driver;

		    @BeforeClass
		    public void setUp() {
		        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
		        driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("https://example.com/login"); // Update with your login URL
		    }

		    @AfterClass
		    public void tearDown() {
		        if (driver != null) {
		            driver.quit();
		        }
		    }
		}
		```

		### Step 3: Page Object Model for Login Page (`LoginPage.java`)

		Define the login page as a class with WebElements and methods for interactions, including an explicit wait.

		```java
		package pages;

		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.By;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import java.time.Duration;

		public class LoginPage {
		    private WebDriver driver;
		    private WebDriverWait wait;

		    // Locators
		    private By usernameField = By.id("username");
		    private By passwordField = By.id("password");
		    private By loginButton = By.id("loginButton");
		    private By loginSuccessMessage = By.id("loginSuccess");

		    public LoginPage(WebDriver driver) {
		        this.driver = driver;
		        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		    }

		    public void enterUsername(String username) {
		        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
		    }

		    public void enterPassword(String password) {
		        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
		    }

		    public void clickLoginButton() {
		        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
		    }

		    public boolean isLoginSuccessful() {
		        return wait.until(ExpectedConditions.visibilityOfElementLocated(loginSuccessMessage)).isDisplayed();
		    }
		}
		```

		### Step 4: Write the Test Case (`LoginTest.java`)

		Write a test that uses the `LoginPage` POM and includes assertions to verify the login functionality.

		```java
		package tests;

		import base.BaseTest;
		import pages.LoginPage;
		import org.testng.Assert;
		import org.testng.annotations.Test;

		public class LoginTest extends BaseTest {
		    @Test
		    public void testSuccessfulLogin() {
		        LoginPage loginPage = new LoginPage(driver);
		        
		        // Perform login actions
		        loginPage.enterUsername("testuser");
		        loginPage.enterPassword("password123");
		        loginPage.clickLoginButton();

		        // Assert login success
		        Assert.assertTrue(loginPage.isLoginSuccessful(), "Login was not successful!");
		    }
		}
		```

		### Step 5: `testng.xml` Configuration

		Create a `testng.xml` file to configure and run your TestNG tests.

		```xml
		<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
		<suite name="Suite">
		    <test name="LoginTest">
		        <classes>
		            <class name="tests.LoginTest"/>
		        </classes>
		    </test>
		</suite>
		```

		### Explanation

		- **Explicit Wait**: Each method in the `LoginPage` class uses an explicit wait (e.g., `elementToBeClickable`, `visibilityOfElementLocated`) to ensure elements are ready for interaction.
		- **Assertions**: In the `LoginTest` class, `Assert.assertTrue()` checks if the login was successful.
		  
		### Run the Test

		Execute the test suite by running `testng.xml` in your IDE or using Maven:

		```bash
		mvn test -DsuiteXmlFile=testng.xml
		```

		This will run the login test with an explicit wait applied, making the test more reliable across different page load times.
	}
}
