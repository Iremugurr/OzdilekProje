import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Logger;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DetailPage extends BaseTest {
    @Step("<xpath> li elemnti bul ve <text> değerini kontrol et")
    public void AssertDetails(String xpath){
        Assert.assertTrue(BaseTest.appiumDriver.findElement(xpath(xpath)).isDisplayed());
        İremLogger.logger.info("Ürün detay sayfası açıldı");
    }


}
