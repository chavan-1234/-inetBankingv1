package TestNgTest;

import org.testng.annotations.Test;

public class PaymenttestGr {
  @Test(priority=1, groups = {"sanity" , "regression", "functional"})
  public void paymentinruppe() {
	  System.out.println("payment in ruppe");
  }
  
  @Test(priority=2 , groups = {"sanity" , "regression", "functional"})
  public void paymentindoller() {
	  System.out.println("payment in doller");
  }
  
}
