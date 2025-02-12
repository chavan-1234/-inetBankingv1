package TestNgTest;

import org.testng.annotations.Test;

public class SignuptestGr {
	
  @Test(priority=1 ,groups = {"regression"})
  void signupbyemail () {
	  System.out.println("signup By email");
  }
  @Test(priority=2,groups = {"regression"})
  void signupbyfacebook () {
	  System.out.println("signup By Facebook");
  }
  
  
  @Test(priority=3 ,groups = {"regression"})
  void signupbytwitter () {
	  System.out.println("signup By twitter"); 
  }
  
}
