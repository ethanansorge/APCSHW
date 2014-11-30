public class WordGrid{
    private char[][]data;
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
    public static void main (String [] args){
	WordGrid a = new WordGrid(10, 10);
	a.addWord("Ethan", 0, 0, 0, 1);
	a.addWord("Julias", 8, 0, 1, 0);
	a.addWord("Bob", 5, 6, -1, 0);
	System.out.println(a);
    }
}
