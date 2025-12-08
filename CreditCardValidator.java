import java.util.Arrays;

import java.util.Scanner;

public class CreditCardValidator{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.print("Hello, Kindly Enter Card details to verify: ");
		long userInput = input.nextLong();

		System.out.println("Credit Card Type: " + typeOfCard(userInput));
		System.out.println("Credit Card Number: " + userInput);
		System.out.println("Credit Card Digit Length: " + lengthOfCard(userInput));
		System.out.println("Credit Card Validity Status: " + validityCheck(userInput));		

	}





// Card to String

	public static String cardToString(long userInput){

		String cardString = userInput + "";

		return cardString;

	}




// Length of Card

	public static int lengthOfCard(long userInput){

		int length = cardToString(userInput).length();

		return length;

	}



// Card in an Array


	public static long[] cardArray(long userInput){

		int count = lengthOfCard(userInput) - 1;
		long number = userInput;
		long[] cardNumber = new long[lengthOfCard(userInput)];

		while(number != 0){

			long digit = number % 10;
			number = number / 10;
			cardNumber[count--] = digit;
			
		}

		return cardNumber;

	}



// Type Of Card Checker


	public static String typeOfCard(long userInput){

		long [] cardNumber = cardArray(userInput);
		String cardType = "";

		if(cardNumber[0] == 3 && cardNumber[1] == 7){

			cardType = "American Express Cards";

		}else if(cardNumber[0] == 4){

			cardType = "Visa Cards";

		}else if(cardNumber[0] == 5){

			cardType = "MasterCard";

		}else if (cardNumber[0] == 6){

			cardType = "Discover cards";

		}else{

			cardType = "Can be Verve sha";

		}

		return cardType;


	}



// Right to left doubler


	public static long doubledValue(long userInput){

		long[] cardNumber = cardArray(userInput);
		long multiple = 0;
		long number = 0;
		long total = 0;

		for(int count = lengthOfCard(userInput) - 2; count >= 0; count -= 2){
		
			multiple = cardNumber[count] * 2;	

			if(multiple >= 10){

				long digit = multiple % 10;
				number = multiple / 10;
				total += (digit + number); 
				
			}else{

				total += multiple;
			
			}
		}

		return total;

	}



// Right to Left Adder


	public static long oddPositionAdd(long userInput){

		long[] cardNumber = cardArray(userInput);
		long total = 0;

		for(int count = lengthOfCard(userInput) - 1; count >= 0; count -= 2){
		
			total += cardNumber[count];
		}

		return total;		


	}


// Sum of the Odd Adder and Even Doubler


	public static long sumOfDoublerAndAdder(long userInput){

		long sum = doubledValue(userInput) + oddPositionAdd(userInput);

		return sum;

	}



// Validity Check


	public static String validityCheck(long userInput){

		if(sumOfDoublerAndAdder(userInput) % 10 == 0){

			return "Valid!";

		}else{

			return "Invalid";
		}

	}





}