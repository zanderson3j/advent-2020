import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class Day2Tests {

    @Test
    public void shouldReturnCountOfValidPasswords() {
        var listOfPoliciesAndPasswords = Arrays.asList(
                "1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc"
        );

        var result = Day2.countOfValidPasswords(listOfPoliciesAndPasswords);

        Assertions.assertEquals(2L, result);
    }
}
