public class AutomaticBike{


	public static void main(String... args){

		String gear = bikeGear(decelerateInGearFour(42));
		System.out.println(gear);

	}


	
	public static boolean isOn(){

		return true;

	}


	public static boolean isOff(){

		return false;

	}


	public static int accelerateBike(int currentSpeed){

		return ++currentSpeed;

	}


	public static int decelerateBike(int currentSpeed){

		return --currentSpeed;

	}


	public static String bikeGear(int currentSpeed){

		if(currentSpeed >= 0 && currentSpeed <= 20){

			return "Gear 1";

		}else if(currentSpeed > 20 && currentSpeed <= 30){

			return "Gear 2";

		}else if(currentSpeed > 30 && currentSpeed <= 40){

			return "Gear 3";

		}else if(currentSpeed > 40){

			return "Gear 4";

		}else{

			return "No Gear";

		}

	}

	
	public static int accelerateBikeInAnyGear(int currentSpeed){

		if(bikeGear(currentSpeed).equals("Gear 1")){
		
			return accelerateInGearOne(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 2")){

			return accelerateInGearTwo(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 3")){

			return accelerateInGearThree(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 4")){

			return accelerateInGearFour(currentSpeed);

		}else{

			return currentSpeed;

		}

	}


	public static int decelerateBikeInAnyGear(int currentSpeed){

		if(bikeGear(currentSpeed).equals("Gear 1")){

			return decelerateInGearOne(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 2")){

			return decelerateInGearTwo(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 3")){

			return decelerateInGearThree(currentSpeed);

		}else if(bikeGear(currentSpeed).equals("Gear 4")){

			return decelerateInGearFour(currentSpeed);

		}else{

			return currentSpeed;

		}

	}


	public static int accelerateInGearOne(int currentSpeed){

		return accelerateBike(currentSpeed);

	}


	public static int accelerateInGearTwo(int currentSpeed){

		return currentSpeed += 2;

	}


	public static int accelerateInGearThree(int currentSpeed){

		return currentSpeed += 3;

	}


	public static int accelerateInGearFour(int currentSpeed){

		return currentSpeed += 4;

	}


	public static int decelerateInGearOne(int currentSpeed){

		return decelerateBike(currentSpeed);

	}


	public static int decelerateInGearTwo(int currentSpeed){

		return currentSpeed -= 2;

	}


	public static int decelerateInGearThree(int currentSpeed){

		return currentSpeed -= 3;

	}


	public static int decelerateInGearFour(int currentSpeed){

		return currentSpeed -= 4;

	}



}