package practice;

public class StrEachChar {       
	    public static void main(String[] args) {
			 
	    	
	    	String str= "how are you";
	    	
	    	          String ws = str.replaceAll("\\s","");
	    	              
	    	   int count=0;
	    	   
	    	        char[] ch = ws.toCharArray();
	    	        
	    	        for(int i=0; i<ch.length; i++) {
	    	        	
	    	        	count++;
	    	        	
	    	        }
	    	          System.out.println(count);
		}
}
