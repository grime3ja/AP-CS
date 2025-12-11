/**  * This class defines the methods that should be completed as a result  
 * * of the Cryptography project.  Note that all method headers must appear  
 * * exactly as they are shown You may choose to add additional methods.  
 *   
 * Note: You should call lettersOnly at the beginning of every method.  
 *
 * @author Jacob Grimes  
 * @version 1.0  
 */ 
public class Crypto {
    /*public static void main(String[] args) {
        //System.out.println(lettersOnly("test"));

        //System.out.println(spaceEveryNChars("test", 1));

        //System.out.println(backwards("test"));

        //System.out.println(caesarShift("abc"));

        //System.out.println(caesarShift("abc", 25));

        //System.out.println(rot13("abc"));

        //System.out.println(randomKey(5));

        //System.out.println(oneTimePadEncrypt("ABC", "XYZ"));

        //System.out.println(oneTimePadDecrypt("XZB", "XYz"));

        //System.out.println(characterAnalysis("test"));
    }*/

    /**
     * Returns a String object that is a copy of cipher with all characters
     * that are not letters removed.  (These include spaces and special
     * characters.)  All letters should be converted to uppercase letters
     * null inputs should return an empty String.
     *
     * @param  plain  the original message
     * @return        the copy of plain with all of the spaces removed
     */
    public static String lettersOnly(String plain) {
        String str = "";
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                if (Character.isLetter(plain.charAt(i))) {
                    str += plain.charAt(i);
                }
            }
        }
        str = str.toUpperCase();
        return str;
    }

     /**
     * Returns a String object that is a copy of plain with a space
     * placed after every n characters.  All original spaces are removed.
     * null inputs should return an empty String.
     * An example of a call to this method is spaceEveryNChars("CAT", 2)
     * this would result in "CA T"
     * 
     * @param  plain  the original message
     * @param  n      the number of characters before a space appears
     * @return        the copy of plain with a space every n characters
     */
    public static String spaceEveryNChars(String plain, int n) {
        String str = "";
        int x = n;
        plain = lettersOnly(plain);
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                if (i == n) {
                    str += " " + plain.charAt(i);
                    n += x;
                }
                else {
                    str += plain.charAt(i);
                    //str = ;
                }
                if (plain.charAt(i) == ' ') {
                    str += plain.substring(i, i + 1);
                }
            }
        }
        return str;
    }

    /**
     * Returns a String object that has written plain backwards.
     * 
     * @param  plain  the original message
     * @return        the message written backwards
     */
    public static String backwards(String plain) {
        plain = lettersOnly(plain);
        String str = "";
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                str = plain.substring(i, i + 1) + str;
            }
        }
        return str;
        //return null;
    }

    /**
     * Returns a String with each character shifted by 3.
     * 
     * @param  plain  the original message
     * @return        the message with each character shifted by 3
     */
    public static String caesarShift(String plain) { 
    	plain = lettersOnly(plain);
        String str = "";
        int shift = 3;
        //String newString = lettersOnly(plain);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char character = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++ ) {
                int index = letters.indexOf(plain.charAt(i));
                int number = index + shift;
                while (number >= 26) {
                	number -= 26;
                }
                character = letters.charAt(number);
                str += character;
                
            }
            return str;
        }
        return "";
    }
    /**
     * Returns a String with each character shifted by n.
     * 
     * @param  plain  the original message
     * @param  shift      the number of characters to shift each char in plain
     * @return        the message with each character shifted by n
     */
    public static String caesarShift(String plain, int shift) {
        //return null;
        plain = lettersOnly(plain);
        String str = "";
        //String newString = lettersOnly(plain);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char character = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++ ) {
                int index = letters.indexOf(plain.charAt(i));
                int number = index + shift;
                while (number >= 26) {
                	number -= 26;
                }
                character = letters.charAt(number);
                str += character;
                
            }
            return str;
        }
        return "";
    }
    /**
     * Returns a String with each character shifted by 13.
     * 
     * @param  plain  the original message
     * @return        the message with each character shifted by 13
     */
    public static String rot13(String plain) {
        //return null;
        plain = lettersOnly(plain);
        String str = "";
        int shift = 13;
        //String newString = lettersOnly(plain);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char character = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++ ) {
                int index = letters.indexOf(plain.charAt(i));
                int number = index + shift;
                while (number >= 26) {
                	number -= 26;
                }
                character = letters.charAt(number);
                str += character;
                
            }
            return str;
        }
        return "";
    }

    /**
     * Returns a String whose letters have been substituted using the alphabet
     * provided by the 26 letter key.
     * 
     * @param  plain  the original message
     * @param  key    the substitution alphabet
     * @return        the message with each character replaced using the  
     *                substitution alphabet
     */
    public static String substitution(String plain, String key)
    {
        plain = lettersOnly(plain);
        //return null;
        String str = "";
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int index = 0;
        if (plain != null) {
            for (int i = 0; i < plain.length(); i++) {
                index = letters.indexOf(plain.charAt(i));
                str += key.charAt(index);
            }
        }
        return str;
    }


    /**
     * Returns a randomly generated key of length n.  Each character of the
     * String is generated by a random calculation.
     * 
     * @param  n  the length of the key to be created
     * @return    the random key
     */
    public static String randomKey(int n)
    {
        //return null;
        String str = "";
        final int lettersInAlphabet = 26;
        for (int i = 0; i < n; i++) {
            str += (char)((Math.random() * lettersInAlphabet) + 'A');
        }
        return str;
    }


    /**
     * Returns a message encrypted using a one time pad.  Each character of
     * the message should be added to the corresponding character in the key to 
     * produce the cipher.  If the key length 
     * does not match the message length, 
     * the String "Cannot be encrypted" is returned.
     * 
     * @param  message the original message
     * @param  key     the String that will be used to encrypt this message
     * @return         the encrypted message
      */
    public static String oneTimePadEncrypt(String message, String key)
    {
        //return null;
        String str = "";
        message = lettersOnly(message);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //int index;
        if ( key.length() != message.length() ) {
            return "Cannot be encrypted";
        }
        if (message != null) {
            for (int i = 0; i < message.length(); i++) {
                int index = letters.indexOf(message.charAt(i))
                		+ letters.indexOf(key.charAt(i)); 
                // adding the index's of the message and key
                if (index > 25) {
                    index -= 26;
                }
                str += letters.charAt(index);
            }
            return str;
        }
        return null;
    }


    /**
     * Returns the decrypted message given the cipher and key.  Each character 
     * of the key should be subtracted from the corresponding character in the 
     * cipher to produce the message.  If the key length does not match the
     * length of the cipher, the String ìCannot be decryptedî is returned.
     *
     * @param  cipher the encrypted message
     * @param  key    the String that will be used to decrypt this message
     * @return        the decrypted message
     */
    public static String oneTimePadDecrypt(String cipher, String key)
    {
        String str = "";
        cipher = lettersOnly(cipher);
        String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        //int index;
        if ( key.length() != cipher.length() ) {
            return "Cannot be encrypted";
        }
        if (cipher != null) {
            for (int i = 0; i < cipher.length(); i++) {
                int index = letters.indexOf(cipher.charAt(i)) - 
                            letters.indexOf(key.charAt(i)); 
                // adding the index's of the message and key
                if (index < 0) {
                    index += 26;
                }
                str += letters.charAt(index);
            }
            return str;
        }
        return null;
    }


    /**
     * Returns a 26 element array with a count of how many times each character
     * in the cipher occurs.  The first slot of the array corresponds to ëAí and
     * the last corresponds to ëZí.
     * 
     * @param  cipher the original message
     * @return        the array with a count of each character
     */
    public static int[] characterAnalysis(String cipher)
    {
        //int[] returnStatement = new int[];
    	cipher = lettersOnly(cipher);
        int[] numbers = new int[26];
        if (cipher != null) {
            for (int i = 0; i < cipher.length(); i++) {
                int slots = cipher.charAt(i) - 'A';
                numbers[slots]++;
            }
        }
        return numbers;
        
        //return returnStatement;
        //return null;
    }
    /**
     * CHALLENGE TASK:
     * Returns a String whose letters have been substituted using the Vigenere
     * cipher.
     * 
     * @param   plain  the original message
     * @param   key    the key that will be used to encrypt the message
     * @return         the encrypted message
     * Use the following method header:
     * public static String vigenere(String plain, String key)
     * 
     * Note: This has been commented out for those who do not want to complete
     * this challenge task.
     */
}