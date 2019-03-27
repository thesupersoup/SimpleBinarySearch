/*
 * Author       : Mitch Gentry (https://github.com/thesupersoup), 2019
 * Description  : A simple BinarySearch class that functions with any
 *                generic type implementing the Comparable interface.
 *                Recursively locates the index of the element (nChk).
 */

import java.util.Arrays;

public class BinarySearch_Test {
    public static void main(String[] args) {
        BinarySearch<String> testSearch = new BinarySearch();
        String testEle = "Michael";
        String[] testArr = { "David", "Peter", "Paul", "James",
                            testEle, "Matthew", "Mark", "Luke",
                            "Adam", "Eve", "Abraham", "Issac",
                            "Jacob", "Jonah", "Samuel", "Bartholomew"};

        Arrays.sort(testArr);       // Must presort array for binary search

        int index = testSearch.FindIndex(testArr, testEle);

        System.out.println("Element " + testEle + " located at index " + index);
    }
}
