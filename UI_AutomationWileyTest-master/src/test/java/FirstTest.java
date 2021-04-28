import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {


    private WebDriver driver;
    private static final String URL = "https://demoqa.com/";
    private static final By HOME_PAGE_LOCATOR = By.xpath("//h5[text()='Book Store Application']");
    private static final By PAGE_HEADER_LOCATOR = By.className("main-header");


    @BeforeClass(alwaysRun = true)
    public void setUp() {
        ChromeDriverManager.chromedriver().setup();
        driver = new ChromeDriver();


    }

    @Test
    public void testWileyGlobalAssignment() {

        driver.get(URL);
        driver.manage().window().maximize();

        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //click on the widget
        WebElement homePageElement = driver.findElement(HOME_PAGE_LOCATOR);
        homePageElement.click();

        //verify widgets page loaded
        Assert.assertTrue(driver.findElement(PAGE_HEADER_LOCATOR).isDisplayed());

    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();

    }




}



