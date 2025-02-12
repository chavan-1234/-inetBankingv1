package TestNgTest;

import org.testng.annotations.Test;

public class DependyMethod {
	
	
  @Test(priority=1)
        void openapp() {
	  
      }
  
  @Test(priority=2 , dependsOnMethods = {"openapp"})
  
     void login() {
	  
  }
  @Test(priority=3  , dependsOnMethods = {"login"})
         void search() {
	  
	  
  }
  @Test(priority=4 ,dependsOnMethods = {"login" , "search" })
        void advancedsearch() {
	  
	  
  }
  @Test(priority=5 ,dependsOnMethods = {"login"})
               void logout() {
        	 
	  
  }
  
}
