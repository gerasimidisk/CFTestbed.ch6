package gr.aueb.cf.ch6;

/**
 * Demonstrates search for an
 * element of an array with specific
 * value.
 */
public class ArraySearchApp {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        final int SECRET = 5;
        boolean secretWasFound = false;

    /*    for (int i = 0; i < arr.length; i++) {
            if (arr[i] == SECRET) {
                secretWasFound = true;
                break;
            }
        }*/

        for (int num : arr) {
            if (num == SECRET) {
                secretWasFound = true;
                break;
            }
        }

 /*       if (secretWasFound) {
            System.out.println("Secret was found");
        } else {
            System.out.println("Secret was not found");
        }*/

        System.out.printf("Secret was%sfound", secretWasFound ? " " : " not ");
    }
}
