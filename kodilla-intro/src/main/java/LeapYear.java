public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;

        System.out.println(year);
            if
            (year % 400 == 0)
                System.out.println("przestępny");
            else if
            (year % 4 == 0 && year % 100 != 0)
                System.out.println("przestępny");

            else
            System.out.println("nie przestępny");
    }
}