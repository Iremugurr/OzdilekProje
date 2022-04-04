import com.testinium.driver.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPage extends BaseTest {
@Step("<id> si ile giriş yapma sayfası açıldığı kontolü")
    public void AssertDetails(String id){
    Assert.assertTrue(appiumDriver.findElement(By.id(id)).isDisplayed());
    İremLogger.logger.info("Giriş yapma sayfası açıldı");
}
@Step("<id> li kullanıcı adı kısmına <text> girilir")
    public void sendUserName(String id, String text){
    appiumDriver.findElement(By.id(id)).sendKeys(text);
    İremLogger.logger.info("Kullanıcı adı girildi");
}
@Step("<id> li şifre kısmına <text> girilir")
    public void sendPassword(String id, String text){
    appiumDriver.findElement(By.id(id)).sendKeys(text);
    İremLogger.logger.info("Sifre girildi");
}
@Step("<id> li geri gitme butonuna tıklanır")
    public void backButton(String id){
    appiumDriver.findElement(By.id(id)).click();
    İremLogger.logger.info("Geri git buttonuna tıklandı");
}

}
