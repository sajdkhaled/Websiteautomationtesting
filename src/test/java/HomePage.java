import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage {
    public static WebElement FamcareIcon(){
        return Setup.driver.findElement(By.xpath("/html/body/header/div/div/nav/a/img"));
    }

    public static WebElement headerFamcareButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-6\"]/a"));
    }

    public static WebElement headerSpecialistsButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-1026\"]/a"));
    }

    public static WebElement headerBlogButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-2633\"]/a"));
    }

    public static WebElement headerAcademyButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-1227\"]/a"));
    }

    public static WebElement headerOrganizationsButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-187\"]/a"));
    }

    public static WebElement headerWhoIsUsButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"menu-item-188\"]"));
    }

    public static WebElement headerJoinButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"navbarContent\"]/button"));
    }

    public static WebElement HelpButton(){
    return Setup.driver.findElement(By.xpath("//*[@id=\"intercom-container\"]/div/div"));
}

    public static WebElement BookButton(){
    return Setup.driver.findElement(By.xpath("//*[@id=\"heroText\"]/div/div[3]"));
}
   public static WebElement SpecialistProfile1(){
        return Setup.driver.findElement(By.cssSelector("#swiper-wrapper-58d54b503374bbbd > div.swiper-slide.swiper-slide-next > div > div.position-relative.avatar > a > img"));
    }
    public static WebElement PersonalProfileButton(){
        return Setup.driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-4232adb5673a10473\"]/div[8]/div/div[2]/a[1]"));
    }
    public static WebElement SpecialistsInpuField(){
        return Setup.driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/form/label"));
    }
}