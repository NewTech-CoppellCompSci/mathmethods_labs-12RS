package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner binkey = new Scanner(System.in);
		
		System.out.println("Choose a positive integer");
		
		int userBum = binkey.nextInt();
		
		System.out.println("Choose Another Positive Integer ");
		
		int userDumb2 = binkey.nextInt();
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int x1 = userBum;
		int x2 = userDumb2;
		
		max = Math.max(max, x1);
		max = Math.max(max, x2);
		min = Math.min(min, x1);
		min = Math.min(min, x2);

		
		int random = max - min + 1;
		int random2 = min;
		
		for (int i = 0; i < 10; i++) {
			int computer = (int) (Math.random() * random + random2 );
			System.out.println(computer + " ");
		}
		
			System.out.println(" ");
		
		
		
	}
	
	
	
	
	public static void problem02() {
		
		Scanner binkey = new Scanner(System.in);

		System.out.println("Give Me The Radius And Height Of A Cylinder");

		int userInput = binkey.nextInt();
		
	
		int Input1 = userInput;
		
		

		
		
	}

	
	

	public static void problem03() {

		
		
	}


	
	
	public static void problem04() {
		
		
		
		
	}
	
	

	
}
