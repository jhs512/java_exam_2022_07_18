package com.ll.exam;

public class Util {
    public static class arr {
        public static void moveLeft(Object[] arr, int fromIndex, int toIndex) {
            for (int i = fromIndex; i <= toIndex; i++) {
                arr[i - 1] = arr[i];
            }
        }

        public static Object[] sizeUp(Object[] arr) {
            Object[] newArr = new Object[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }

            return newArr;
        }
    }
}
