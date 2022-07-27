package com.company;

public class Main {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.readIntArrayFromConsole();
        print(solution(arr));
    }

    public static int[] solution(int[] arr) {
        int[] minsOfArr = new int[4];
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int indexOfMin = 0, indexOfSecondMin =0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                indexOfSecondMin = indexOfMin;
                min = arr[i];
                indexOfMin = i;
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
                indexOfSecondMin = i;
            }
        }
        minsOfArr[0] = min;
        minsOfArr[1] = secondMin;
        minsOfArr[2] = indexOfMin;
        minsOfArr[3] = indexOfSecondMin;
        return minsOfArr;
    }

    public static void print(int[] arr) {
        if (arr[1] != Integer.MAX_VALUE) {
            System.out.println("Второй от минимального элемент в массиве это: " + arr[1]+". Его позиция - " + arr[3]);
        } else {
            System.out.println("Второго от минимального элемента в массиве нету");
        }
        System.out.println("Минимальный элемент в массиве это: " + arr[0]+". Его позиция - "+arr[2]);
    }
}
