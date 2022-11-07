package calculatesquare;

import java.util.Scanner;

public class square {
	static float sideone ;
	static float sidetwo ;
	static Scanner sc= new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter first side");
	float sideone= sc.nextFloat();  
	System.out.println("Enter second side");
	float sidetwo= sc.nextFloat();
	System.out.println("The squares area is : " +sideone*sidetwo);
}
}
