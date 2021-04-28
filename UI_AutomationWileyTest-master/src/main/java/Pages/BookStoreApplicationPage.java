package Pages;

import Base.BasePage;
import org.openqa.selenium.By;

public class BookStoreApplicationPage extends BasePage {

    private static final By PAGE_HEADER_LOCATOR = By.className("main-header");
    private static final By VERIFY_TITLE_LOCATOR_OF_THIRD_BOOK=By.xpath("//a[@href='/books?book=9781449337711']");
    private static final By VERIFY_AUTHOR_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[3]");
    private static final By VERIFY_PUBLISHER_LOCATOR_OF_THIRD_BOOK=By.xpath("//div[@id='app']/div/div/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/div[3]/div/div[4]");
    private static final By THIRD_BOOK_LINK_LOCATOR=By.linkText("Designing Evolvable Web APIs with ASP.NET\").click()");
    private static final By ISBN_LOCATOR_OF_BOOKSTORE_PAGE =By.id("ISBN-label");
    private static final By AUTHOR_LOCATOR_OF_BOOKSTORE_PAGE=By.id("title-label");
    private static final By TITLE_LOCATOR_OF_BOOKSTORE_PAGE=By.id("author-label");
    private static final By WEBSITE_LINK_OF_BOOKSTORE_PAGE=By.className("form-label");
    private static final By NEWTAB_OPENED_LOCATOR=By.cssSelector("(\"Body\")).sendKeys(Keys.CONTROL +\"t\"");
    private static final By LAUNCH_OREILLY_SITE =By.linkText("https://www.oreilly.com/");

    //METHODS

    public boolean isPageLoaded() {

        return isVisible(PAGE_HEADER_LOCATOR);
    }
}
