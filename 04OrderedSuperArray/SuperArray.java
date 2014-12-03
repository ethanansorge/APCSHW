public class SuperArray{
    int size;
    String[] data;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int startCapacity){
	size = 0;
	data = new String[ startCapacity ];
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
    public String toString(){
	String res = "[";
	for(int i = 0; i < size; i++){
	    res += data[i];
	    if(i != size - 1){
		res += " ";
	    }
	}
	return res + "]";
    }

    public void add(String o){
	if(size() == data.length){
	    resize(size * 2);
	}
	data[ size ] = o;
	size++;
    }
    public void add(int index, String o){
	if(index < 0 || index > size() ){
	    throw new IndexOutOfBoundsException();
	}				
	if(size() == data.length){
	    resize( size * 2 );
	}
	for(int i = data.length - 1; i > index; i--){
	    data[i] = data[i - 1];
	}
	data[ index ] = o;
	size++;
    }

    public int size(){
	return size;
    }

    public void clear(){
	size = 0;
    }

    public void resize(int newCapacity){
	String[] newData = new String[newCapacity];
	int max = Math.min(newCapacity,size);
	for(int i = 0; i < max; i++){
	    newData[i]= data[i];
	}
	data = newData;
    }
    public void insertionSort(){
	int i = 1;
	while ( i < data.length){
	    set(i, (set(wherePlace(data[i]), data[i])));
	    i = i + 1;
		       }
	}   	
	public String set(int index, String o){
	    if(index < 0 || index >= size()){
		throw new IndexOutOfBoundsException();
	    }
	    String temp = data[index];
	    data[index]= o;
	    return temp;
	}

	public String get(int index){
	    if(index < 0 || index >= size()){
		throw new IndexOutOfBoundsException();
	    }
	    return data[index];
	}

	public String remove(int index){
	    if(index < 0 || index >= size()){
		throw new IndexOutOfBoundsException();
	}

	String temp = data[index];
	while(index < size() - 1){
	    data[index] = data[index + 1];
	    index++;
	}
	size--;
	if(size < data.length / 4){
	    resize(data.length / 2);
	}
	return temp;
    }
    public void remove(int index, int asd){
	if(index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}

	String temp = data[index];
	while(index < size() - 1){
	    data[index] = data[index + 1];
	    index++;
	}
	size--;
	if(size < data.length / 4){
	    resize(data.length / 2);
	}
    }
    public static void main (String [] args){
	SuperArray a = new SuperArray(4);
	a.add("Charlie");
	a.add("Apple");
	a.add("Zebra");
	a.add("Hat");
	a.insertionSort();
	System.out.println(a);
    }
}
