import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class BasketPage extends BaseTest {

    @Step("<id> li sepete ekle buttonuna tıklanır")
    public void addButton(String id){
        appiumDriver.findElement(By.id(id)).click();
        İremLogger.logger.info("Sepete ekle buttununa tıklandı");
    }
}
