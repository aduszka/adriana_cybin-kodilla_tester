public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap");
        } else if (this.price > 1000) {
            System.out.println("The price is quite expensive");
        } else {
            System.out.println("This notebook is good");
        }
    }

    public void checkWeight() {
        if (this.weight < 750) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1750) {
            System.out.println("The price is very heavy");
        } else {
            System.out.println("This notebook is not so heavy");
        }
    }

    public void checkYear() {
        if (this.year >= 2020 && this.price <= 1000) {
            System.out.println("This notebook is quite new and in a good price");
        } else if (this.year <= 2010 && this.price >= 1500 ) {
            System.out.println("This notebook is not so old but expensive");
        } else {
            System.out.println("This notebook is old and cheap");
        }
    }
}
