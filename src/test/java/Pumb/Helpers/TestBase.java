package Pumb.Helpers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Олег Калужин on 18.04.2017.
 */
public class TestBase {

  protected final AppManager app = new AppManager();

  @BeforeMethod
  public void setUp() throws Exception {
    app.init();
  }

  @AfterMethod
  public void tearDown() {
    app.stop();
  }

}
