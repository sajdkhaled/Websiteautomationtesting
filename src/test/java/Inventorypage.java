import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class Inventorypage extends Setup {
    @Test(priority = 1)
    public void AddToCart() {
        try {
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.className("shopping_cart_link")).click();

            Assert.assertTrue(driver.findElement(By.className("inventory_item_name")).isDisplayed());
        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();

            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test(priority = 2)
    public void RemoveFromCart() {
        try {
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
            driver.findElement(By.id("remove-sauce-labs-backpack")).click();

            Assert.assertTrue(driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).isDisplayed());
        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test(priority = 3)
    public void SortAtoZ() {
        try {
            driver.get("https://www.saucedemo.com/inventory.html");

            WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(sortDropdown);

            select.selectByVisibleText("Name (A to Z)");
            String firstProductName = driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']")).getText();
            String secondProductName = driver.findElement(By.xpath("//div[@class='inventory_item'][2]//div[@class='inventory_item_name']")).getText();
            Assert.assertTrue(firstProductName.compareTo(secondProductName) <= 0, "Products are not sorted A to Z");

        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }


    @Test(priority = 4)
    public void SortZtoA() {
        try {
            driver.get("https://www.saucedemo.com/inventory.html");
            WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(sortDropdown);

            select.selectByVisibleText("Name (Z to A)");
            String firstProductName = driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_name']")).getText();
            String secondProductName = driver.findElement(By.xpath("//div[@class='inventory_item'][2]//div[@class='inventory_item_name']")).getText();
            Assert.assertTrue(firstProductName.compareTo(secondProductName) >= 0, "Products are not sorted Z to A");

        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test(priority = 5)
    public void SortLowToHigh() {
        try {
            driver.get("https://www.saucedemo.com/inventory.html");
            WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(sortDropdown);
            select.selectByVisibleText("Price (low to high)");

            double firstProductPrice = Double.parseDouble(driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_price']")).getText().replace("$", ""));
            double secondProductPrice = Double.parseDouble(driver.findElement(By.xpath("//div[@class='inventory_item'][2]//div[@class='inventory_item_price']")).getText().replace("$", ""));
            Assert.assertTrue(firstProductPrice <= secondProductPrice, "Products are not sorted by Price (low to high)");

        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }

    @Test(priority = 6)
    public void testSortHighToLow() {
        try {
            driver.get("https://www.saucedemo.com/inventory.html");
            WebElement sortDropdown = driver.findElement(By.className("product_sort_container"));
            Select select = new Select(sortDropdown);

            select.selectByVisibleText("Price (high to low)");
            double firstProductPrice = Double.parseDouble(driver.findElement(By.xpath("//div[@class='inventory_item'][1]//div[@class='inventory_item_price']")).getText().replace("$", ""));
            double secondProductPrice = Double.parseDouble(driver.findElement(By.xpath("//div[@class='inventory_item'][2]//div[@class='inventory_item_price']")).getText().replace("$", ""));
            Assert.assertTrue(firstProductPrice >= secondProductPrice, "Products are not sorted by Price (high to low)");

        } catch (Exception e) {
            System.err.println("Test failed due to: " + e.getMessage());
            e.printStackTrace();
            Assert.fail("Test failed due to an exception: " + e.getMessage());
        }
    }


}