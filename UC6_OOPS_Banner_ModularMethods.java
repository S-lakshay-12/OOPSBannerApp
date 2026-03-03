public class UC6_OOPS_Banner_ModularMethods {

    public static void main(String[] args) {

        String[] o = buildO();
        String[] p = buildP();
        String[] s = buildS();

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // Helper method for letter O
    public static String[] buildO() {
        return new String[]{
                "  OOO  ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                " O   O ",
                "  OOO  "
        };
    }

    // Helper method for letter P
    public static String[] buildP() {
        return new String[]{
                " PPPP  ",
                " P   P ",
                " P   P ",
                " PPPP  ",
                " P     ",
                " P     ",
                " P     "
        };
    }

    // Helper method for letter S
    public static String[] buildS() {
        return new String[]{
                " SSSS  ",
                " S     ",
                " S     ",
                " SSSS  ",
                "     S ",
                "     S ",
                " SSSS  "
        };
    }
}