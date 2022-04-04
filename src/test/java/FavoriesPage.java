import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Random;

public class FavoriesPage extends BaseTest{
@Step("<id> li favoriler butonuna tıkla")
    public void addFavories(String id){
    İremLogger.logger.info("Favoriler butonuna tıklandı");
}

@Step("Rastgele beden seçimi yapılır")
    public void selectRandom(){
    List<MobileElement> elements =appiumDriver.findElements(By.xpath("//[@resource-id=\"com.ozdilek.ozdilekteyim:id/tvInSizeItem\"]\n"));
    Random random = new Random();
    int randomInt = random.nextInt(elements.size());
    elements.get(randomInt).click();
    İremLogger.logger.info("Rastgele beden seçimi yapıldı");
}

}

