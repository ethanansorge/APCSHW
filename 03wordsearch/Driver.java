import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Driver{
    public static void main(String[]args) throws FileNotFoundException {
	if (args.length == 2){
	    WordGrid a = new WordGrid(args[0], args[1]);
	    a.loadWordsFromFile("words.txt", false);
	}else{
	    if (args.length == 3){
		if (args[2] == 1 || args[2] == 0){
		    WordGrid a = new WordGrid(args[0], args[1], args[2]);
	    }else{
		WordGrid a = new WordGrid(args[0], args[1], args[2], false);
	    }
	    	WordGrid a = new WordGrid(args[0], args[1], args[2], args[3] );
	}
	    System.out.println("Find these words: \n" + a.wordsInPuzzle());
	    System.out.println(a);
	
    }
    }
}
