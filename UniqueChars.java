/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String inputString = args[0];
        System.out.println(uniqueChars(inputString));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String inputString) {
        String returnString = "";
        returnString += inputString.charAt(0);

        for (int i = 1; i < inputString.length(); i++){
            boolean found = false;
            char currentChar = inputString.charAt(i);
            if (currentChar != 32){
                found = returnString.indexOf(currentChar) > -1;
            }

            if ( !found ) {
                returnString += currentChar;
            }
        }

        return returnString;
    }

}
