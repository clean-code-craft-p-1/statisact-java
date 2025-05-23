package statisticker;

import java.util.List;
import java.util.Collections;

public class Statistics {

    public static class Stats {
        public float average;
        public float min;
        public float max;

        public Stats(float average, float min, float max) {
            this.average = average;
            this.min = min;
            this.max = max;
        }
    }

    public static Statistics.Stats getStatistics(List<Float> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return new Stats(Float.NaN, Float.NaN, Float.NaN);
        }

        float sum = 0f;
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;

        for (float num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        float avg = sum / numbers.size();
        return new Stats(avg, min, max);
    }
}

