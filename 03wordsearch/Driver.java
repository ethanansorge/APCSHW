import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class Driver{
    public static void main(String[]args) throws FileNotFoundException {
	WordGrid a = new WordGrid();
	a.loadWordsFromFile("words.txt", true);
	System.out.println(a);
    }
}
