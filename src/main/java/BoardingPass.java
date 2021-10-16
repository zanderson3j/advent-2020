import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardingPass {
    private final String passCode;

    public BoardingPass(String passCode) {
        this.passCode = passCode;
    }

    public Integer getRow() {
        var rowChars = passCode.substring(0, 7).toCharArray();
        return findAxisLocation(127, rowChars, 'F');
    }

    public Integer getColumn() {
        var columnChars = passCode.substring(7).toCharArray();
        return findAxisLocation(7, columnChars, 'L');
    }

    public Integer getSeatId() {
        return this.getRow() * 8 + this.getColumn();
    }

    private Integer findAxisLocation(Integer highestAxisIndex,
                                     char[] characters,
                                     Character lowIndicator) {
        var rows = IntStream.rangeClosed(0, highestAxisIndex)
                .boxed()
                .collect(Collectors.toList());

        for (Character letter : characters) {
            var midpoint = rows.size() / 2;
            if (letter == lowIndicator) {
                rows = rows.subList(0, midpoint);
            } else {
                rows = rows.subList(midpoint, rows.size());
            }
        }

        return rows.get(0);
    }
}
