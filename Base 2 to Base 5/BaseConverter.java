public class BaseConverter{


	public static void main(String... args){

		System.out.println(convertBaseOf(20,2,5));

	}



	public static int convertBaseOf(int number, int baseTwo, int baseFive){

		int count = 0;
		int binaryValue = 0;
		int digit;
		int multiple = 1;

		int[] binaryDigits = new int[32];

		if(number < 0){

			number *= -1;

		}else if(number == 0){

			return number;

		}

		while(number != 0){

			digit = number % baseTwo;
			number = number / baseTwo;
			binaryDigits[count] = digit;
			count++;
		}

		for(int index = count; index >= 0; index--){

			for(int counter = 0; counter < index; counter++){

				multiple *= 10;
			}

			digit = binaryDigits[index] * multiple;
			
			binaryValue += digit;
			multiple = 1;

		}

		multiple = 1;
		int decimalValue = 0;

		if(number < 0){

			return 0;

		}

		while(binaryValue != 0){

			digit = binaryValue % 10;
			number = binaryValue / 10;

			if(digit <= 1){

				decimalValue += digit * multiple;
				multiple *= 2;

			}else{

				return 0;

			}
			
		}


		count = 0;
		multiple = 1;
		int[] baseFiveDigits = new int[16];
		int baseFiveValue = 0;

		while(number != 0){

			digit = number % baseFive;
			number = number / baseFive;
			baseFiveDigits[count] = digit;
			count++;
		}

		for(int index = count; index >= 0; index--){

			for(int counter = 0; counter < index; counter++){

				multiple *= 10;
			}

			digit = baseFiveDigits[index] * multiple;
			
			baseFiveValue += digit;
			multiple = 1;

		}

		return baseFiveValue;
		

	}




}