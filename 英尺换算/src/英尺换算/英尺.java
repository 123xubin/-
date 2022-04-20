package 英尺换算;

import java.util.Scanner;

public class 英尺 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int foot;
        double inch;
        Scanner in = new Scanner(System.in);
        foot = in.nextInt();
        inch = in.nextInt();
//        System.out.println(10/3);
        System.out.println("foot = "+foot+", inch = "+inch);
        System.out.println((int)((foot+inch/12.0)*0.3048*100)+"cm");
	}

}
