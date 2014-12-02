import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Driver{
    public static void main(String[]args) throws FileNotFoundException {
	WordGrid a = new WordGrid();
	ArrayList<String> words = new ArrayList<String>();
	File text = new File ("words.txt");
	Scanner scnr = new Scanner(text);
	int lineNumber = 1;
	while(scnr.hasNextLine()){
	    String line = scnr.nextLine();
	    words.add(line);
	}
	int i = 0;
	while ( i < words.size()){
	    Random rand = new Random();
	    a.addWord(words.get(i),0,0,0,1);
	    i = i + 1;
	}
	System.out.println(a);
    }
}
