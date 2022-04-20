package for语句;

import java.util.Scanner;

public class 判断素数 {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for(int n=2;n<100;n++) 
        {
        	boolean isprime = true;        	
	        for(int i=2;i<n;i++) 
	        {
	        	if(n % i == 0) {
	        		isprime = false;
	        		break;
	        	}
	        }
	        if(isprime ) {
	        	System.out.print(n+" ");
	        }else {
//	        	System.out.println(n+"不是素数");
	        }
		}
	}

}
