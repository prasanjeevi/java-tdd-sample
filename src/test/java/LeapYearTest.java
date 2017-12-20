import com.company.samples.LeapYear;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LeapYearTest {

    @Test
    public void leapYearsAreDivisibleByFour() {
        assertTrue(LeapYear.isLeap(2018));
    }
}