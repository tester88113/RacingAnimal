package Exercise3;

public class oddEvenNumber {
    private static int t;

    public static void main(String[] intArray)
    {
        int[] intArr = {1, 2, 3, 4, 5};
        int oddNumber = 0;
        int evenNumber = 0;
        for (int t = 0; t < intArr.length; t++)
        {
            if (intArr[t] % 2 == 0)

            {
                evenNumber++;
            } else if (intArr[t] % 2 != 0)
            {
                oddNumber++;
            }
        }
        System.out.printf("total of odd number is: %d", oddNumber);
        System.out.printf("total of even number is: %d", evenNumber);

    }




}
