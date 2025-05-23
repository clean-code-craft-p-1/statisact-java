package statisticker;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class StatisticsTest {

    @Test
    public void reportsAverageMinMaxx() {
        Float[] numbers = {1.5f, 8.9f, 3.2f, 4.5f};
        List<Float> numberList = Arrays.asList(numbers);

        Statistics.Stats s = Statistics.getStatistics(numberList);

        float epsilon = 0.001f;
        assertEquals(4.525f, s.average, epsilon);
        assertEquals(1.5f, s.min, epsilon);
        assertEquals(8.9f, s.max, epsilon);
    }

    @Test
    public void reportsNaNForEmptyInput() {
        List<Float> emptyList = new ArrayList<Float>();

        Statistics.Stats s = Statistics.getStatistics(emptyList);

        assertTrue(Float.isNaN(s.average));
        assertTrue(Float.isNaN(s.min));
        assertTrue(Float.isNaN(s.max));
    }
}
