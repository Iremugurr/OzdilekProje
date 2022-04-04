import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BasePage extends BaseTest {

    @Step("<int> saniye bekle")

    public void waitForSecond(int s) throws InterruptedException {
        Thread.sleep(1000 *s);
    }

    @Step("<key> id si bu olan elementin sayfada gorunur oldugunu kontrol et")
    public void findElement(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        if (element.isDisplayed()) {
            element.click();
        } else {
            System.out.println("Bu element görünür değil");
        }

    }



    }

