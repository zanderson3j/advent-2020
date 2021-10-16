import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class Day1Tests {

    @Test
    public void shouldFindProductOfIntegersWhoseSumIs2020() {
        List<Integer> listOfIntegers = Arrays.asList(34, 8, 1888, 3456, 132);

        Integer result = Day1.productOfTwoEntriesWhoseSumIs2020(listOfIntegers);

        Assertions.assertEquals(1888 * 132, result);
    }
}
