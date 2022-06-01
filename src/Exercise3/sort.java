package Exercise3;

import com.sun.org.apache.xpath.internal.objects.XString;

import java.util.Arrays;


public class sort {
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

