import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class WordGrid{
    private Random RandomSeed;
    private ArrayList<String> addedWords;
    private char[][]data;
    public WordGrid(){
	this(10,10);
    }

    public WordGrid(int rows, int cols){
	Random r = new Random();
	data = new char[rows][cols];
	setSeed(r.nextInt(100000000));
	clear();
	addedWords = new ArrayList<String>();
    }

    public WordGrid(int rows, int cols, int random){
	this(rows,cols);
	setSeed(random);
    }
    public void setSeed(long seed){
	RandomSeed = new Random(seed);
    }
    public void clear (){
	int i = 0;
	int c;
	while ( i < data.length){
	    c = 0;
	    while (c < data.length){
		data[i][c] = ' ';
		c = c + 1;
	    }
	    i = i + 1;
	}
    }
    
    public String toString(){
	String s = "";
	int i = 0;
	int c;
	while ( i < data.length){
	    c = 0;
	    while (c < data[0].length){
		s = s + data[i][c] + " ";
		c = c + 1;
	    }
	    s = s + "\n";
	    i = i + 1;
	}
	return s;
    }
    public void loadWordsFromFile(String fileName, boolean fillRandomLetters) throws FileNotFoundException{
	ArrayList<String> words = new ArrayList<String>();
	try {
	    File text = new File (fileName);
	    Scanner scnr = new Scanner(text);

	    while(scnr.hasNextLine()){
		String line = scnr.nextLine();
		words.add(line);
	    }
	}catch (Exception FileNotFoundException){
	    System.out.println("The file can't be found :(");
	}
	addAll(words);
	if (fillRandomLetters){
	    fillRandom();
	}else{
	    fillDashes();
	}
	
	
    }

    public boolean addWordHorizontal(String word,int row, int col){
        int i = 0;
	while (i < word.length()){
	    if (data[row][col] == ' ' || data[row][col] == word.charAt(i)){
		data[row][col] = word.charAt(i);
		col = col + 1;
		i = i + 1;
	    }else{
		while (i > 0){
		    data[row][col] = ' ';
		    col = col  -1;
		    i = i - 1;
		}	
		
		return false;
	    }
	}
	addedWords.add(word);
	return true;
    }
    public boolean addWordVertical(String word,int row, int col){
        int i = 0;
	while (i < word.length()){
	    if (data[row][col] == ' ' || data[row][col] == word.charAt(i)){
		data[row][col] = word.charAt(i);
		row = row + 1;
		i = i + 1;
	    }else{
		while (i > 0){
		    data[row][col] = ' ';
		    row = row - 1;
		    i = i - 1;
		}	
		
		return false;
	    }
	}
	addedWords.add(word);
	return true;
    }
    public boolean addWordDiagonal(String word,int row, int col){
        int i = 0;
	while (i < word.length()){
	    if (data[row][col] == ' ' || data[row][col] == word.charAt(i)){
		data[row][col] = word.charAt(i);
		col = col + 1;
		row = row + 1;
		i = i + 1;
	    }else{
		while (i > 0){
		    data[row][col] = ' ';
		    col = col - 1;
		    row = row - 1;
		    i = i - 1;
		}	
		return false;
	    }
	}
	addedWords.add(word);
	return true;
    }
    public boolean addWord(String word, int row, int col, int x, int y){
	int i = 0;
	if ((row > data.length) || (col > data[0].length ||(row + word.length() * x > data.length - 1 || col + word.length() * y> data[0].length - 1))){
	    return false;
	}else{
	    while (i < word.length()){
		if (data[row][col] == ' ' || data[row][col] == word.charAt(i)){
		    data[row][col] = word.charAt(i);
		    col = col + x;
		    row = row + y;
		    i = i + 1;
		}else{
		    while (i > 0){
			data[row][col] = ' ';
			col = col - x;
			row = row - y;
			i = i - 1;
		    }	
		    return false;
		}
	    }
	    addedWords.add(word);
	    return true;
	}
    }
    public ArrayList wordsInPuzzle(){
	return addedWords;
    }
    public void fillRandom(){
	int i = 0;
	int c;
	while ( i < data.length){
	    c = 0;
	    while (c < data[0].length){
		if (data[i][c] == ' '){
		    data[i][c] = (char)(RandomSeed.nextInt(25) + 97);
		}
		c = c + 1;
	    }
	    i = i + 1;
	}
    }
    public void fillDashes(){
	int i = 0;
	int c;
	while ( i < data.length){
	    c = 0;
	    while (c < data[0].length){
		if (data[i][c] == ' '){
		    data[i][c] = '_';
		}
		c = c + 1;
	    }
	    i = i + 1;
	}
    }
    public void addAll(ArrayList<String> words){
	int i = 0;
	while (i < words.size() - 1){
	    addWord(words.get(i), RandomSeed.nextInt(data.length) , RandomSeed.nextInt(data[0].length), RandomSeed.nextInt(3) + -1, RandomSeed.nextInt(3) + -1);
		i = i + 1;
	    }
	}
}
