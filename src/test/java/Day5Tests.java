import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Day5Tests {

    @Test
    public void shouldFindHighestSeatIdOnBoardingPasses() {
        var listOfBoardingPasses = Arrays.asList(
                "BFFFBBFRRR",
                "FFFBBBFRRR",
                "BBFFBBFRLL"
        );

        var result = Day5.highestSeatIdOnBoardingPass(listOfBoardingPasses);

        Assertions.assertEquals(820, result);
    }
}
