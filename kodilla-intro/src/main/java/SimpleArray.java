public class SimpleArray {
    public static void main(String[] args) {

        String[] animals = new String[5];
        animals[0] = "cat";
        animals[1] = "dog";
        animals[2] = "fish";
        animals[3] = "rat";
        animals[4] = "bird";

        String animal = animals[1];
        System.out.println(animal);

        int numberOfElements = animals.length;
        System.out.println(animals.length);


        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");

    }
}