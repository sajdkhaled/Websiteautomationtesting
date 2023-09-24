import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwiperInteractionTest {


    public SwiperInteractionTest() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        Setup.wait = new WebDriverWait(Setup.driver, Duration.ofSeconds(10));
    }

    public void navigateToSwiperPage() {
        Setup.driver.get("//*[@id=\"swiper-wrapper-4232adb5673a10473\"]/div[8]/div/div[1]/a/img");  // Replace with your swiper page URL
    }

    public void swipeLeft() {
        JavascriptExecutor js = (JavascriptExecutor) Setup.driver;
        js.executeScript("document.querySelector('.swiper-button-next').click();");
    }

    public void swipeRight() {
        JavascriptExecutor js = (JavascriptExecutor) Setup.driver;
        js.executeScript("document.querySelector('.swiper-button-prev').click();");
    }

    public void testSwiper() {
        // Navigate to the swiper page
        navigateToSwiperPage();

        // Example: Swipe right to reveal next elements
        swipeRight();

        // Find and interact with elements within the swiper
        WebElement swiperElement = Setup.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#swiper-wrapper-58d54b503374bbbd > div.swiper-slide.swiper-slide-next > div > div.position-relative.avatar > a > img")));
        // Perform actions on the swiper element, e.g., click, getText(), etc.

        // Example assertion
        String text = swiperElement.getText();
        // Assert.assertEquals(text, "Expected Text");


    }

}
