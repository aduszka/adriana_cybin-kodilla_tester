public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkInfo() {
        if (this.name != null) {
            if (this.age > 30 && this.height > 160) {
                System.out.println("User is older than 30 and taller than 160cm.");
           } else {
                System.out.println("User is younger than 30 or shorter than 160cm.");
            }
        } else {
            System.out.println("There is no user.");
        }
    }

    public static void main(String[] args) {
        Application info = new Application( null,28, 158);
        info.checkInfo();

        Application info2 = new Application( " ",28, 158);
        info2.checkInfo();
    }
}
