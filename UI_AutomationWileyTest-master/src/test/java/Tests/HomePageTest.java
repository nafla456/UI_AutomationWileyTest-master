package Tests;

import Base.BaseTest;
import Pages.BookStoreApplicationPage;
import Pages.HomePage;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class HomePageTest extends BaseTest {

   private static final String URL ="https://demoqa.com/";
    HomePage homePage= new HomePage();
    BookStoreApplicationPage bookStoreApplicationPage=new BookStoreApplicationPage();


   @Test
    public void clickOnBookstore(){
        //preconditions
        openPage(URL);
        Reporter.log("Opening the browser");
        maximizeWindow();
        Reporter.log("MAXIMIZING THE WINDOW");
        Reporter.log("scrolling down");
        scrollDown();

        //click on the BOOKSTOREAPPLICATION
        homePage.clickBookStoreApplication();
        Reporter.log("CLICK ON THE BOOKSTOREAPPLICATION PAGE");



        //VERIFY BOOK_STORE_APPLICATION_PAGE LOADED





    }


}
