

public class UC3_OOPS_Banner_Join {

    public static void main(String[] args) {

        printLine1();
        printLine2();
        printLine3();
        printLine4();
        printLine5();
        printLine6();
        printLine7();
    }

    public static void printLine1() {
        System.out.println(String.join(" ",
                " ***** ",
                "  ***** ",
                " ****** ",
                "  *****  "));
    }

    public static void printLine2() {
        System.out.println(String.join(" ",
                "*     *",
                " *     *",
                " *     *",
                " *     *"));
    }

    public static void printLine3() {
        System.out.println(String.join(" ",
                "*     *",
                " *     *",
                " *     *",
                " *      "));
    }

    public static void printLine4() {
        System.out.println(String.join(" ",
                "*     *",
                " *     *",
                " ****** ",
                "  *****  "));
    }

    public static void printLine5() {
        System.out.println(String.join(" ",
                "*     *",
                " *     *",
                " *      ",
                "       *"));
    }

    public static void printLine6() {
        System.out.println(String.join(" ",
                "*     *",
                " *     *",
                " *      ",
                " *     *"));
    }

    public static void printLine7() {
        System.out.println(String.join(" ",
                " ***** ",
                "  ***** ",
                " *      ",
                "  *****  "));
    }
}