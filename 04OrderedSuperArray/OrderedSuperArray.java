public class OrderedSuperArray extends SuperArray{
    public void add(int index,String element){
	add(element);
    }
    public void add(String o){
	if(size() == data.length){
	    resize(size * 2);
	}
	super.add(wherePlace(o), o);
    }
    public int wherePlace(String o){
	int i = 0;
	while (i < data.length){
	    if (data[i].compareTo(o) > 0){
		return i;
	    }
	    i = i + 1;
	}
	return data.length;
    }
}
