public class FirstClass {
    public static void main(String[] args) {

            Notebook notebook = new Notebook(600, 1000, 2020);
            System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year);
            notebook.checkPrice();
            notebook.checkWeight();
            notebook.checkYear();

            Notebook heavynotebook = new Notebook(2000, 1500, 2010);
            System.out.println(heavynotebook.weight + "g " + heavynotebook.price + " " + heavynotebook.year);
            heavynotebook.checkPrice();
            heavynotebook.checkWeight();
            heavynotebook.checkYear();

            Notebook oldnotebook = new Notebook(1200, 500, 2000);
            System.out.println(oldnotebook.weight + "g " + oldnotebook.price + " " + oldnotebook.year);
            oldnotebook.checkPrice();
            oldnotebook.checkWeight();
            oldnotebook.checkYear();
    }
}