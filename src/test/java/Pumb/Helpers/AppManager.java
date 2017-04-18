package Pumb.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

/**
 * Created by Олег Калужин on 18.04.2017.
 */
public class AppManager extends RozetkaHelper {

  protected void init() {
    // 1. Открыть браузер IE
    wd = new InternetExplorerDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    // 2. развернуть на весь экран.
    wd.manage().window().maximize();
  }

  protected void stop() {
    //13. Закрыть браузер.
    wd.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
