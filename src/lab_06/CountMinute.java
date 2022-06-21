package lab_06;

public class CountMinute {
    public static void main(String[] args) {
        String total = "2hrs and 5 minutes";
        int indexHour = total.indexOf("hrs and ");
        int indexNumber = total.indexOf("5");
        int indexMinute = total.indexOf("m");
        int hour = Integer.parseInt(total.substring(0, indexHour));
        int min = Integer.parseInt((total.substring(indexNumber, indexMinute)).trim());
        String totalMinute = String.valueOf(hour * 60 + min);
        System.out.println(totalMinute);


    }
}
