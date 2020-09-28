import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {
        Colors colours = new Colors();
        String result = colours.getUserColor();
        System.out.println("Result: " + result);
    }

    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select color A-C: ");
            String allColors = scanner.nextLine().trim().toUpperCase();
            switch (allColors) {
                case "A":
                    return "akwamaryna";
                case "B":
                    return "biały";
                case "C":
                    return "czarny";
                default:
                    System.out.println("no color in system. Try again.");
            }
        }
    }
}