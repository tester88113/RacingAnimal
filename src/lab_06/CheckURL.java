package lab_06;

public class CheckURL {
    public static void main(String[] args) {
        String url = "https://google.com";
        int httpsindex = url.indexOf(":");
        int domainIndex = url.indexOf("//");
        int checkdomain = url.indexOf("com");
        String https= url.substring(0,domainIndex-1);
        String domain= url.substring(domainIndex+2,checkdomain-1);
        String comOrNet= url.substring(checkdomain);
        if(https.equals("https") )
        {
        System.out.println("This is:"+ https);}
        System.out.println("This is domain:"+ domain);
        System.out.println("This is comOrNet:"+ comOrNet);
    }
}
