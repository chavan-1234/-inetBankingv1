package TestNgTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class C3 {
	
	
	
  @Test
   public void pqr() {
	  System.out.println("pqr from c3");
  }
  
  @BeforeSuite
  public void bS() {
	  System.out.println("before suite");
  }

  @AfterSuite
  public void aS() {
	  System.out.println("after suite");
  }

}
