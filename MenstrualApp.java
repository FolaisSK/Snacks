import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MenstrualApp{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		//System.out.print("Enter Age: ");
		//int age = input.nextInt();

		System.out.print("Enter Cycle Length(days): ");
		int cycleLength = input.nextInt();

		System.out.print("Enter Period Length(days): ");
		int periodLength  = input.nextInt();
		input.nextLine();

		System.out.print("Enter Last Period Start Date(yyyy-MM-dd): ");
		String lastPeriodInput = input.nextLine();
		System.out.println();

		LocalDate lastPeriod = lastPeriodStartDate(lastPeriodInput);

		LocalDate nextPeriodDate = nextPeriodStartDate(lastPeriod, cycleLength);

		LocalDate ovulationDate = ovulationDate(nextPeriodDate);

		System.out.println("======== USER'S REPORT ========");
		System.out.println("Next Period Date: " + nextPeriodDate);
		System.out.println("Ovulation Date: " + ovulationDate);
		System.out.println("Menstrual Phase: " + menstrualPhase(lastPeriod, periodLength));
		System.out.println("Fertile Window: " + fertileWindow(ovulationDate));
		System.out.println("Safe Periods: " + safePeriods(lastPeriod, nextPeriodDate, periodLength));


	}



	//Last Period Start Date
	public static LocalDate lastPeriodStartDate(String lastPeriodInput){

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate lastPeriodDate = LocalDate.parse(lastPeriodInput, formatter);

		return lastPeriodDate;

	}


	//Next Period Start Date
	public static LocalDate nextPeriodStartDate(LocalDate lastPeriod, int cycleLength){

		LocalDate nextPeriod = lastPeriod.plusDays(cycleLength);

		return nextPeriod;

	}


	//Ovulation Start Date
	public static LocalDate ovulationDate(LocalDate nextPeriod){

		LocalDate ovulationDate = nextPeriod.minusDays(14);

		return ovulationDate;

	}


	//Menstrual Phase
	public static String menstrualPhase(LocalDate lastPeriod, int periodLength){

		LocalDate endOfPeriod = lastPeriod.plusDays(periodLength - 1);

		String daysOfPeriod = lastPeriod + " to " + endOfPeriod;

		return daysOfPeriod;

	}


	//Fertile Window
	public static String fertileWindow(LocalDate ovulationDate){

		LocalDate startingDay = ovulationDate.minusDays(5);
		LocalDate endingDay = ovulationDate.plusDays(1);

		String fertilityWindow = startingDay + " to " + endingDay;

		return fertilityWindow;

	}


	//Safe Periods
	public static String safePeriods(LocalDate lastPeriod, LocalDate nextPeriod, int periodLength){

		LocalDate firstSafePeriodStartDay = lastPeriod;
		LocalDate firstSafePeriodEndDay = lastPeriod.plusDays(periodLength);

		LocalDate secondSafePeriodStartDay = nextPeriod.minusDays(8);
		LocalDate secondSafePeriodEndDay = nextPeriod;

		String safePeriods = firstSafePeriodStartDay + " to " + firstSafePeriodEndDay + " and " + secondSafePeriodStartDay + " to " + secondSafePeriodEndDay;

		return safePeriods;

	}







}