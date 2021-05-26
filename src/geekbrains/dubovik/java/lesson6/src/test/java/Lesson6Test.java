import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Lesson6Test {

    @Test
    void afterLastFour() {
        Assertions.assertThrows(RuntimeException.class, () -> Lesson6.afterLastFour(new int[]{1, 2, 3}));
        Assertions.assertArrayEquals(new int[]{8, 9, 10}, Lesson6.afterLastFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4, 8, 9, 10}));
    }

    @Test
    @Disabled
    void afterLastFourFailed() {
        Assertions.assertArrayEquals(new int[]{7, 9, 10}, Lesson6.afterLastFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4, 8, 9, 10}));
    }

    @ParameterizedTest
    @MethodSource("dataForAfterLastFourMass")
     void afterLastFourMass(int[] array, int[] result) {
        Assertions.assertArrayEquals(result, Lesson6.afterLastFour(array));
    }

    public static Stream<Arguments> dataForAfterLastFourMass() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 1, 4, 2, 2, 4, 3}, new int[]{3}));
//        out.add(Arguments.arguments(new int[]{1, 4, 2, 2, 4, 3, 5}, new int[]{3, 3})); //fail
        out.add(Arguments.arguments(new int[]{4, 1, 2, 4, 3, 5, 6}, new int[]{3, 5, 6}));
        return out.stream();
    }

        @Test
    void oneOrFour() {
        Assertions.assertTrue(Lesson6.oneOrFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4, 8, 9, 10}));
        Assertions.assertFalse(Lesson6.oneOrFour(new int[]{0, 2, 3, 0, 5, 6, 7, 0, 8, 9, 10}));
    }
}