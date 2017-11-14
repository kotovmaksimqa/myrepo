package trycatchlesson;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {

    private final String name;
    private final String password;
    private final String email;

    User(UserBuilder userBuilder) {
        this.name = userBuilder.getName();
        this.password = userBuilder.getPassword();
        this.email = userBuilder.getEmail();
    }

    @Override
    public String toString() {
        return "" + name + " " + password + " " + email + "\n";
    }

    public static class UserBuilder {

    private String name;
    private String password;
    private String email;

        public UserBuilder name(final String name) {
            this.name = name;
            return this;
        }

        public UserBuilder password(final String password) {
            this.password = encPass(password);
            return this;
        }

        public UserBuilder email(final String email) {
            this.email = email;
            return this;
        }

        private String encPass(String passwordToHash) {

            String generatedPassword = null;
            try {
                // Create MessageDigest instance for MD5
                MessageDigest md = MessageDigest.getInstance("MD5");
                //Add password bytes to digest
                md.update(passwordToHash.getBytes());
                //Get the hash's bytes
                byte[] bytes = md.digest();
                //This bytes[] has bytes in decimal format;
                //Convert it to hexadecimal format
                StringBuilder sb = new StringBuilder();
                for(int i=0; i< bytes.length ;i++)
                {
                    sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
                }
                //Get complete hashed password in hex format
                generatedPassword = sb.toString();
            }
            catch (NoSuchAlgorithmException e)
            {
                e.printStackTrace();
            }
            return generatedPassword;
        }

        public String getName() {
            return name;
        }

        public String getPassword() {
            return password;
        }

        public String getEmail() {
            return email;
        }

        public User build() {
            return new User(this);
        }
    }
}
