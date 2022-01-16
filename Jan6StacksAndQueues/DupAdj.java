public class DupAdj {
     static String removeAdjDup(String str)
    {
        // base case
        if (str == null || str.length() == 0) {
            return str;
        }
 
        char[] chars = str.toCharArray();
 
        // `k` maintains the index of the next free location in the result,
        // and `i` maintains the current index of the string
        int i, k = 0;
 
        // start from the second character
        for (i = 1; i < chars.length; i++)
        {
            // if the current character is not the same as the
            // previous character, add it to the result
            if (chars[i - 1] != chars[i]) {
                chars[k++] = chars[i - 1];
            }
            else {
                // remove adjacent duplicates
                while (i < chars.length && chars[i - 1] == chars[i]) {
                    i++;
                }
            }
        }
 
        // add the last character to the result
        chars[k++] = chars[i - 1];
 
        // construct a string with the first `k` chars
        String s = new String(chars).substring(0, k);
 
        // start again if any duplicate is removed
        if (k != chars.length) {
            return removeAdjDup(s);          
        }
 
   
        return s;
    }
 
    public static void main(String[] args)
    {
        String str = "DBAABDAB";
 
        System.out.println(removeAdjDup(str));
    }
}