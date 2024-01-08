/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String inputString = args[0];
        System.out.println(lowerCase(inputString));
        //nnn
        //char chchch = 'g';
        //System.out.println((int) chchch);
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String inputString) {
        // Replace the following statement with your code
        String returnString = "";
        int currentChar = 0;
        for (int i = 0; i < inputString.length(); i ++){
            if ((inputString.charAt(i) >= 'A') && (inputString.charAt(i) <= 'Z')){
                currentChar = ((int)inputString.charAt(i));
                returnString += ((char) (currentChar + 32));
            }else{
                returnString += inputString.charAt(i);
            }

        }
        return returnString;
    }
}
