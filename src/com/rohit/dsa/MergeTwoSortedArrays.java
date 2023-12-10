package com.rohit.dsa;

public class MergeTwoSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p1 = m - 1;
        int p2 = n - 1;

        for (int p = m + n - 1; p >= 0; p--) {
            if (p2 < 0) {
                break;
            }
            if (p1 < 0 || nums1[p1] < nums2[p2]) { // p1 < 0 is for when there is nothing for nums1 array. If there is something then compare the value with nums2 array
                nums1[p] = nums2[p2];
                p2--;
            }
            else {
                nums1[p] = nums1[p1];
                p1--;
            }
        }
    }
}