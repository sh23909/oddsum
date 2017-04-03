import java.util.Scanner;

public class oddsum {
	public static void main(String[] args) {

		int maxNum, sum, counter; 
		Scanner input = new Scanner(System.in); 
		System.out.println("How many odd numbers should I add up?: ");
		maxNum = input.nextInt();   

		sum = 0;

		counter = 1;
		do{
			if (counter % 2 != 0) 
			   {
			      sum += counter;          
			   }
			   counter++;
			  
		}
		while(counter <= maxNum); 
		{
		   
		}
		 System.out.println("The sum of the odd numbers between 1 and " + maxNum + " is: " + sum);                 

		}
		
		}
