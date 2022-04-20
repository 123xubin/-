package 函数;

import java.util.Scanner;

public class 函数例子 {
	public static boolean isPrime(int i) {
		boolean isprime = true;        	
	    for(int k=2;k<i;k++) 
	    {
	    	if(i % k == 0) {
	    		isprime = false;
	    		break;
	    	}
	    }
	    return isprime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		int cnt = 0;
		int sum = 0;
        for(int i=m;i<n;i++) 
        {
	        if(isPrime(i)) 
	        {
	        	cnt++;
	        	sum+=i;
	        	}
	        }
        System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，总和为"+sum);
        }
}
