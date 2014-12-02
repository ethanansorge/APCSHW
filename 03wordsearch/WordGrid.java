import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;
public class WordGrid{
    private char[][]data;
    public WordGrid(){
	this(10,10);
    }
   
    public WordGrid(int rows, int cols){
	data = new char[rows][cols];
	clear();
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
	    while (c < data.length){
		s = s + data[i][c] + " ";
		c = c + 1;
	    }
	    i = i + 1;
	}
	return s;
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
    public static void main (String [] args) throws FileNotFoundException {
	ArrayList<String> words = new ArrayList<String>();
	File text = new File ("words.txt");
	Scanner scnr = new Scanner(text);
	int lineNumber = 1;
	while(scnr.hasNextLine()){
	    String line = scnr.nextLine();
	    words.add(line);
	}
	WordGrid a = new WordGrid();
	int i = 0;
	while ( i < words.size()){
	    Random rand = new Random();
	    a.addWord(words.get(i),rand.nextInt(10), rand.nextInt(10), rand.nextInt(2) + 1,rand.nextInt(2) + 1);
	    i = i + 1;
	}
	System.out.println(a);
    }
}
