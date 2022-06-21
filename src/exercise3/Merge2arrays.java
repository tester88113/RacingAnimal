package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2arrays {
    public static void main(String[] args) {

//        Array 01: {1, 12, 16, 28, 34}
//        Array 02: {1, 13, 16, 27, 99}
//
//        Expected output: {1, 1, 12, 13, 16, 16, 27, 28, 34, 99}
//

        int[] array1 = {1, 12, 16, 28, 34};
        int[] array2 = {1, 13, 16, 27, 99};
        List list = new ArrayList(Arrays.asList(array1));// view list of array 1
        list.add(Arrays.asList(array2));//view list of array 2 and add to list 1
        Object[] array3 = list.toArray();
        System.out.println(Arrays.toString(array3));


    }
}
