import java.util.*;

class RomanToInteger {
    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCII"));

    }

    public static int romanToInt(String s) {
        char[] ch = s.toCharArray();
        Map<String, Integer> romanLetter = new HashMap<>();
        romanLetter.put("I", 1);
        romanLetter.put("V", 5);
        romanLetter.put("X", 10);
        romanLetter.put("L", 50);
        romanLetter.put("C", 100);
        romanLetter.put("D", 500);
        romanLetter.put("M", 1000);
        int sum = 0;
        Integer[] valueRomanLetter = new Integer[ch.length];
        for (int i = 0; i < ch.length; i++) {
            valueRomanLetter[i] = romanLetter.get(String.valueOf(ch[i]));

        }

        for (int i = 0; i < valueRomanLetter.length; i++) {
            if (i + 1 < valueRomanLetter.length && valueRomanLetter[i] < valueRomanLetter[i + 1]) {
                sum -= valueRomanLetter[i];
            } else {
                sum += valueRomanLetter[i];
            }
        }
        return sum;
    }
}