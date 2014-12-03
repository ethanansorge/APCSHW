import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Driver{
    public static void main(String[]args) throws FileNotFoundException {
	if (args.length == 2){
	    WordGrid a = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	    a.loadWordsFromFile("words.txt", true);
	    System.out.println("Find these words: \n" + a.wordsInPuzzle());
	    System.out.println(a);
	}else{
	    if (args.length == 3){
		if (Integer.parseInt(args[2]) == 1 || Integer.parseInt(args[2]) == 0){
		    WordGrid a = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		    a.loadWordsFromFile("words.txt", true);
		    System.out.println("Find these words: \n" + a.wordsInPuzzle());
		    System.out.println(a);
		}else{
		    WordGrid a = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		    a.loadWordsFromFile("words.txt", true);
		    System.out.println("Find these words: \n" + a.wordsInPuzzle());
		    System.out.println(a);
		}
	    }else{
		WordGrid a = new WordGrid(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));
		if (Integer.parseInt(args[3]) == 1){
			a.loadWordsFromFile("words.txt", false);
		    }else{
			a.loadWordsFromFile("words.txt", true);
			System.out.println("Find these words: \n" + a.wordsInPuzzle());
		    }
			System.out.println(a);
		    }
		    }
	    }
	}
