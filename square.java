package calculatesquare;

import java.util.Scanner;

public class square {
	static int sideone ;
	static int sidetwo ;
	static Scanner sc= new Scanner(System.in);

public static void main(String[] args) {
	System.out.println("Enter first side");
	int sideone= sc.nextInt();  
	System.out.println("Enter second side");
	int sidetwo= sc.nextInt();
	System.out.println("The squares area is : " +sideone*sidetwo);
}
}