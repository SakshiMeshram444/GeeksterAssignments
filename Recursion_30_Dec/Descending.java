package Recursion_30_Dec;

public class Descending {
    static final int MAX_CHAR = 26;
	
	public static void main(String[] args) {

		sortString("geeksterisbestplatform");
		
	}

	static void sortString(String str) {
		 
        int letters[] = new int[MAX_CHAR];
 
        for (char x : str.toCharArray()) {
            letters[x - 'a']++;
        }
 
        for (int i = 0; i < MAX_CHAR; i++) {
            for (int j = 0; j < letters[i]; j++) {
                System.out.print((char) (i + 'a'));
            }
        }
	}

}

