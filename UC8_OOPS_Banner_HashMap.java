import java.util.HashMap;
import java.util.Map;

public class UC8_OOPS_Banner_HashMap {

    public static void main(String[] args) {

        // Step 1: Create HashMap to store character patterns
        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        });

        patternMap.put('P', new String[]{
                " PPPP  ",
                " P   P ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     ",
                " P     "
        });

        patternMap.put('S', new String[]{
                " SSSS  ",
                " S     ",
                " S     ",
                " SSSS  ",
                "     S ",
                "     S ",
                " SSSS  "
        });

        // Step 2: Define the word
        String word = "OOPS";

        // Step 3: Print banner using nested loops
        for (int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);

                if (patternMap.containsKey(ch)) {
                    line.append(patternMap.get(ch)[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}