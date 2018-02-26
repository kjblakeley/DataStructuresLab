import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		int radius = keyboard.nextInt();
		
		double area= Math.PI*radius*radius;
		
		System.out.println("The area of a circle with radius = "+radius+", is: " + area);
		
		
	}

}
