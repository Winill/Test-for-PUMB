package Pumb.Helpers;

import org.openqa.selenium.ie.InternetExplorerDriver;

import java.awt.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Олег Калужин on 18.04.2017.
 */
public class AppManager extends RozetkaHelper {

  protected void init() throws AWTException {
    // 1. Открыть браузер IE
    wd = new InternetExplorerDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    // 2. развернуть на весь экран.
    wd.manage().window().maximize();
    Robot bot = new Robot();
    bot.mouseMove(0, 0);
  }

  protected void stop() {
    //13. Закрыть браузер.
    wd.quit();
  }

}
