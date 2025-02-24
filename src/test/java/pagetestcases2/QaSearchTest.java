package pagetestcases2;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.QaHeaderOptionPage;
import com.inetbanking.pageObjects.QaHomepage;
import com.inetbanking.pageObjects.QaLoginpage;
import com.inetbanking.pageObjects.QaMyacc2page;
import com.inetbanking.pageObjects.QaSearchpage;

import BaseTest.BaseClass;


public class QaSearchTest extends  BaseClass {

	 QaHomepage hp;
	 QaSearchpage searchpage;
	 QaHeaderOptionPage headerpage;
	 QaLoginpage lp;
	 QaMyacc2page myaccpage;
	 
	 
	   @BeforeMethod
	  public void set() throws IOException {
		  
	 driver	 =  openbrowserandapplication(pro.getProperty("chrome"));
		  
	        hp= new QaHomepage(driver);
	        
	 
		  
		  
		  
	  }
	  @AfterMethod
	  public void teardown() {
		  closebrowser(driver);
		  
	  }
	    @Test
	  public void verifysearchnonexistingproductname() {
		  hp= new QaHomepage(driver);
		  hp.enterproductintosearchfield(pro.getProperty("productname"));
		  hp.clicksearchbutton();
		  searchpage=new QaSearchpage(driver);
		  String expectedmsg="There is no product that matches the search criteria.";
		 Assert.assertEquals(searchpage.getnoproductmsg(), expectedmsg);
		 }
	    
	    @Test
	    public void verifywithoutprovidinganyproname() {
	    	hp= new QaHomepage(driver);
	    	hp.enterproductintosearchfield(null);
	    	hp.clicksearchbutton();
	    	searchpage=new QaSearchpage(driver);
			  String expectedmsg="There is no product that matches the search criteria.";
			 Assert.assertEquals(searchpage.getnoproductmsg(), expectedmsg);
	    	
	    }
	    @Test
	    public void verifysearchafterlogin() {
	    	hp= new QaHomepage(driver);
	    	hp.clickmyacc();
	    	hp.clicklogin();
	    	  lp =  new QaLoginpage  (driver);
	    	  lp.enterEmail(null);
	    	  lp.enterPassword(null);
	    	  lp.clicklogin();
	    	  
	    	  myaccpage   = new QaMyacc2page(driver);
	    	  myaccpage.enterproductintosearchfield("");
	    	  myaccpage .clicksearchbutton();
	    	  searchpage=new QaSearchpage(driver);
            String actualtext = searchpage.isheaderproductnamedisplay();
            String expectedtext="Search - apple";
            Assert.assertEquals(actualtext, expectedtext);
	    	  
	    	
	    	
	    	
	    	
	    }
	    @Test
	    public void verifysearchresultsandcountproduct() {
	    	hp= new QaHomepage(driver);
	    	hp.enterproductintosearchfield("");
	    	hp.clicksearchbutton();
	    	searchpage  = new   QaSearchpage(driver);
	    int actualno = searchpage.getNoofProductsDisplayInsearchResult();
	    
	    	Assert.assertTrue(actualno >1);         
	    	
	    }
	    
	    @Test
	    
	    public void verifysearchfieldplaceholder() {
	    	hp= new QaHomepage(driver);
	    	String actualplaceholder = hp.getsearchfieldpalceholder();
	    	String expectedplace="Search";
	    	
	    	Assert.assertEquals(actualplaceholder, expectedplace);
	    }
	    
	    @Test
	    public void verifySearchusingparentandsubcategoriesoption() {
	    	hp= new QaHomepage(driver);
	    	hp.clicksearchbutton();
	    	searchpage  = new   QaSearchpage(driver);
	    	searchpage.entersearchcrieteriafield("mac");
	    	searchpage.selectoptiofromcategoryfeild(5);
	    	searchpage.clicksearchbutton();
	    	 String expectedmsg="There is no product that matches the search criteria.";
	    	        
	    	Assert.assertEquals(searchpage .getnoproductmsg(),expectedmsg ); 
	    	
	    	
	    }
	    
	    
}
