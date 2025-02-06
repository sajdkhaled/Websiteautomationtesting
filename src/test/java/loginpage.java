import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class loginpage extends Setup {


    //Test Case 1: Invalid Username
   @Test(priority = 1)
    public void InvalidUsername() {
        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("invalid_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Wait for the error message
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Invalid Username Test Passed!");
    }
   //Test Case 2: Invalid Password
    @Test(priority = 2)
    public void InvalidPassword() {
        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("password")).sendKeys("wrong_password");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Invalid Password Test Passed!");
    }

    //Test Case 3: Empty Username
    @Test(priority = 3)
    public void EmptyUsername() {
        driver.navigate().refresh();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Empty Username Test Passed!");
    }


    //Test Case 4: Empty Password
    @Test(priority = 4)
    public void EmptyPassword() {

        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("problem_user");
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Empty Username Test Passed!");
    }


    // Test Case 5: Both Fields Empty
    @Test(priority = 5)
    public void BothFieldsEmpty() {
        driver.navigate().refresh();
        driver.findElement(By.id("login-button")).click();

        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Both Fields Empty Test Passed!");
    }


    // Test Case 5: Locked out account

    @Test(priority = 6)
    public void LockedOutAccount() {
        driver.navigate().refresh();
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Wait for the error message
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".error-message-container")));
        Assert.assertTrue(errorMessage.isDisplayed(), "Error message not displayed");
        System.out.println("Invalid Username Test Passed!");
    }


    //Test Case 6: Valid Login

    @Test(priority = 7)
    public void ValidLogin() throws InterruptedException {
        driver.navigate().refresh();
        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        usernameField.sendKeys("problem_user");

        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        wait.until(ExpectedConditions.urlContains("inventory.html"));

        Assert.assertTrue(driver.getCurrentUrl().contains("inventory.html"));
        System.out.println("Login Test Passed!");
           sleep(3000);

    }




}