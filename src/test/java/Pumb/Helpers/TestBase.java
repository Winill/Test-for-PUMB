package Pumb.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Олег Калужин on 18.04.2017.
 */
public class TestBase {
  public Wait<WebDriver> wait;
  WebDriver wd;

  public static boolean isAlertPresent(FirefoxDriver wd) {
      try {
          wd.switchTo().alert();
          return true;
      } catch (NoAlertPresentException e) {
          return false;
      }
  }

  @BeforeMethod
  public void setUp() throws Exception {
      wd = new InternetExplorerDriver();
      wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      wd.manage().window().maximize();
  }

  protected void openRozetka() {
    wd.get("http://rozetka.com.ua");
  }

  private void chooseBrands() {
      chooseAsus();
      chooseHTC();
      chooseHuawei();
      chooseMeizu();
      chooseSamsung();
  }

  protected void printValuation() {
      System.out.println(wd.findElement(By.xpath("//div[@class='pp-g-rating-and-results']//meta[@itemprop='ratingValue']")).getAttribute("content"));
  }

  protected void openRememberedPhone(String elementID) {
      String elementLink = "//div[@id='image_item"+elementID+"']";
      wd.findElement(By.xpath(elementLink)).click();
  }

  protected void sortByNew() {
      wd.findElement(By.xpath(".//*[@id='sort_view']/a")).click();
      wd.findElement(By.xpath(".//*[@id='filter_sortnovelty']/a")).click();
  }

  protected String firstElementInList() {
      return wd.findElement(By.xpath("//input[@value='001']")).getAttribute("name").substring(15);
  }

  protected void checkCountOfElements() {
      int i = wd.findElements(By.cssSelector(".g-i-tile-i-box-desc")).size();
      Assert.assertTrue(i > 1);
  }

  protected void chooseSamsung() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_12']/div[1]/label/a/span")).click();
  }

  protected void chooseMeizu() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_75382']/div[1]/label/a/span")).click();
  }

  protected void chooseHuawei() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_511']/div[1]/label/a/span")).click();
  }

  protected void chooseHTC() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_66']/div[1]/label/a/span")).click();
  }

  protected void chooseAsus() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_4']/div[1]/label/a/span")).click();
  }

  private void chooseDisplay() {
      inch41_45();
      inch45_5();
      inch51_55();
      inch555_6();
      inchMoreThan6();
  }

  protected void inchMoreThan6() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_25316']/div[1]/label/a/span")).click();
  }

  protected void inch555_6() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_114812']/div[1]/label/a/span")).click();
  }

  protected void inch51_55() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_93089']/div[1]/label/a/span")).click();
  }

  protected void inch45_5() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_50074']/div[1]/label/a/span")).click();
  }

  protected void inch41_45() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_50069']/div[1]/label/a/span")).click();
  }

  protected void setAPrice() {
      wd.findElement(By.xpath("./*//*[@id='price[max]']")).sendKeys("6000");
      wd.findElement(By.xpath("./*//*[@id='submitprice']")).click();
  }

  protected void chooseMobile() throws InterruptedException {
      wd.findElement(By.xpath("./*//*[@id='content-inner-block']/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[1]/div/ul/li[5]/a")).click();

      wd.findElement(By.xpath("./*//*[@id='reset_filtermob-phones']/a")).click();
      Thread.sleep(5000);
  }

  protected void chooseSmartphones() {
      wd.findElement(By.xpath("./*//*[@id='3361']/a")).click();
  }

  @AfterMethod
  public void tearDown() {
      wd.quit();
  }
}
