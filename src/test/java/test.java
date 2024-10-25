import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test extends BaseTest {
    //@Test
    public void test() throws InterruptedException {
        driver.get("https://tools@tryraff.com:1@app.tryraff.com/version-019je/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@placeholder='username@gmail.com'])[1]")).sendKeys("hany@gensystem.net");
        driver.findElement(By.xpath("(//input[@id='pass1'])[1]")).sendKeys("1");
        driver.findElement(By.xpath("(//button[contains(text(),'تسجيل الدخول')])[1]")).click();
        Thread.sleep(3000);
    }
}
