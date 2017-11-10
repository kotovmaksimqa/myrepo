package inheritance;

public class Admin extends Moderator {

    public void deleteArticle() {

        System.out.println("Delete Article");

    }
    public void banReader() {
        System.out.println("User has been banned");
    }
}
