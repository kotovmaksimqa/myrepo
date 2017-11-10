package OOP_1;

public class LibApp {

    public static void main(String[] args) {
        Author newAuthor = new Author("Some", "Author");
        Book mybook = new Book("1","2", newAuthor, "5", "5", "6");
        Book mybook1 = new Book("1","2", newAuthor, "4", "5", "6");
        System.out.println(mybook.equals(mybook1));

    }

}
