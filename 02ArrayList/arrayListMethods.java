import java.util.Random;
import java.util.*;
public class arrayListMethods{
public static void collapseDuplicats(ArrayList<Integer>L){
int i = 0;
while ( i < L.size() - 1){
if ( L.get(i).equals(L.get(i + 1))){
L.remove(i);
}else{
i = i + 1;
}
}
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
L.set(0, 1);
L.set(1, 1);
L.set(2, 2);
L.set(3, 2);
L.set(4, 2);
L.set(5, 3);
L.set(6, 4);
L.set(7, 5);
L.set(8, 6);
L.set(9, 6);
collapseDuplicats(L);
System.out.println(L);
}
}
