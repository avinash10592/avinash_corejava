/**
 *
 */
package com.corejava.garbagecollection.example;

/**
 * @author Nisum
 *
 */
public class TestGarbage {

    public void finalize() {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        @SuppressWarnings("unused")
        TestGarbage s1 = new TestGarbage();
        @SuppressWarnings("unused")
        TestGarbage s2 = new TestGarbage();
        s1 = null;
        s2 = null;
        System.gc();

    }

}
