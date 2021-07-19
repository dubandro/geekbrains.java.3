import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class Lesson6 {

    private static final Logger LOG = LogManager.getLogger(Lesson6.class.getName());

    public static int[] afterLastFour (int[] arr) throws RuntimeException {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 4) return Arrays.copyOfRange(arr, i + 1, arr.length);
        }
        throw new RuntimeException("Array doesn't contain 4!");
    }

    public static boolean oneOrFour(int[] arr) {
        for (int num : arr) {
            if (num == 1 || num == 4) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /**
         * Задача 1
         */
            LOG.trace(Arrays.toString(afterLastFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4, 8, 9, 10})));
            LOG.trace(Arrays.toString(afterLastFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4})));
        try {
            Arrays.toString(afterLastFour(new int[]{1, 2, 3, 0, 5, 6, 7, 0, 8, 9, 10}));
        } catch (RuntimeException e) {
            LOG.error("Exception", e);
        }
        /**
         * Задача 2
         */
        LOG.trace(oneOrFour(new int[]{1, 2, 3, 4, 5, 6, 7, 4, 8, 9, 10}));
        LOG.trace(oneOrFour(new int[]{0, 2, 3, 0, 5, 6, 7, 0, 8, 9, 10}));
    }
}
