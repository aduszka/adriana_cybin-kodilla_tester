public class Book {
    private String author;
    private String title;

    public static Book of(String author, String title) {
        Book book = new Book();
        book.author = author;
        book.title = title;
        return book;
    }
    String getAuthor(){ return author; }
    String getTitle(){ return title; }

    public String toString(){
        return "Author: " + author + " Title: " + title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov","The Galaxy");
    }
}