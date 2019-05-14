package week02;

import java.util.Scanner;

public class scoreCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner obj = new Scanner(System.in);
     System.out.println("Enter mark1");
     double m1 =obj.nextDouble();
     System.out.println("Enter mark1");
     double m2 =obj.nextDouble();
     System.out.println("Enter mark1");
     double m3 =obj.nextDouble();
     double avg = (m1+m2+m3)/3;
     System.out.println("Average : "+avg);
     obj.close();
     
     
	}

}
