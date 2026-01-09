import java.util.Arrays;
public class ArrayKata{

	public static void main(String... args){

//		int[] arr = {2,4,34,56,7,-8,3,54};
		int[] arr = {2,4,3,5,8,9};

		System.out.println(Arrays.toString(squareNumbersIn(arr)));


	}



	

//Maximum in an Array
	
	public static int maximumIn(int[] arr){

		int largest = arr[0];

		for(int number: arr){

			if (number >= largest){

				largest = number;

			}

		}

		return largest;

	}



//Minimum in an array

	public static int minimumIn(int[] arr){

		int smallest = arr[0];

		for(int number: arr){

			if (number <= smallest){

				smallest = number;

			}

		}

		return smallest;

	}



//Sum of an Array

	public static int sumOf(int[] arr){

		int total = 0;

		for(int number: arr){

			total += number;
		}

		return total;

	}



//Sum of even numbers in an array

	public static int sumOfEvenNumbersIn(int[] arr){

		int total = 0;

		for(int number: arr){

			if(number % 2 == 0){

				total += number;

			}

		}

		return total;

	}



//Sum of odd numbers in an array

	public static int sumOfOddNumbersIn(int[] arr){

		int total = 0;

		for(int number: arr){

			if(number % 2 != 0){

				total += number;

			}

		}

		return total;


	}



//Maximum and Minimum of an array in a new Array

	public static int[] maximumAndMinimumOf(int[] arr){

		int[] newArray = new int[2];
		
		newArray[0] = maximumIn(arr);
		newArray[1] = minimumIn(arr);

		return newArray;

	}



//Returning the number of Odd numbers in the array

	public static int noOfOddNumbersIn(int[] arr){
	
		int total = 0;

		for(int number: arr){

			if(number % 2 != 0){

				total++;

			}

		}

		return total;

	}




//Returning the number of Even numbers in the array

	public static int noOfEvenNumbersIn(int[] arr){
	
		int total = 0;

		for(int number: arr){

			if(number % 2 == 0){

				total++;

			}

		}

		return total;

	}



//Returning an array of even numbers

	public static int[] evenNumbersIn(int[] arr){

		int length = noOfEvenNumbersIn(arr);

		int[] newArray = new int[length];
		int count = 0;

		for(int number: arr){

			if(number % 2 == 0){

				newArray[count] = number;
				count++;
			}

		}

		return newArray;


	}



//Returning an array of odd numbers

	public static int[] oddNumbersIn(int[] arr){

		int length = noOfOddNumbersIn(arr);

		int[] newArray = new int[length];
		int count = 0;

		for(int number: arr){

			if(number % 2 != 0){

				newArray[count] = number;
				count++;
			}

		}

		return newArray;


	}



//Returning an array of squared numbers

	public static int[] squareNumbersIn(int[] arr){

		int count = 0;
		for(int number: arr){

			arr[count] = number * number;
			count++;

		}

		return arr;

	}






}