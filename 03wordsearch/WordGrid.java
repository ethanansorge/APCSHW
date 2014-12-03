import java.io.*;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class WordGrid{
    private Random RandomSeed;
    private String [] addedWords;
    private char[][]data;
    private boolean justanswers;
    public WordGrid(){
	this(10,10);
    }

    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	RandomSeed = new Random();
	clear();
    }

    public WordGrid(int rows, int cols, int random){
	this(rows,cols);
	RandomSeed = new Random(random);
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
	if (fillRandomLetters){
	    fillRandom();
	}
	}catch (Exception FileNotFoundException){
	    System.out.println("The file cannot be found :(");
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
	return true;
    }
    public boolean addWord(String word, int row, int col, int x, int y){
	int i = 0;
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
	
	return true;
    }
    public String wordsInPuzzle(){
	return "a";
    }
    public void fillRandom(){
	Random r = new Random();
	int i = 0;
	int c;
	while ( i < data.length){
	    c = 0;
	    while (c < data[0].length){
		if (data[i][c] == ' '){
		    data[i][c] = (char)('a' + r.nextInt(25) + 97);
		}
		c = c + 1;
	    }
	    i = i + 1;
	}
    }
}
