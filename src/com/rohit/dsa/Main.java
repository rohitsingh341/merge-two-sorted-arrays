package com.rohit.dsa;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeTwoSortedArrays mergeTwoSortedArrays = new MergeTwoSortedArrays();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        System.out.println(" Merged Array");
        mergeTwoSortedArrays.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}