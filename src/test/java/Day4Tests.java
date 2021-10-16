import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class Day4Tests {

    @Test
    public void shouldReturnNumberOfVaildPassportsInFile() throws IOException {
        var result = Day4.numberOfValidPassportsInFile("passports.txt");

        Assertions.assertEquals(2L, result);
    }
}
