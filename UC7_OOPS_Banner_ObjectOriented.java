public class UC7_OOPS_Banner_ObjectOriented {

    public static void main(String[] args) {

        // Create Character Objects
        CharacterPatternMap o = new CharacterPatternMap('O', new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        });


        CharacterPatternMap p = new CharacterPatternMap('P', new String[]{
                " PPPP  ",
                " P   P ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     ",
                " P     "
        });

        CharacterPatternMap s = new CharacterPatternMap('S', new String[]{
                " SSSS  ",
                " S     ",
                " S     ",
                " SSSS  ",
                "     S ",
                "     S ",
                " SSSS  "
        });

        // IMPORTANT: Two O's here to print OOPS
        CharacterPatternMap[] word = {o, o, p, s};

        // Print Banner
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (CharacterPatternMap character : word) {
                line.append(character.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }

    // Static Inner Class
    static class CharacterPatternMap {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }
}