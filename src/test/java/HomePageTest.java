import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class HomePageTest {
   // WebElement scrollTop;

    @Test(priority  =1)
    public void verifyFameCareIconIsDisplayed(){
        Assert.assertTrue(HomePage.FamcareIcon().isDisplayed());
    }

            //Header
            //famCare header button
    @Test(priority  =2)
    public void verifyFameCareButtonIsDisplayed(){
        Assert.assertTrue(HomePage.headerFamcareButton().isDisplayed());
    }

    @Test(priority  =3)
    public void verifyHeaderFamCareButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerFamcareButton().getText(),"فامكير");
    }
    @Test(priority = 4)

    public void verifyClickingHeaderFamCareButton(){
        HomePage.headerFamcareButton().click();
        WebElement HeaderFamCareButton1 = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertTrue(HeaderFamCareButton1.isDisplayed());
    }


    //الإخصائيين

    @Test(priority  =5)
    public void verifySpecialistsButtonIsDisplayed(){
        Assert.assertTrue(HomePage.headerSpecialistsButton().isDisplayed());
    }

    @Test(priority  =6)
    public void verifyHeaderSpecialistsButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerSpecialistsButton().getText(),"الأخصائيين");
    }
    @Test(priority  =7)
    public void verifyClickingSpecialistsButton(){
        HomePage.headerSpecialistsButton().click();
        WebElement HeaderSpecialistsButton1 = Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/h1"));
        Assert.assertTrue(HeaderSpecialistsButton1.isDisplayed());
    }


    //المدونة
@Test(priority  =8)
public void verifyHeaderBlogButtonIsDisplayed(){
    Assert.assertTrue(HomePage.headerSpecialistsButton().isDisplayed());
}

    @Test(priority  =9)
    public void verifyHeaderBlogButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerBlogButton().getText(),"المدونة");
        HomePage.headerBlogButton().click();
    }
  //صفحة المدونة ما ضبطت
   /* @Test(priority  =10)
    public void verifyClickingHeaderBlogButtonButton(){
        HomePage.headerBlogButton().click();
        WebElement HeaderBlogButton1 = Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-a27813731b83bc310\"]/div[2]/div/div[1]/div/div[3]/div[2]/a/span"));
        Assert.assertTrue(HeaderBlogButton1.isDisplayed());
    }
    */

    //الأكاديمية

    @Test(priority  =11)
    public void verifyHeaderAcademyButtonIsDisplayed(){
        Assert.assertTrue(HomePage.headerAcademyButton().isDisplayed());
    }

   @Test(priority  =12)
    public void verifyHeaderAcademyButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerAcademyButton().getText(),"الأكاديمية");
    }

   @Test(priority  =13)
    public void verifyClickingHeaderAcademyButton(){
        HomePage.headerAcademyButton().click();
        WebElement headerAcademyButton1 = Setup.driver.findElement(By.xpath("/html/body/header/div[1]/div/div/section/div/div/div/div[1]/div/div/a/img"));
        Assert.assertTrue(headerAcademyButton1.isDisplayed());
    }

    //المنظمات


    @Test(priority  =14)
    public void verifyHeaderOrganizationsButtonIsDisplayed(){
       Setup.driver.navigate().back();
        Assert.assertTrue(HomePage.headerOrganizationsButton().isDisplayed());
    }

    @Test(priority  =15)
    public void verifyHeaderOrganizationsButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerOrganizationsButton().getText(),"المنظمات");
    }

    @Test(priority  =16)
    public void verifyClickingHeaderOrganizationsButton(){
        HomePage.headerOrganizationsButton().click();
        WebElement headerOrganizationsButton1 = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]/h2"));
        Assert.assertTrue(headerOrganizationsButton1.isDisplayed());
    }

//من نحن

    @Test(priority  =17)
    public void verifyHeaderWhoIsUsButtonIsDisplayed(){
        Assert.assertTrue(HomePage.headerWhoIsUsButton().isDisplayed());
    }

    @Test(priority  =18)
    public void verifyHeaderWhoIsUsButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerWhoIsUsButton().getText(),"من نحن");
    }

    @Test(priority  =19)
    public void verifyClickingHeaderWhoIsUsButton(){
        HomePage.headerWhoIsUsButton().click();
        WebElement headerWhoIsUsButton1 = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[1]/div/div/div[1]/div/div[2]/h2"));
        Assert.assertTrue(headerWhoIsUsButton1.isDisplayed());
    }
