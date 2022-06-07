package exercise3;

import java.util.Arrays;


public class Sort {
    public static void main(String[] list) {

        int[] sortList = {12, 34, 1, 16, 28};
        int tempVariable;
        for (int i = 0; i < sortList.length-1; i++) {
            for (int j = i+1; j < sortList.length; j++) {
                if (sortList[j] < sortList[i]) {
                    tempVariable = sortList[i];
                    sortList[i] = sortList[j];
                    sortList[j] = tempVariable;
                }
            }
        }

        System.out.println(Arrays.toString(sortList));
    }
}

