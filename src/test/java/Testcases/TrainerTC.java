package Testcases;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Base.TestBase;
import Pages.TrainerCatergory;
import Pages.TrainerContactUs;
import Pages.TrainerHome;
import Pages.TrainerLogin;
import Pages.TrainerNewPost;
import java.io.IOException;
import org.openqa.selenium.WebDriver;


public class TrainerTC extends TestBase{
    TrainerLogin obj;
    TrainerHome hbj;
    TrainerNewPost nbj;
    TrainerCatergory cbj;
    TrainerContactUs abj;
    
    WebDriver driver;
@BeforeClass
public void setUpObjects() {
	
	obj = new TrainerLogin(driver);
	hbj = new TrainerHome(driver);
	nbj = new TrainerNewPost(driver);
	cbj = new TrainerCatergory(driver);	
	abj = new TrainerContactUs(driver);
}
    @Test
    public void tc01() {
        obj.dropDown();
        obj.loginPage("suresh123@gmail.com","Suresh123");
        obj.subBtn();
        obj.Logoutbtn();
    }

    @Test
    public void tc02() {
        obj.dropDown();
        obj.loginPage("suresh12@gmail.com","Suresh123");
        obj.subBtn();
        obj.Logoutbtn();
    }


	@Test
    public void tc03() {
        obj.dropDown();
        obj.loginPage("suresh123@gmail.com","Suresh12");
        obj.subBtn();
        obj.Logoutbtn();
    }
	@Test
    public void tc04() {
        obj.dropDown();
        obj.loginPage("suresh@gmail.com","Suresh");
        obj.subBtn();
        obj.Logoutbtn();
	}
	@Test
	 public void tc05() {
		 obj.dropDown();
	        obj.loginPage("suresh123@gmail.com","Suresh123");
	        obj.subBtn();
	        Assert.assertTrue(hbj.clkHome(),"HomePage is there");
	        hbj.clickHome();
	        obj.Logoutbtn();
	        
	 }
	 
	 public void tc06() {
		 
	 }
	
	 public void tc07() {
		 
	 }	
}



