public class LeapYearMethod {
    public static void main(String[] args) {
        int year = 2024;

        if (leap(year)) {
            System.out.println("przestepny");
        } else {
            System.out.println("nie przestepny");
        }
    }
    private static boolean leap(int year) {
        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
}