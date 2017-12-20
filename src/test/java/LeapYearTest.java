import com.company.samples.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(LeapYear.isLeap(2016));
    }

    @Test
    public void normalYearsAreNotDivisibleByFour() {
        assertFalse(LeapYear.isLeap(2018));
    }

    @Test
    public void yearsDivisibleByHundredAreNotLeapYears() {
        assertFalse(LeapYear.isLeap(1900));
    }

    @Test
    public void yearsDivisibleByFourHundredAreLeapYears() {
        assertTrue(LeapYear.isLeap(2000));
    }
}