package trycatchlesson2;

import java.util.Arrays;

public class ExceptionProgramm {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(exceptionTry(new String[] {"1", "2", "3"})));
//        System.out.println();
//        System.out.println(Arrays.toString(exceptionTry(new String[] {"asdasd", "asdasdasd", "3"})));
//        System.out.println();
//        System.out.println(Arrays.toString(exceptionTry(new String[] {})));
//        System.out.println();
//        System.out.println(Arrays.toString(exceptionTry(new String[] {"1", "2"})));
}

    public static int[] exceptionTry(String testArr[]) {
        int resultArr[] = new int[3];
        int count = 0;
        try {
            if (testArr.length != 3) {
                throw new ArrayIndexOutOfBoundsException();
            }
            for (String s : testArr) {
                resultArr[count] = Integer.valueOf(s);
                count++;
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Not a number");
        }

         catch (NullPointerException e) {
             System.out.println("Array mustn't be null");
         }

         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array < " + resultArr.length);
        }

        finally {
            System.out.println("Thanks for using our shit");
        }

        return resultArr;


    }

}
