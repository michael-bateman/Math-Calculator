import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Global variables (used on more than 1 calculator)
		
		Scanner s = new Scanner(System.in);
		
		//Pythagorean Theorem Calculator variables
		double a = 0;
		double b = 0;
		double c = 0;
		
		String missing = "";
		
		//Mod Simplifier variables
		int modNumber = 0;
		int mod = 0;
		
		//Volume of a sphere
		double radius = 0;
		double area = 0;
		
		//Pythagorean Theorem Calculator
		
		System.out.println("Pythagorean Theorem Calculator\n------------------------------\nFormula Used:\na*a + b*b = c*c\nAll numbers are automatically rounded to the nearest hundredth");
		
		System.out.print("What side are you missing? (a, b or c) ");
		missing = s.next();
		
		if (missing.equals("b") || missing.equals("c")) {
			System.out.print("What is the length of your 'a' side? ");
			a = s.nextDouble();
			a = a*a;
		}
		
		if (missing.equals("a") || missing.equals("c")) {
			System.out.print("What is the length of your 'b' side? ");
			b = s.nextDouble();
			b = b*b;
		}
		
		if (missing.equals("a") || missing.equals("b")) {
			System.out.print("What is the length of your 'c' side? ");
			c = s.nextDouble();
			c = c*c;
		}
		
		if (missing.equals("c")) {
			c = Math.round(Math.sqrt(a + b) * 100.00)/100.00;
			System.out.println(c);
		} else if (missing.equals("a")) {
			a = Math.round(Math.sqrt(-b + c) * 100.00)/100.00;
			System.out.println(a);
		} else if (missing.equals("b")) {
			b = Math.round(Math.sqrt(-a + c) * 100.00)/100.00;
			System.out.println(b);
		} else {
			System.out.println("Error... Invalid side");
		} 
		
		//Mod Simplifier
		
		System.out.println("Mod Simplifier\n--------------\nThis calculator simplifies modular numbers");
		
		System.out.print("What is the number? ");
		modNumber = s.nextInt();
		
		System.out.print("What is the mod? ");
		mod = s.nextInt();
		
		while (modNumber >= mod) {
			modNumber -= mod;
		}
		
		if (modNumber == mod) {
			modNumber -= mod;
		}
		
		System.out.println(modNumber);
		
		// Volume of a Sphere Calculator
		
		System.out.println("Volume of a Sphere Calculator\n----------------------------\nFormula:\nA = 4/3 * 104348/33215 * (r * r)\nAll numbers are automatically rounded to the nearest hundredth");
		
		System.out.print("What is the radius of the sphere? ");
		radius = s.nextDouble();
		
		area = (4.0/3)*(104348.0/33215)*(radius*radius);
		
		area = Math.round(area*100.00)/100.00;
		
		System.out.println("The area is " + area);
	
	}

}
