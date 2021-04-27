import java.util.Scanner;

public class main {
	

	static void fizzBuzz() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Number : ");
		int number = scanner.nextInt();
		
		
		if(number%3 == 0 && number%5 == 0) 
			System.out.println("FizzBuzz");
		 else if (number%5 == 0)
			System.out.println("Fizz");
		  else if (number%3 == 0)
				System.out.println("Buzz");
		  else
			  System.out.println(number);
		
	};

	public static void main(String[] args) {
		
		boolean again = true;
		
		while (again == true) {
			
			fizzBuzz();
			
			Scanner yesOrNo = new Scanner(System.in);
			System.out.println("Again(Y/N) : ");
			char isAgain = yesOrNo.next().toUpperCase().charAt(0);
			
			if(isAgain == 'Y') {
				again = true;
			} else if (isAgain == 'N') {
				again = false;
				break;
			}
			 else {
				System.out.println("Please Enter a Valid Character(Y/N) :" );
				char isAgain1 = yesOrNo.next().toUpperCase().charAt(0);
				isAgain = isAgain1;
				if (isAgain == 'N') {
					break;
				}
			}
		}
		
		
	}

}
