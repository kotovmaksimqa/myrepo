package Infrastructure.utils;

public class Util {

    public static int randomFromRange(int min, int max) {

        return min + (int) (Math.random() * ((max - min) +1));
    }
}
