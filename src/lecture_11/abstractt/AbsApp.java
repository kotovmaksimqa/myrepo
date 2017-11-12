package lecture_11.abstractt;

public class AbsApp {
    public static void main(String[] args) {
        Phone mobilePhone = new MobilePhone();
        mobilePhone.call();
        mobilePhone.ring();

        mobilePhone = new OfficePhone();

        mobilePhone.call();
    }
}
