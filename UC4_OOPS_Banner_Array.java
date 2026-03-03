

public class UC4_OOPS_Banner_Array {

    public static void main(String[] args) {

        // Storing all banner lines inside a String array
        String[] banner = {
                String.join(" ", " ***** ", "  ***** ", " ****** ", "  *****  "),
                String.join(" ", "*     *", " *     *", " *     *", " *     *"),
                String.join(" ", "*     *", " *     *", " *     *", " *      "),
                String.join(" ", "*     *", " *     *", " ****** ", "  *****  "),
                String.join(" ", "*     *", " *     *", " *      ", "       *"),
                String.join(" ", "*     *", " *     *", " *      ", " *     *"),
                String.join(" ", " ***** ", "  ***** ", " *      ", "  *****  ")
        };

        // Using enhanced for-loop to print banner
        for (String line : banner) {
            System.out.println(line);
        }
    }
}