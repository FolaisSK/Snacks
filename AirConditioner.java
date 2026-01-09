public class AirConditioner{

	public static void main(String... args){

		boolean switchACOn = isOn();
	}


	public static boolean isOn() {

		return true;

	}


	public static boolean isOff() {

		return false;

	}


	public static int increaseTemp(int currentTemp){

		if(currentTemp >= 30){

			return 30;

		}

		return ++currentTemp;

	}


	public static int decreaseTemp(int currentTemp){

		if(currentTemp <= 16){

			return 16;

		}

		return --currentTemp;
	}
		



}