/**
 *
 */
package com.corejava.trycatchfinallyexception.examples;

/**
 * @author Nisum
 *
 */
public class NestedTryExp2 {
    public static void main(String args[]) {

        try {

            try {

                try {
                    int arr[] = {1, 2, 3, 4};

                    System.out.println(arr[10]);
                } catch (ArithmeticException e) {
                    System.out.println("Arithmetic Exception");
                    System.out.println(" handled in try-block3");
                }
            } catch (ArithmeticException ae) {
                System.out.println("Arithmetic Exception");
                System.out.println(" handled in try-block2");
            }
        } catch (ArithmeticException ae3) {
            System.out.println("Arithmetic Exception");
            System.out.println(" handled in main try-block");
        } catch (ArrayIndexOutOfBoundsException arre4) {
            System.out.println("ArrayIndexOutOfBoundsException");
            System.out.println(" handled in main try-block");
        } catch (Exception ex5) {
            System.out.println("Exception");
            System.out.println(" handled in main try-block");
        }
    }

}
