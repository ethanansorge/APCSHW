public class arrayList{
    public void collapseDuplicats(ArrayList<Integer>L){
	arrayList<Integer> newList = new ArrayList<Integer>();
	int i = 0;
	while ( i < L.length - 1){
	    if ( L[i] != L[i + 1]){
		newList[i] = L[i];
	    }else{
	    }
	    i = i + 1;
	}
	return newList;
    }
}
