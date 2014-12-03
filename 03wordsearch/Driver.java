import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Driver{
    public static void main(String[]args) throws FileNotFoundException {
	if (args.length == 2){
	    WordGrid a = new WordGrid(args[0], args[1]);
	    a.loadWordsFromFile("words.txt", true);
	    System.out.println("Find these words: \n" + a.wordsInPuzzle());
	    System.out.println(a);
	}
    }
