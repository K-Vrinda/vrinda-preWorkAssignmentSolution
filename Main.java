import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	//function to checkPalindrome
	public void checkPalindrome()  {
		System.out.println("Enter number: ");
		int n = sc.nextInt();		
		int reverse = 0;
		int temp = n;
		
		while(temp > 0) {
			reverse = (reverse * 10) + (temp % 10);
			temp = temp / 10;
		}
		
		if(reverse == n) {
			System.out.println(n + " is a palindrome");
		}else {
			System.out.println(n + " is not a palindrome");	
		}
	}

	//function to printPattern
	public void printPattern() {
		System.out.println("Enter number: ");
		int n = sc.nextInt();		
		
		for(int i = 1; i <= n; i++){
			for(int j = 1; j <= n - i + 1; j++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

	//function to check no is prime or not
	public void checkPrimeNumber() {
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		boolean flag = true;
		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				System.out.println(n + " is not prime ");
				flag = false;
				break;
			}
		}

		if(flag) {
			System.out.println(n + " is prime ");
		}
	}

	// function to print Fibonacci Series
	public void printFibonacciSeries() {

		int first = 0, second = 1;
		System.out.println("Enter number: ");
		int n = sc.nextInt();
		int term;
		
		while(n-- > 0){
			System.out.println(first);
			term = first + second;
			first = second;
			second = term;
		}

	}

	public static void main(String[] args) {

		Main obj = new Main();

		int choice;

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Enter your choice from below list.\n" 
		+ "1. Find palindrome of number.\n"
		+ "2. Print Pattern for a given no.\n" 
		+ "3. Check whether the no is a  prime number.\n"
		+ "4. Print Fibonacci series.\n" 
		+ "--> Enter 0 to Exit.\n");

			System.out.println();
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				choice = 0;
				break;
			case 1: {
				obj.checkPalindrome();
			}
			break;
			case 2: {
				obj.printPattern();
			}
			break;
			case 3: {
				obj.checkPrimeNumber();
			}
			break;
			case 4: {
				obj.printFibonacciSeries();
			}
			break;
			default:
				System.out.println("Invalid choice. Enter a valid no.\n");
			}
		} while (choice != 0);

		System.out.println("Exited Successfully!!!");

		sc.close();

	}

}
