import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AutomaticBikeTest{

	@Test
	public void testThatBikeIsOn(){

		boolean expected = AutomaticBike.isOn();
		boolean actual = true;

		assertEquals(expected, actual); 
	}


	@Test
	public void testThatBikeIsOff(){

		boolean expected = AutomaticBike.isOff();
		boolean actual = false;

		assertEquals(expected, actual); 
	}


	@Test
	public void testThatBikeCanBeAccelerated(){

		int speed = 15;
		int expected = AutomaticBike.accelerateBike(speed);
		int actual = 16;

		assertEquals(expected, actual); 
	}


	@Test
	public void testThatBikeCanBeDecelerated(){

		int speed = 15;
		int expected = AutomaticBike.decelerateBike(speed);
		int actual = 14;

		assertEquals(expected, actual); 
	}


	@Test
	public void testThatBikeIsInGearOne(){

		int speed = 10;
		String expected = AutomaticBike.bikeGear(speed);
		String actual = "Gear 1";

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeIsInGearTwo(){

		int speed = 23;
		String expected = AutomaticBike.bikeGear(speed);
		String actual = "Gear 2";

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeIsInGearThree(){

		int speed = 34;
		String expected = AutomaticBike.bikeGear(speed);
		String actual = "Gear 3";

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeIsInGearFour(){

		int speed = 45;
		String expected = AutomaticBike.bikeGear(speed);
		String actual = "Gear 4";

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeAcceleratedInGearOne(){

		int speed = 14;
		int expected = AutomaticBike.accelerateInGearOne(speed);
		int actual = 15;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeAcceleratedInGearTwo(){

		int speed = 24;
		int expected = AutomaticBike.accelerateInGearTwo(speed);
		int actual = 26;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeAcceleratedInGearThree(){

		int speed = 35;
		int expected = AutomaticBike.accelerateInGearThree(speed);
		int actual = 38;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeAcceleratedInGearFour(){

		int speed = 44;
		int expected = AutomaticBike.accelerateInGearFour(speed);
		int actual = 48;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeDeceleratedInGearOne(){

		int speed = 15;
		int expected = AutomaticBike.decelerateInGearOne(speed);
		int actual = 14;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeDeceleratedInGearTwo(){

		int speed = 24;
		int expected = AutomaticBike.decelerateInGearTwo(speed);
		int actual = 22;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeDeceleratedInGearThree(){

		int speed = 35;
		int expected = AutomaticBike.decelerateInGearThree(speed);
		int actual = 32;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeDeceleratedInGearFour(){

		int speed = 44;
		int expected = AutomaticBike.decelerateInGearFour(speed);
		int actual = 40;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeAcceleratedFromAnyGear(){

		int speed = 38;
		int expected = AutomaticBike.accelerateBikeInAnyGear(speed);
		int actual = 41;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatBikeCanBeDeceleratedFromAnyGear(){
	
		int speed = 20;
		int expected = AutomaticBike.decelerateBikeInAnyGear(speed);
		int actual = 19;

		assertEquals(expected, actual);

	}


}