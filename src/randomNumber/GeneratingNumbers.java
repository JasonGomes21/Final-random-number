//Practical 1: Generate 500 random numbers and print the nth smallest number in a programming language of your choice. (Ask user for the Nth smallest number)

package randomNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class GeneratingNumbers {

	public static void main(String[] args) {
		
		Scanner ui = new Scanner(System.in);
		Random randomGen= new Random(500);
		ArrayList<Integer>list = new ArrayList<Integer>();
		
	
		for(int i = 0; i < 500; i++) {
			int num = randomGen.nextInt(500)+1;
			list.add(num);
			
		}
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Enter the smallest number of your choice");
		int userinput = ui.nextInt()-1;
		int smallestNumber = list.get(userinput);
		System.out.println(smallestNumber);
		System.out.println("Have a great day!!");
		
		
		
		

	}

}
