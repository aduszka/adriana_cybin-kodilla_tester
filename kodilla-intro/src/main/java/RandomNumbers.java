import java.util.Random;

public class RandomNumbers {
    int r;
    int n;

    public static void main(String[] args) {
        sumRandom();
    }

    public static int random() {
        int r;
        Random random = new Random();
        r = random.nextInt(31);
        return r;
    }

    public static void sumRandom() {
        int sum = 0;
        int n = 0;
        int min = 0;
        int max = 0;
        while (sum <= 5000) {
            int r = random();
            sum = sum + r;
            n++;
            System.out.println(r + " suma " + sum + " liczba " + n);
            if(min >= r) {
                min = r;
            }
            else if(max <= r) {
                max = r;
            }
        }
        System.out.println("max " + max + " min " + min);
    }

}