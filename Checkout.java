import java.util.Scanner;
import java.util.Arrays;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Checkout{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		System.out.println("What is the customer's name: ");
		String customerName = input.nextLine();


		System.out.print("How many items is the customer purchasing: ");
		int numberOfItems = input.nextInt();
		input.nextLine();

		String[] items = new String[numberOfItems];
		double[] units = new double[numberOfItems];
		double[] unitPrices = new double[numberOfItems];
		double amountPaid = 0;

		for(int count = 0; count < numberOfItems; count++){

			System.out.println("What did the user buy: ");
			String itemName = input.nextLine();
			items[count] = itemName;

			System.out.println("How many pieces: ");
			double unit = input.nextDouble();
			units[count] = unit;

			System.out.println("How much per unit: ");
			double unitPrice = input.nextDouble();
			unitPrices[count] = unitPrice;
			input.nextLine();
			System.out.println("Item successfully added!");
		

		}


		System.out.println("What is your name: ");
		String cashierName = input.nextLine();

		System.out.println("How much discount will the customer get: ");
		double discountOnItems = input.nextDouble();		
		input.nextLine();


		double[] itemsPriceTotals = priceTotals(unitPrices, units);


		//INVOICE
		String header = """
		SEMICOLON STORES
		MAIN BRANCH
		LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
		TEL: 09079358997 """;

		String line = "-----------------------------------------------------------";

		System.out.println(header);
		System.out.println("Date: " + invoiceDateAndTime());
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);

		System.out.println(line);
		System.out.println("ITEM		QTY		PRICE		TOTAL(NGN)");
		System.out.println(line);

		for(int count = 0; count < items.length; count++){

		System.out.println(items[count] + "		" + units[count] + "		" + unitPrices[count] + "		" + itemsPriceTotals[count]);

		}

		System.out.println(line);



		double itemsSubTotal = subTotal(itemsPriceTotals);
		System.out.println("Sub Total: " + itemsSubTotal);
			
		double totalDiscount = totalDiscount(itemsPriceTotals, discountOnItems);
		System.out.println("Discount: " + totalDiscount);
		
		double itemsVAT = totalVAT(itemsPriceTotals);
		System.out.println("VAT @ 7.5%: " + itemsVAT);

		System.out.println(line);

		double itemsBillTotal = billTotal(itemsPriceTotals, discountOnItems);
		System.out.println("The total bill to be paid: " + itemsBillTotal);

		System.out.println(line);

		System.out.println("THIS IS NOT A RECEIPT KINDLY PAY: " + itemsBillTotal);
		System.out.println(line);

		//END OF INVOICE

		while(amountPaid < itemsBillTotal){

			System.out.println("How much did the customer give you?");
			amountPaid = input.nextDouble();
			input.nextLine();

		}


		//RECEIPT

		System.out.println(header);
		System.out.println("Date: " + invoiceDateAndTime());
		System.out.println("Cashier: " + cashierName);
		System.out.println("Customer Name: " + customerName);

		System.out.println(line);
		System.out.println("ITEM		QTY		PRICE		TOTAL(NGN)");
		System.out.println(line);

		for(int count = 0; count < items.length; count++){

		System.out.println(items[count] + "		" + units[count] + "		" + unitPrices[count] + "		" + itemsPriceTotals[count]);

		}

		System.out.println(line);


		System.out.println("Sub Total: " + itemsSubTotal);
			
		System.out.println("Discount: " + totalDiscount);
		
		System.out.println("VAT @ 7.5%: " + itemsVAT);

		System.out.println(line);

		System.out.println("The total bill to be paid: " + itemsBillTotal);

		System.out.println("Amount Paid: " + amountPaid);
		System.out.println("Balance: " + balanceOfBill(itemsPriceTotals, discountOnItems, amountPaid));

		System.out.println(line);

		System.out.println("THANK YOU FOR SHOPPING WITH SEMICOLON STORES!!!");

		System.out.println(line);



	}





	public static String invoiceDateAndTime(){

		LocalDateTime dateAndTime = LocalDateTime.now();

		DateTimeFormatter currentDateAndTime = DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss");

		String formattedDate = dateAndTime.format(currentDateAndTime);

		return formattedDate;

	}




	public static double[] priceTotals(double[] unitPrices, double[] units){

		double totalOfPrices[] = new double[unitPrices.length];
		double result = 0;

		for(int count = 0; count < unitPrices.length; count++){

			result = unitPrices[count] * units[count];
			totalOfPrices[count] = result;

		}

		return totalOfPrices;

	}


	public static double subTotal(double[] totalOfPrices){

		double total = 0;

		for(double price: totalOfPrices){

			total += price;
		}

		return total;

	}


	public static double totalVAT(double[] totalOfPrices){

		double tax = subTotal(totalOfPrices) * 0.075;

		return tax;

	}



	public static double totalDiscount(double[] totalOfPrices, double discountValue){

		double discount = subTotal(totalOfPrices) * (discountValue / 100);

		return discount;

	}


	public static double billTotal(double[] totalOfPrices, double discountValue){

		double total = subTotal(totalOfPrices) - totalDiscount(totalOfPrices, discountValue) + totalVAT(totalOfPrices);

		return total;
	}


	public static double balanceOfBill(double[] totalOfPrices, double discountValue, double paidValue){

		double balance = paidValue - billTotal(totalOfPrices, discountValue);

		return balance;

	}







}