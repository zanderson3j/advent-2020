public class PasswordAndPolicy {
    private final Integer minCount;
    private final Integer maxCount;
    private final Character letter;
    private final String password;


    public PasswordAndPolicy(String policyAndPassword) {
        var splitPolicyAndPassword = policyAndPassword.split(" ");
        var counts = splitPolicyAndPassword[0].split("-");
        var letter = splitPolicyAndPassword[1].split(":")[0];

        this.minCount = Integer.parseInt(counts[0]);
        this.maxCount = Integer.parseInt(counts[1]);
        this.letter = letter.charAt(0);
        this.password = splitPolicyAndPassword[2];
    }

    public Boolean doesPasswordComplyWithPolicy() {
        var countOfLetterInPassword = countOfLetterInWord(this.letter, this.password);

        return countOfLetterInPassword >= this.minCount && countOfLetterInPassword <= this.maxCount;
    }

    private Long countOfLetterInWord(Character letter, String word) {
        return word.chars()
                .filter(it -> it == letter)
                .count();
    }
}