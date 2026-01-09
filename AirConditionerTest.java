import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class AirConditionerTest{


	@Test
	public void testThatACIsOn(){

		boolean expected = AirConditioner.isOn();
		boolean actual = true;

		assertEquals(expected, actual); 
	}


	@Test
	public void testThatACisOff(){

		boolean expected = AirConditioner.isOff();
		boolean actual = false;

		assertEquals(expected, actual);

	}


	@Test
	public void testThatACTemperatureIncreased(){

		int initialTemp = 17;
		int expected = AirConditioner.increaseTemp(initialTemp);
		int actual = 18;

		assertEquals(expected, actual);
	}


	@Test
	public void testThatACTemperatureDecreased(){

		int initialTemp = 21;
		int expected = AirConditioner.decreaseTemp(initialTemp);
		int actual = 20;

		assertEquals(expected, actual);
	}


	@Test
	public void testThatMaximumTemperatureCannotBePassed(){

		int initialTemp = 34;
		int expected = AirConditioner.increaseTemp(initialTemp);
		int actual = 30;

		assertEquals(expected, actual);
	}


	@Test
	public void testThatMinimumTemperatureCannotBePassed(){

		int initialTemp = 10;
		int expected = AirConditioner.decreaseTemp(initialTemp);
		int actual = 16;

		assertEquals(expected, actual);
	}


}