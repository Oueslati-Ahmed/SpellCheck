package textEditor.core.structures;
/**
 * @author Oueslati Ahmed
 */
@SuppressWarnings("unchecked")
public class MyList<E>{

	int DEFAULT_SIZE = 100;
	private E[] array;
	private int size;
	
	public boolean isEmpty(){
		return false;
	}
	
	public int size(){
		return size;
	}
	
	public MyList(){
		array = (E[]) new Object[DEFAULT_SIZE];
		size = 0;
	}
	
	public MyList(int s){
		array = (E[]) new Object[s];
		size = 0;
	}
	
	
	public boolean addLast(E s){
		if (size==array.length){
			E[] a = (E[]) new Object[size*2];
			for(int i=0; i<size-1; i++)
				a[i] = array[i];
			array = a;
			a = null;
		}
		array[size] = s;
		size++;
		return true;
	}
	
	
	public boolean binarySearch(E k, int low, int high) {

		if (high>=low) {
			int mid = (low+high) / 2;
			int comparison = ((String) array[mid]).compareTo((String) k);

	        if (comparison==0) {
	    		return true;
			}
			
	        if(comparison >0)
				return binarySearch(k, low, mid-1);

			return binarySearch(k, mid+1, high);

			
		}	
		return false;
			
	}


	
	public boolean contains(E p){
		
		return binarySearch(p, 0, size);		
	}
	
}
