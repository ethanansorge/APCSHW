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
    public void selectionSort(int [] data){
	int i = 0;
	int c, j;
	String lowestValue;
	String temp;
	while (i < data.length){
	    lowestValue = data[i];
	    c = i + 1;
	    j = i;
	    while (c < data.length - 1){
		if (data[c].compareTo(lowestValue) < 0){
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
    public static void main (String [] args){
	int [] c  = {2 , 6, 234, 67, 0, 314, 54 ,3};
	bubbleSort(c);
	System.out.println(c);
    }
}