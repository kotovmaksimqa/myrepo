package trycatchlesson;

public class CustomNotFoundException extends Exception {

    CustomNotFoundException (){}

    CustomNotFoundException (String msg) {
        super(msg);
    }

}
