package Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest extends BasePage {


    @BeforeSuite
    public void beforesuit(){
        initWebDriver();
    }

    @AfterSuite
    public void aftersuit(){
        quitWebDriver();
    }
}
