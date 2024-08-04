import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    public static void main(String[] args) {

    }

    public static List<String> letterCombinations(String digits) {
        Map<String, List<String>> button = new HashMap<>();

        button.put("2", Arrays.asList("a", "b", "c"));
        button.put("3", Arrays.asList("d", "e", "f"));
        button.put("4", Arrays.asList("g", "h", "i"));
        button.put("5", Arrays.asList("j", "k", "l"));
        button.put("6", Arrays.asList("m", "n", "o"));
        button.put("7", Arrays.asList("p", "q", "r", "s"));
        button.put("8", Arrays.asList("t", "u", "v"));
        button.put("9", Arrays.asList("w", "x", "y", "z"));
        button.put("0", Arrays.asList(" "));
        button.put("*", Arrays.asList("+"));
        button.put("#", Arrays.asList("->"));

        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            System.out.println(result);
            return;
        }

    }
}
