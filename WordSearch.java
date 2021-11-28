import java.util.Scanner;
public class WordSearch {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String str = "";
	System.out.println("Enter the sentence");
	str = sc.nextLine();
	String search = "";
	System.out.println("Enter the word to be searched : ");
	search = sc.nextLine();
	int idx = str.indexOf(search);
	if(idx == -1)
		System.out.println("Word not found");
	else
		System.out.println("Word to be found at index "+idx);
}

}
