import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardingPassTests {

    @Test
    public void shouldCalculateRowAndColumnFromPassCodeBFFFBBFRRR() {
        var boardingPass = new BoardingPass("BFFFBBFRRR");

        Assertions.assertEquals(70, boardingPass.getRow());
        Assertions.assertEquals(7, boardingPass.getColumn());
        Assertions.assertEquals(567, boardingPass.getSeatId());
    }

    @Test
    public void shouldCalculateRowAndColumnFromPassCodeFFFBBBFRRR() {
        var boardingPass = new BoardingPass("FFFBBBFRRR");

        Assertions.assertEquals(14, boardingPass.getRow());
        Assertions.assertEquals(7, boardingPass.getColumn());
        Assertions.assertEquals(119, boardingPass.getSeatId());
    }

    @Test
    public void shouldCalculateRowAndColumnFromPassCodeBBFFBBFRLL() {
        var boardingPass = new BoardingPass("BBFFBBFRLL");

        Assertions.assertEquals(102, boardingPass.getRow());
        Assertions.assertEquals(4, boardingPass.getColumn());
        Assertions.assertEquals(820, boardingPass.getSeatId());
    }
}
