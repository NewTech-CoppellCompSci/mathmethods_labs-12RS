package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		
		Scanner scanny = new Scanner(System.in);
		
		System.out.println("Choose a positive integer");
		
		int userNom = scanny.nextInt();
		
		System.out.println("Choose a whole number ");
		
		int userNum = scanny.nextInt();
		
		//find power of userNom and userNum
		
		System.out.println(userNom + "^" + userNum + " " + Math.pow(userNom,userNum));
		
		
		
	}
	
	
	
	
	public static void problem02() {
		
		// finding users number input
		
		Scanner goofball = new Scanner(System.in);
		
		System.out.println("Choose a positive integer");
		
		int userDum = goofball.nextInt();
		
		System.out.println(" The square root of " + userDum + " is " + Math.sqrt(userDum));
		
	}
	
	

	public static void problem03() {
		
		Scanner poop = new Scanner(System.in);
		
		System.out.println("What is side 1 of a Right Triangle");
		
		int userDumb = poop.nextInt();
		
		System.out.println("What is side 2 of a Right Triangle");
		
		int userAlsoDumb = poop.nextInt();
		
		System.out.println("Hypotenuse = " + Math.sqrt(Math.pow(userDumb, 2 )+(Math.pow(userAlsoDumb, 2))));
		

	}


	
	
	public static void problem04() {
		// maximum and minimum values 
		
		int maximom = Integer.MIN_VALUE;
		int minimom = Integer.MAX_VALUE;
		Scanner goop = new Scanner(System.in);
		int userBum = 1;
		boolean notZer0 = true;
		
		while (notZer0) {
			System.out.println(" Choose an integer, afterwards choose 0");
			userBum = goop.nextInt();
			if (userBum == 0) {
				notZer0 = false; 
			
						
			}
			else {		
					if (userBum > maximom) {
						maximom = userBum;
					
					}
					else if (userBum< minimom ) {
						minimom = userBum;
						
					}
			}
			}
			
		}
		
		
		
	}
	
	
	

	

