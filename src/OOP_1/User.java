//package OOP_1;
//
//public class User {
//
//    String nane;
//    String password;
//    String email;
//
//    public User(String nane, String password, String email) {
//        this.nane = nane;
//        this.password = hashPass(password);
//        this.email = email;
//    }
//
//    public String getNane() {
//        return nane;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setNane(String nane) {
//        this.nane = nane;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    private String hashPass(String password) {
//        return password + "_hash";
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "nane='" + nane + '\'' +
//                ", password='" + password + '\'' +
//                ", email='" + email + '\'' +
//                '}';
//    }
//}
