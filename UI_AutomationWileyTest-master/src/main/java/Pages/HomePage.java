package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    //locators
    private static final By HOME_PAGE_LOCATOR = By.xpath("//h5[text()='Book Store Application']");

    //methods
    public void clickBookStoreApplication(){
        clickElement(HOME_PAGE_LOCATOR);


    }
    public  boolean isBookStoreApplicationClicked(){
        return clickElement(HOME_PAGE_LOCATOR);
    }
}
