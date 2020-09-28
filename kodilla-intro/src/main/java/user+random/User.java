public class User {
    private String userName;
    private int userAge;

    public static void main(String[] args) {

        User betty = new User("Betty", 1);
        User mike = new User("Mike", 6);
        User chris = new User("Chris", 2);

        User[] users = {betty, mike, chris};

        System.out.println("Bomble poniżej średniej wieku: ");
        underAverage(users);
        System.out.println("średnia wieku " + averageAge(users));
        System.out.println("liczba bombli " + users.length);
    }

    public User(String userName, int userAge) {
        this.userName = userName;
        this.userAge = userAge;
    }

    public static int sumAges(User[] users) {
        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].userAge;
        }
        return sum;
    }

    public static float averageAge(User[] users) {
        float sum = sumAges(users);
        float average = sum / users.length;
        return average;
    }

    public static void underAverage(User[] users) {
        for (int i = 0; i < users.length; i++) {
            if (users[i].userAge <= averageAge(users)) {
                System.out.println(users[i].userName);
            }
        }
    }
}

