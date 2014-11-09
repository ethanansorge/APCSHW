public class SuperArray{
    private int elements;
    private Object[]data;
    public SuperArray(){
	data = new Object[10];
    }
    public SuperArray(int size){
	data = new Object[size];
    }
    public static void main(String [] args){
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	System.out.println(L);
    }
    public String toString(){
	String s = "[";
	int i = 0;
	while (i < data.length){
	    s = s + " " + data[i];
	    i = i + 1;
	}
	s = s + "]";
	return s;
    }
    public boolean inRange(int value){
	if (value < data.length){
	    return true;
	}
	return false;
    }
    public void add(Object e){
	if (data.length == size()){
	    resize(data.length + 1);
	    data[data.length -1 ] = e;
	}else{
	    int i = 0;
	    while (i < data.length){
		if (data[i] == (null)){
		    data[i] = e;
		    break;
		}else{
		    i = i + 1;
		}
	    }
	}
    }
    public void add(int index, Object o){
	int n = 0;
	if (data.length == size()){
	    resize(data.length + 1);
	}
	Object[]tempData = new Object[data.length];
	while (n < index){
	    tempData[n] = data[n];
	    n = n + 1;
	}
	tempData[n] = o;
	while (n < data.length){
	    tempData[n + 1] = data[n];
	    n = n + 1;
	}
	data = tempData;
    }


    public int size(){
	int c = 0;
	int z = 0;
	while (c < data.length){
	    if (data[c] == (null)){
	    }else{
		z = z + 1;
	    }
	    c = c + 1;
	}
	return z;
    }
    public void resize(int newCapacity){
	Object[]newData = new Object[newCapacity];
	int i = 0;
	while (i < data.length){
	    newData[i] = data[i];
	    i = i + 1;
	}
	data = newData;
    }
    public void clear(){
	int h = 0;
	while (h < data.length - 1){
	    data[h] = null;
	    h = h + 1;
	}
    }
    public Object get(int index){
	if (inRange(index)){
	    return data[index];
	}
	System.out.println("ERROR, INDEX IS OUT OF RANGE");
	return null;
    }
    public Object set(int index, Object e){
	Object g = data[index];
	if (inRange(index)){
	    data[index] = e;
	    return g;
	}
	System.out.println("ERROR, INDEX IS OUT OF RANGE");
	    return null;
    }
    public Object remove(int index){
	Object g = data[index];
	if (inRange(index)){
	    data[index] = null;
	    return g;
	}
	System.out.println("ERROR, INDEX IS OUT OF RANGE");
	    return null;
    }
   
}
