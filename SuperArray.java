public class SuperArray{
    private int elements;
    private Object[]data;
    public SuperArray(){
	data = new Object[10];
    }
    public SuperArray(int size){
	data = new Object[size];
    }
    public  String toString(){
	String s = "[";
	int i = 0;
	while (i < data.length){
	    s = s + " " + data[i];
	    i = i + 1;
	}
	s = s + "]";
	return s;
    }
    public void add(Object e){
	if (data.length == size()){
	    resize(data.length + 1);
	    data[data.length -1 ] = e;
	}else{
	    int i = 0;
	    while (i < data.length){
		if (data[i].equals("null")){
		    data[i] = e;
		    break;
		}else{
		    i = i + 1;
		}
	    }
	}
    }


    public int size(){
	int c = 0;
	int z = 0;
	while (c < data.length){
	    if (data[c].equals("null")){
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
	    data[h] = "null";
	    h = h + 1;
	}
    }
    public Object get(int index){
	return data[index];
    }
    public void set(int index, Object e){
	data[index] = e;
    }
	
    public static void main(String [] args){
	Integer x = new Integer(5);
	SuperArray L = new SuperArray();
	L.add(x);
	L.add(new Integer(99));
	System.out.println(L);
    }
}
