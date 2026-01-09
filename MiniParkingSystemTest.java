import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiniParkingSystemTest{

	@Test
	public void testThatCarIsParkedInSlotOne(){

		int[] array = new int[20];
		int[] expected = MiniParkingSystem.parkCar(array, 1);
		int[] actual = {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testThatCarIsParkedInSlotTen(){

		int[] array = new int[20];
		int[] expected = MiniParkingSystem.parkCar(array, 10);
		int[] actual = {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testThatCarIsParkedInSlotTwenty(){

		int[] array = new int[20];
		int[] expected = MiniParkingSystem.parkCar(array, 20);
		int[] actual = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testThatCarIsRemovedFromSlotOne(){

		int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] expected = MiniParkingSystem.removeCar(array, 1);
		int[] actual = {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testThatCarIsRemovedFromSlotTen(){

		int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] expected = MiniParkingSystem.removeCar(array, 10);
		int[] actual = {1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1};

		assertArrayEquals(expected, actual);

	}


	@Test
	public void testThatCarIsRemovedFromSlotTwenty(){

		int[] array = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		int[] expected = MiniParkingSystem.removeCar(array, 20);
		int[] actual = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};

		assertArrayEquals(expected, actual);

	}


}