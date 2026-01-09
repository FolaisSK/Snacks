import java.util.Scanner;
import java.util.Arrays;

public class MiniParkingSystem{

	public static void main(String... args){

		Scanner input = new Scanner(System.in);

		String menu = """
		============ MINI PARKING SYSTEM ============
		1. Park Car
		2. Remove Car
		3. Display Parking Status
		0. Exit
		============================================= """;

		boolean isOn = true;

		int[] parkingSlots = new int[20];

		while(isOn){

			System.out.println(menu);
	
			System.out.print("Enter Option: ");
			int option = input.nextInt();

			switch(option){

				case 1 -> {

					System.out.println("============ PARK CAR ============");

					System.out.print("What slot would you like to enter?(1 - 20): ");
					int parkedSlotNumber = input.nextInt();

					if(parkedSlotNumber < 1 || parkedSlotNumber > 20){

						System.out.println("No Car Slot!");

					}else if(parkingSlots[parkedSlotNumber - 1] == 1){

						System.out.println("Slot Occupied!");
	
					}else{

					parkingSlots = parkCar(parkingSlots, parkedSlotNumber);

					}

				}

				case 2 -> {

					System.out.println("============ REMOVE CAR ============");

					System.out.print("What slot would you like removed?(1 - 20): ");
					int removedSlotNumber = input.nextInt();

					if(removedSlotNumber < 1 || removedSlotNumber > 20){

						System.out.println("No Car Slot!");

					}else if(parkingSlots[removedSlotNumber - 1] == 0){

						System.out.println("Slot Vacant!");
		
					}else{

					parkingSlots = removeCar(parkingSlots, removedSlotNumber);

					}
		
				}

				case 3 -> {

					System.out.println("============ PARKING STATUS ============");

					System.out.println("1 = Occupied\n0 = Vacant\n");
					//System.out.println(Arrays.toString(parkingSlots));

					int slotNumber = 1;

					System.out.println("SLOTS\t STATUS");

					for(int count = 0; count < parkingSlots.length; count++){
	
						System.out.println("SLOT " + slotNumber + "\t " + parkingSlots[count]);
						slotNumber++;

					}

				}

				case 0 -> {

					System.out.println("EXITING>>>>>>>>>>>>>>>>>>>>>>>>>>");
					isOn = false;

				}

				default -> {System.out.println("Invalid Option");}

			}

		}


	}


	
	//Park Car
	public static int[] parkCar(int[] arr, int parkSlotNumber){

		int parkingIndex = parkSlotNumber - 1;

		if(parkSlotNumber < 1 || parkSlotNumber > 20){
			
				return arr;
		}

		for(int count = 0; count < arr.length; count++){

			if(count == parkingIndex){

				arr[count] = 1;
			}

		}
	
		return arr;

	}
	


	//Remove Car
	public static int[] removeCar(int[] arr, int removeSlotNumber){

		int removeIndex = removeSlotNumber - 1;

		if(removeSlotNumber < 1 || removeSlotNumber > 20){
			
			return arr;
		}

		for(int count = 0; count < arr.length; count++){

			if(count == removeIndex){

				arr[count] = 0;

			}

		}

		return arr;

	}



}