import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAleart
{
    public static void main(String[] args) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\prasanna.prabakaran\\Downloads\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/pages/Alert.html");
        WebElement aleartBox=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
        aleartBox.click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(4000);
        alert.accept();
        WebElement confirmButton=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
        confirmButton.click();
        Thread.sleep(4000);
        Alert alert1=driver.switchTo().alert();
        alert1.dismiss();
        WebElement promt=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
        promt.click();
        Thread.sleep(4000);
        Alert alert2=driver.switchTo().alert();
        alert2.sendKeys("Prasanna_Prabakar");
        alert2.accept();
    }
}
