import java.util.Random;
import java.util.*;
public class arrayListMethods{
    public void collapseDuplicats(ArrayList<Integer>L){
        ArrayList<Integer> newList = new ArrayList<Integer>();
	int i = 0;
	while ( i < L.size() - 1){
	    if ( L.get(i) != L.get(i + 1)){
		newList.set(i, L.get(i));
		i = i + 1;
	    }
	}
	L = newList;
    }
    public static void randomize( ArrayList<Integer> L) { 
	int i = 0;
	int x = 0;
	Random r = new Random();
	while (i < L.size()){
	    x = r.nextInt(L.size());
	    L.set(x, L.get(i));
	    L.set(i, x);
	    i = i + 1;
	}
    }
    public static void main(String [] args){
	ArrayList<Integer> L = new ArrayList<Integer>();
	int c = 0;
	while (c < 10){
	    L.add(c);
	    c = c + 1;
	}
	randomize(L);
	System.out.println(L);

    }

}
