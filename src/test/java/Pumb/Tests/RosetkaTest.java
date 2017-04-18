package Pumb.Tests;

import Pumb.Helpers.TestBase;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class RosetkaTest extends TestBase {


    @Test
    public void RosetkaTest() throws InterruptedException {
        openRozetka();
        //Smartphonu i electronica
        chooseSmartphones();
        //mobile
        chooseMobile();
        //price
        setAPrice();
        //inch
        inch41_45();
        Thread.sleep(7000);
        inch45_5();
        Thread.sleep(7000);
        inch51_55();
        Thread.sleep(10000);
        inch555_6();
        Thread.sleep(10000);
        inchMoreThan6();
        Thread.sleep(10000);
        //brand
        chooseAsus();
        chooseHTC();
        chooseHuawei();
        chooseMeizu();
        chooseSamsung();
        Thread.sleep(7000);
        //count of elements
        checkCountOfElements();
        //remember
        String elementID = firstElementInList();
        //sort (new)
        sortByNew();
        //find and click
        openRememberedPhone(elementID);
        //stats
        printValuation();

    }

    

}
