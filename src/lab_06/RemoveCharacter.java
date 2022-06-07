package lab_06;

public class RemoveCharacter {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        char [] myCharacters= myStr.toCharArray();
        String number= "";
       for (char character:myCharacters )
       {
           if (Character.isDigit(character)) number+=character;
//           else if
//           (Character.isAlphabetic(character))

       }
        System.out.println("This is string without character: " + number);
    }
}
