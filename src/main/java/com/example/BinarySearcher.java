package com.example;

class BinarySearcher {

    public int searchByRecursion(int[] values, int leftIdx, int rightIdx, int target) {
        if (values.length == 0) {
            return -1;
        }
        if (leftIdx > rightIdx) {
            return -1;
        }
        int middleIdx = (leftIdx + rightIdx) / 2;
        if (values[middleIdx] == target) {
            return middleIdx;
        } else if (values[middleIdx] < target) {
            return searchByRecursion(values, middleIdx + 1, rightIdx, target);
        } else if (values[middleIdx] > target) {
            return searchByRecursion(values, leftIdx, middleIdx - 1, target);
        } else {
            // never reach here
            return -1;
        }
    }

    public int searchByIteration(int[] values, int leftIdx, int rightIdx, int target) {
        if (values.length == 0) {
            return -1;
        }
        if (leftIdx > rightIdx) {
            return -1;
        }

        while (leftIdx <= rightIdx) {
            int middleIdx = (leftIdx + rightIdx) / 2;
            if (values[middleIdx] == target) {
                return middleIdx;
            } else if (values[middleIdx] < target) {
                leftIdx = middleIdx + 1;
            } else if (values[middleIdx] > target) {
                rightIdx = middleIdx - 1;
            }
        }
        return -1;
    }
}