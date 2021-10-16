import java.util.List;

public class Day2 {

    public static Long countOfValidPasswords(List<String> policiesAndPasswords) {
        return policiesAndPasswords.stream()
                .map(PasswordAndPolicy::new)
                .filter(PasswordAndPolicy::doesPasswordComplyWithPolicy)
                .count();
    }
}


