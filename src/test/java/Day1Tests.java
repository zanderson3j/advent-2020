import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Day1Tests {

    @Test
    public void shouldFindProductOfIntegersWhoseSumIs2020() {
        var listOfIntegers = Arrays.asList(34, 8, 1888, 3456, 132);

        var result = Day1.productOfTwoEntriesWhoseSumIs2020(listOfIntegers);

        Assertions.assertEquals(1888 * 132, result);
    }
}