/////////
    @Test(priority  =20)
    public void verifyHeaderJoinButtonIsDisplayed(){
        Assert.assertTrue(HomePage.headerJoinButton().isDisplayed());
    }

   @Test(priority  =21)
    public void verifyHeaderJoinButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.headerJoinButton().getText(),"انضم كأخصائي");
    }

    @Test(priority  =22)
    public void verifyClickingHeaderJoinButton(){
        HomePage.headerJoinButton().click();
        WebElement headerJoinButton1 = Setup.driver.findElement(By.xpath("//*[@id=\"wpcf7-f1890-o2\"]/form/h2"));
        Assert.assertTrue(headerJoinButton1.isDisplayed());
    }
    //الصفحة الرئيسية لفامكير
    //الهيلب بوترن لم  يضبط
    /*@Test(priority  =23)
    public void verifyClickingHelpButton() throws InterruptedException {
        Setup.driver.navigate().to("https://famcare.app/");
        sleep(5000);
        HomePage.HelpButton().click();
        /*WebElement HelpButton1 = Setup.driver.findElement(By.xpath("//*[@id=\"spaces-home\"]/div[2]/div/div/div/div/div[1]/div/div[2]/div[2]/h2"));
        Assert.assertTrue(HelpButton1.isDisplayed());
    }*/

    @Test(priority =23)
    public void verifyTextInFamCareHomepage1()  {
        Setup.driver.navigate().to("https://famcare.app/");
        WebElement text = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[1]/h2"));
        Assert.assertEquals(text.getText(),"ابدأ جلستك الأولى مع مستشارك الي يناسبك مع خصم 60%");

    }

    @Test(priority =24)
    public void verifyTextInFamCareHomepage2()  {
        WebElement text = Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[2]/p"));
        Assert.assertEquals(text.getText(),"لاتستهين بخطواتك، أخصائيين مرخصين متوفرين بتخصصات مختلفة .. خذ القرار الآن ");

    }
    @Test(priority =25)
    public void verifyBookButtonIsDisplayed(){
        Assert.assertTrue(HomePage.BookButton().isDisplayed());
    }

    @Test(priority =26)
    public void verifyBookButtonTextIsCorrect(){
        Assert.assertEquals(HomePage.BookButton().getText(),"احجز جلستك الأولى");
    }

    @Test(priority =27)
    public void verifyClickingBookButton(){
        HomePage.BookButton().click();
        WebElement BookButton1 = Setup.driver.findElement(By.xpath("/html/body/div[3]/main/div[2]/section[1]/div/div[2]/header/h1"));
        Assert.assertTrue(BookButton1.isDisplayed());
    }
    @Test(priority = 28)
    public void scrollTopIsDisplayed() throws InterruptedException {
        Setup.driver.navigate().to("https://famcare.app/");
        Setup.jse.executeScript("window.scrollBy(0,500)");
        sleep(3000);
        WebElement scrollTop= Setup.driver.findElement(By.cssSelector("#topcontrol"));
        Assert.assertTrue(scrollTop.isDisplayed());

    }
        //نخبة من الأخصائيين والمرشدين
    @Test(priority =29)
    public void verifyTextInFamCareHomepage3()  {
        Setup.jse.executeScript("window.scrollBy(0,500)");

        WebElement text = Setup.driver.findElement(By.xpath("/html/body/div[1]/section[3]/div/div/div/div/div[1]/h2"));
        Assert.assertEquals(text.getText(),"نخبة من الأخصائيين والمرشدين");

    }
    //هنا الswiper ما بضبط معي والمفترض اكمل وافتح الصفحات واعمل تيست لحساب شخص منهم

    /*@Test(priority  =30)
    public void SpecialistProfile1IsDisplayed(){
        SwiperInteractionTest swiperTest = new SwiperInteractionTest();
        swiperTest.navigateToSwiperPage();
        swiperTest.swipeRight();
        swiperTest.testSwiper();
        WebDriverWait wait = new WebDriverWait(Setup.driver,(Duration.ofSeconds(20)));
        WebElement swiperWrapper = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#swiper-wrapper-58d54b503374bbbd > div.swiper-slide.swiper-slide-next > div > div.position-relative.avatar > a > img")));
        Assert.assertTrue(swiperWrapper.isDisplayed());
    }
*/
    /*@Test(priority  =31)
    public void verifyPersonalProfileButtonIsDisplayed(){
        Assert.assertTrue(HomePage.PersonalProfileButton().isDisplayed());
    }*/




}