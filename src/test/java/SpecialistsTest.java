import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.Set;

import static java.lang.Thread.sleep;

public class SpecialistsTest {

    @Test(priority  =1)
    public void verifySpecialistsButtonIsDisplayed(){
        Setup.driver.navigate().to("https://famcare.app/");
        Assert.assertTrue(HomePage.headerSpecialistsButton().isDisplayed());
    }
    @Test(priority  =2)
    public void verifyHeaderSpecialistsButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerSpecialistsButton().getText(),"الأخصائيين");
    }
    @Test(priority  =3)
    public void verifyClickingSpecialistsButton()throws InterruptedException{
        HomePage.headerSpecialistsButton().click();
        sleep(3000);
        WebElement HeaderSpecialistsButton1 = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
        Assert.assertTrue(HeaderSpecialistsButton1.isDisplayed());
    }
    @Test(priority  =4)
    public void verifyTextIsIsDisplayedCorrectly(){
        WebElement text = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/p"));
        Assert.assertEquals(text.getText(),"اسماء اخصائيين نفسيين  وقائمة من الأخصائيين المعتمدين والمرّخصين معك ولأجلك في متنفّسك ومساحتك الآمنة");
    }
    @Test(priority  =5)
    public void verifySpecialistsInpuFieldIsDisplayed() throws InterruptedException{
        Assert.assertTrue(HomePage.SpecialistsInpuField().isDisplayed());
        HomePage.SpecialistsInpuField().sendKeys("رنا");
        HomePage.SpecialistsInpuField().sendKeys(Keys.ENTER);

        sleep(5000);
    }







}
