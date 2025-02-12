 package com.inetbanking.testCases;



public class Primeno {
	public static void main(String[] args) {
		
		
		/*for ( int i=1; i<=100; i++) {
			boolean isprime=true;
			if(i>1) {
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						isprime=false;
					}
					
				}
				
				
			}
			else {
				isprime=false;
			}
			if(isprime) {
				System.out.println(i);
			}
		}*/
		
		int no=18;
		int count=0;
		for(int i=1; i<=no; i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("prime no");
		}
		else {
			System.out.println("not a prime");
		}
		
	}

}
