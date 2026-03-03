public class UC5_OOPS_Banner_ArrayJoin {

    public static void main(String[] args) {

        // Array declaration + initialization using String.join() in single statement
        String[] banner = {
                String.join("", "  OOO   ", "  OOO   ", " PPPP   ", " SSSS   "),
                String.join("", " O   O  ", " O   O  ", " P   P  ", " S      "),
                String.join("", " O   O  ", " O   O  ", " P   P  ", " S      "),
                String.join("", " O   O  ", " O   O  ", " PPPP   ", " SSSS   "),
                String.join("", " O   O  ", " O   O  ", " P      ", "     S  "),
                String.join("", " O   O  ", " O   O  ", " P      ", "     S  "),
                String.join("", "  OOO   ", "  OOO   ", " P      ", " SSSS   ")
        };

        // Enhanced for loop to print the banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}