package TestNgTest;

import org.testng.annotations.Test;

public class LogintestGr {
	
	
  @Test(priority=1, groups = {"sanity"})
   void loginByemail() {
	  System.out.println("login By email");
  }
  
  
  @Test(priority=2,  groups = {"sanity"})
  void loginbyFaceboo() {
	  System.out.println("login By facebook");
  }
  
  @Test(priority=3 , groups = {"sanity"})
     void loginBttwitter() {
	  System.out.println("login By twitter");
  }
}
