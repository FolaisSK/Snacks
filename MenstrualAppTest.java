import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class MenstrualAppTest{

	@Test
	public void testThatLastPeriodStartDateIsGotten(){

		LocalDate actual = LocalDate.of(2026, 1, 1);
		LocalDate expected = MenstrualApp.lastPeriodStartDate("2026-01-01");

		assertEquals(expected, actual);

	}

	@Test
	public void testThatNextPeriodStartDateIsGotten(){

		LocalDate actual = LocalDate.of(2026, 1, 29);
		LocalDate expected = MenstrualApp.nextPeriodStartDate(LocalDate.of(2026, 1, 1), 28);

		assertEquals(expected, actual);

	}

	@Test
	public void testThatOvulationDateIsGotten(){

		LocalDate actual = LocalDate.of(2026, 1, 20);
		LocalDate expected = MenstrualApp.ovulationDate(LocalDate.of(2026, 2, 3));

		assertEquals(expected, actual);

	}

	@Test
	public void testThatMenstrualPhaseIsGotten(){

		String actual = "2026-01-04 to 2026-01-08";
		String expected = MenstrualApp.menstrualPhase(LocalDate.of(2026, 1, 4), 5);

		assertEquals(expected, actual);

	}

	@Test
	public void testThatFertileWindowIsGotten(){

		String actual = "2026-01-15 to 2026-01-21";
		String expected = MenstrualApp.fertileWindow(LocalDate.of(2026, 1, 20));

		assertEquals(expected, actual);

	}

	@Test
	public void testThatSafePeriodsAreGotten(){

		String actual = "2026-01-04 to 2026-01-09 and 2026-01-26 to 2026-02-03";
		String expected = MenstrualApp.safePeriods(LocalDate.of(2026, 1, 4), LocalDate.of(2026, 2, 3), 5);

		assertEquals(expected, actual);

	}


}