import java.util.*;
public class Numberguessgame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		
		int guess;
		int attempts = 3;
		int randomnumber=random.nextInt(1,10);
		
		System.out.println("Number Guessing Game");
		System.out.println("Guess an number between 1 to 10:");
		
		do {
			
			System.out.println("Enter a guess:");
			guess=sc.nextInt();
			attempts++;
			
			
			if(guess<randomnumber) {
				System.out.println("Guess is too low!");
				
			}
			else if(guess>randomnumber) {
				System.out.println("Guess is too high!");
				
			}
			else {
				System.out.println("CORRECT the randomnumber is " + randomnumber);
				System.out.println("Number of attempts is " + attempts);
			}
			
		}while(guess!=randomnumber);
	
			
		
	}

}
