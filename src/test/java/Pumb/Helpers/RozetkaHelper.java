package Pumb.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

/**
 * Created by Олег Калужин on 18.04.2017.
 */
public class RozetkaHelper {
  public Wait<WebDriver> wait;
  WebDriver wd;

  public void openRozetka() {
    // 2. Зайти на rozetka.com.ua
    wd.get("http://rozetka.com.ua");
  }

  public void chooseBrands() {
      chooseAsus();
      chooseHTC();
      chooseHuawei();
      chooseMeizu();
      chooseSamsung();
  }

  public void printValuation() {
      System.out.println(wd.findElement(By.xpath("//div[@class='pp-g-rating-and-results']//meta[@itemprop='ratingValue']")).getAttribute("content"));
  }

  public void openRememberedPhone(String elementID) {
      String elementLink = "//div[@id='image_item"+elementID+"']";
      wd.findElement(By.xpath(elementLink)).click();
  }

  public void sortByNew() {
      wd.findElement(By.xpath(".//*[@id='sort_view']/a")).click();
      wd.findElement(By.xpath(".//*[@id='filter_sortnovelty']/a")).click();
  }

  public String firstElementInList() {
      return wd.findElement(By.xpath("//input[@value='001']")).getAttribute("name").substring(15);
  }

  public void checkCountOfElements() {
      int i = wd.findElements(By.cssSelector(".g-i-tile-i-box-desc")).size();
      Assert.assertTrue(i > 1);
  }

  public void chooseSamsung() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_12']/div[1]/label/a/span")).click();
  }

  public void chooseMeizu() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_75382']/div[1]/label/a/span")).click();
  }

  public void chooseHuawei() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_511']/div[1]/label/a/span")).click();
  }

  public void chooseHTC() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_66']/div[1]/label/a/span")).click();
  }

  public void chooseAsus() {
      wd.findElement(By.xpath("./*//*[@id='filter_producer_4']/div[1]/label/a/span")).click();
  }

  public void chooseDisplay() {
      inch41_45();
      inch45_5();
      inch51_55();
      inch555_6();
      inchMoreThan6();
  }

  public void inchMoreThan6() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_25316']/div[1]/label/a/span")).click();
  }

  public void inch555_6() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_114812']/div[1]/label/a/span")).click();
  }

  public void inch51_55() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_93089']/div[1]/label/a/span")).click();
  }

  public void inch45_5() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_50074']/div[1]/label/a/span")).click();
  }

  public void inch41_45() {
      wd.findElement(By.xpath("./*//*[@id='filter_23777_50069']/div[1]/label/a/span")).click();
  }

  public void setAPrice() {
      wd.findElement(By.xpath("./*//*[@id='price[max]']")).sendKeys("6000");
      wd.findElement(By.xpath("./*//*[@id='submitprice']")).click();
  }

  public void chooseMobile() throws InterruptedException {
      wd.findElement(By.xpath("./*//*[@id='content-inner-block']/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div/div[1]/div/div[1]/div[1]/div/ul/li[5]/a")).click();

      wd.findElement(By.xpath("./*//*[@id='reset_filtermob-phones']/a")).click();
      Thread.sleep(5000);
  }

  public void chooseSmartphones() {
      wd.findElement(By.xpath("./*//*[@id='3361']/a")).click();
  }
}
