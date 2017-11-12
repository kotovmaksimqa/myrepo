package Lesson4;

import java.util.Arrays;

public class Lecture4 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6,};
        System.out.println(sumElements(array));
        char[] ch = {'А', 'B', 'C', 'D', 'F', 'G'};
        System.out.println(Arrays.toString(codeChar(ch)));

    }

    public static int sumElements(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    public static int[] codeChar(char[] ch) {
        int[] array = new int[ch.length];

        for (int i = 0; i < ch.length; i++ ) {
            array[i] = (int)ch[i];
        }
    return array;
    }
}


