import java.util.Random;
import java.util.ArrayList;

public class Sorts{
    public static void bubbleSort(int [] data){
	int i = 0;
	int temp;
	int c = data.length;
	while ( c > 0){
	    while (i < c - 1){
		if (data[i] > data[i + 1]){
		    temp = data[i];
		    data[i] = data[i + 1];
		    data[i + 1] = temp;
		}
		i = i + 1;
	    }
	    c = c - 1;
	}
    }
    public static String name(){
	return "Ansorge,Ethan";
    }
    public static int period(){
	return 7;
    }
    public static void selectionSort(int [] data){
	int i = 0;
	int c, j;
	int lowestValue;
	int temp;
	while (i < data.length){
	    lowestValue = data[i];
	    c = i + 1;
	    j = i;
	    while (c < data.length - 1){
		if (data[c] < lowestValue){
		    lowestValue = data[c];
		    j = c;
		}
		c = c + 1;
	    }
	    temp = data[i];
	    data[i] = lowestValue;
	    data[j] = temp;
	    i = i + 1;
	}
    }
    public static void radixSort(int [] c){
	ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
	int i = 0;
	while (i < c.length()){
	    a.add(i, c[0]);
	}
    }
    
    public static void main (String [] args){
	Random r = new Random();
	 int [] c = new int[100000];
	 int i = 0;
	 while (i < c.length){
	     c[i] = r.nextInt(100);
	     i = i + 1;
	 }
	bubbleSort(c);
    }
}