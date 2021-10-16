import java.util.List;

public class Day5 {

    public static Integer highestSeatIdOnBoardingPass(List<String> boardingPasses) {
        var maxSeatId = boardingPasses.stream()
                .map(BoardingPass::new)
                .map(BoardingPass::getSeatId)
                .max(Integer::compare);

        if (maxSeatId.isPresent()) {
            return maxSeatId.get();
        } else {
            throw new RuntimeException();
        }
    }
}