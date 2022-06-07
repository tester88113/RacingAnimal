package exercise3;

public class MinMaxValue
{
    public static void main(String[] myList)
    {
        int[] intArr = {1, 2, 3, 4, 5};
        int minValue= intArr[0];
        int maxValue= intArr[0];

        for(int i=0;i< intArr.length; i++)
        {
            if (intArr[i]> maxValue)
            { maxValue= intArr[i];}
        }
        for(int i=0;i< intArr.length; i++)
        {
            if (intArr[i]< minValue)
            { minValue= intArr[i];}
        }
        System.out.println("Min value is: "+ minValue);
        System.out.println("Max value is: "+ maxValue);



    }
}
