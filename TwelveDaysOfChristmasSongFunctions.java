import java.util.Scanner;

public class TwelveDaysOfChristmasSongFunctions{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		boolean isRunning = true;

        	while (isRunning) {

            	System.out.println(mainMenu());
            	System.out.print("Enter an option: ");
            	int option = input.nextInt();

			switch(option){

				case 1 -> System.out.println(dayInSong("FIRST DAY", firstVerse()));
				case 2 -> System.out.println(dayInSong("SECOND DAY", secondVerse()));
				case 3 -> System.out.println(dayInSong("THIRD DAY", thirdVerse()));
				case 4 -> System.out.println(dayInSong("FOURTH DAY", fourthVerse()));
				case 5 -> System.out.println(dayInSong("FIFTH DAY", fifthVerse()));
				case 6 -> System.out.println(dayInSong("SIXTH DAY", sixthVerse()));
				case 7 -> System.out.println(dayInSong("SEVENTH DAY", seventhVerse()));
				case 8 -> System.out.println(dayInSong("EIGTH DAY", eigthVerse()));
				case 9 -> System.out.println(dayInSong("NINTH DAY", ninthVerse()));
				case 10 -> System.out.println(dayInSong("TENTH DAY", tenthVerse()));
				case 11 -> System.out.println(dayInSong("ELEVENTH DAY", eleventhVerse()));
				case 12 -> System.out.println(dayInSong("TWELFTH DAY", twelfthVerse()));
				case 0 -> {

					System.out.println("==== EXIT ====");
					isRunning = false;

				}
				default -> System.out.println("Invalid option");
			}

		}

	}




	public static String mainMenu(){

		String twelveDaysMenu = """
			==========THE TWELVE DAYS OF CHRISTMAS SONG==========
			1. FIRST DAY
			2. SECOND DAY
			3. THIRD DAY
			4. FOURTH DAY
			5. FIFTH DAY
			6. SIXTH DAY
			7. SEVENTH DAY
			8. EIGTH DAY
			9. NINTH DAY
			10. TENTH DAY
			11. ELEVENTH DAY
			12. TWELFTH DAY
			0. EXIT
			===================================================== """;

		return twelveDaysMenu;

	}





	public static String dayInSong(String day, String verse){

		Scanner input = new Scanner(System.in);
		System.out.println("====" + day + "====");

		String dayMenu = """
			1. VERSE
			2. EXIT """;

		System.out.println(dayMenu);							
		System.out.print("Enter an option: ");
		int option = input.nextInt();

		
		if(option == 1){
		return verse;
		}else{return "";}
		

	}





	public static String firstVerse(){

		String verse = """
			On the first day of Christmas, my true love sent to me
			A partridge in a pear tree """;
		
		return verse;

	}



	public static String secondVerse(){

		String verse = """
			On the second day of Christmas, my true love sent to me
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}




	public static String thirdVerse(){

		String verse = """
			On the third day of Christmas, my true love sent to me
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





	public static String fourthVerse(){

		String verse = """
			On the fourth day of Christmas, my true love sent to me
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}






	public static String fifthVerse(){

		String verse = """
			On the fifth day of Christmas, my true love sent to me
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





	public static String sixthVerse(){

		String verse = """
			On the sixth day of Christmas, my true love sent to me
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





	public static String seventhVerse(){

		String verse = """
			On the seventh day of Christmas, my true love sent to me
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





	public static String eigthVerse(){

		String verse = """
			On the eighth day of Christmas, my true love sent to me
			Eight maids a-milking
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}






	public static String ninthVerse(){

		String verse = """
			On the ninth day of Christmas, my true love sent to me
			Nine ladies dancing
			Eight maids a-milking
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





	public static String tenthVerse(){

		String verse = """
			On the tenth day of Christmas, my true love sent to me
			Ten lords a-leaping
			Nine ladies dancing
			Eight maids a-milking
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}



	public static String eleventhVerse(){

		String verse = """
			On the eleventh day of Christmas, my true love sent to me
			Eleven pipers piping
			Ten lords a-leaping
			Nine ladies dancing
			Eight maids a-milking
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}



	public static String twelfthVerse(){

		String verse = """
			On the twelfth day of Christmas, my true love sent to me
			Twelve drummers drumming
			Eleven pipers piping
			Ten lords a-leaping
			Nine ladies dancing
			Eight maids a-milking
			Seven swans a-swimming
			Six geese a-laying
			Five golden rings
			Four calling birds
			Three french hens
			Two turtle doves and
			A partridge in a pear tree """;
		
		return verse;

	}





}