package Infrastructure.utils;

public class StringUtils {
    public static String randomString(String mode, int length) {

        String alphabet;

        switch (mode) {
            case "alpha":
                alphabet = "asdpieruivnuinviusdfvn";
                break;
            case "numeric":
                alphabet = "0123456789";
                break;
            case "alphanumeric":
                alphabet = "0123456789sdaqweqvxchjk";
                break;
            default:
                alphabet = "";
        }

        String result = "";

        for (int i = 0; i < length; i++ ) {

            int index = (int) (Math.random() * alphabet.length());
            result += alphabet.charAt(index);

        }
        return result;
    }
}
