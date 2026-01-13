import java.util.Scanner;

public class CeasarCipher{

	public static void main(String...args){

		Scanner input = new Scanner(System.in);

		String menu = """
		--------------- CEASAR CIPHER ---------------
		1. Encrypt Message
		2. Decrypt Message
		3. Display Message
		0. Exit
		--------------------------------------------- """;

		boolean isOn = true;
		String plaintext = "";
		int key = 0;
		String cipherText = "";

		while(isOn){

			System.out.println(menu);

			System.out.print("Enter Option: ");
			int option = input.nextInt();
			input.nextLine();

			switch(option){

				case 1 -> {

					System.out.println("--------------- ENCRYPT MESSAGE ---------------\n");

					System.out.print("Enter Plaintext: ");
					plaintext = input.nextLine();

					System.out.print("Enter Key: ");
					key = input.nextInt();

					cipherText = encryptMessage(plaintext, key);
					System.out.println("Plaintext Encrypted!!");

				}

				case 2 -> {

					System.out.println("--------------- DECRYPT MESSAGE ---------------\n");

					System.out.print("Enter Plaintext: ");
					plaintext = input.nextLine();

					System.out.print("Enter Key: ");
					key = input.nextInt();

					cipherText = decryptMessage(plaintext, key);
					System.out.println("Plaintext Decrypted!!");

				}

				case 3 -> {

					System.out.println("Message is now: " + cipherText + "\n");

				}
				case 0 -> {

					System.out.println("Thank you for banking with us 🫡");
					isOn = false;

				}

				default -> {System.out.println("Invalid Option");}

			}

		}


	}



	//Plaintext to Char Array
	public static char[] getCharacterArray(String plaintext){

		char[] letters = plaintext.toCharArray();

		return letters;

	}


	//Encrypt Plaintext
	public static String encryptMessage(String plaintext, int key){

		char[] letters = getCharacterArray(plaintext);

		for(int count = 0; count < letters.length; count++){

			if(Character.isUpperCase(letters[count])){

				letters[count] = (char) ('A' + (letters[count] - 'A' + key) % 26);

			}else if(Character.isLowerCase(letters[count])){

				letters[count] = (char) ('a' + (letters[count] - 'a' + key) % 26);

			}

		}

		return String.valueOf(letters);

	}


	//Decrypt Message
	public static String decryptMessage(String plaintext, int key){

		String letters = encryptMessage(plaintext, -key);

		return letters;

	}



}