import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class RandomPage extends BaseTest {



    @Step("<int> saniye bekle!!!")
    public void waitForsecond(int s) throws InterruptedException {

        Thread.sleep(1000 * s);
    }

    @Step("Random Urun Secme")
    public void selectRandom(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id=\"com.ozdilek.ozdilekteyim:id/imageView\"]\n"));

        Random random = new Random();
        int randomInt = random.nextInt(elements.size());
        elements.get(randomInt).click();
    }

}
