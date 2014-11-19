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
		return false;
	    }
	}
	return true;
    }
}
