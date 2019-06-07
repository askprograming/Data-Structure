import java.util.Arrays;

public class arrayIntList {

	
		private int[] elementData;
		private int size;
		
		public static final int DEFAULT_CAPACITY = 100;
		
		public arrayIntList() {
			this(DEFAULT_CAPACITY);
		}

	    // pre------------------>capacity >= 0 (throws IllegalArgumentException if not)
	    // post: --------------->constructs an empty list with the given capacity
	    public arrayIntList(int capacity) {
	        if (capacity < 0) {
	            throw new IllegalArgumentException("capacity: " + capacity);
	        }
	        elementData = new int[capacity];
	        size = 0;
	    }

	    // post: -------------->return current number of elements in the list
	    public int size() {
	        return size;
	    }

	    // pre : ------------->0 <= index < size() (throws IndexOutOfBoundsException if not)
	    // post: ------------->returns the integer at the given index in the list
	    public int get(int index) {
	        checkIndex(index);
	        return elementData[index];
	    }
	    
	    public void checkIndex(int index) {
	        if (index < 0 || index >= size) {
	            throw new IndexOutOfBoundsException("index: " + index);
	        }
	    }
	    
	    // post:------------------> returns true if list is empty, otherwise false
	    public boolean isEmpty() {
	        return size == 0;
	    }
	    
	    //create a bracketed string representation of a list
	    public String toString() {
	    	if(size == 0) {
	    		return "[]";
	    	}else {
	    		
	    		String result = "[" + elementData[0];
	    		for(int i = 1; i < size; i++) {
	    			result += ", " + elementData[i];
	    		}
	    		
	    		result += "]";
	    		
	    		return result;
	    	}
	    }
	    
	   //return the position of the first occurrence of a value 
	    public int indexOf(int value) {
	    	for(int i = 0; i < size; i++) {
	    		if(elementData[i] == value) {
	    			return i;
	    		}
	    	}
			return -1;
	    }
	    
	    //returns true if a value is contained in the list
	    public boolean contains(int value) {
	    	return indexOf(value) >= 0;
	    }
	    
	    //append a value to end of list
	    public void add(int value) {
	    	ensureCapacity(size+ 1);
	    	elementData[size] = value;
	    	size++;
	    }

	    //ensure that the array capacity is sufficient
	    //if not the size will be doubled or more
		private void ensureCapacity(int capacity) {
			if(capacity > elementData.length) {
				int newCap = elementData.length * 2 + 1;
				if(capacity > newCap) {
					newCap = capacity;
				}
				elementData = Arrays.copyOf(elementData,  newCap);
			}
		}
		
		//insert a given value at a given index 
		//and shift value to the right
		public void add(int index, int value) {
			if(index < 0 || index > size) {
				throw new IndexOutOfBoundsException("index" + index);
			}
			ensureCapacity(size + 1);
			for(int i = size; i > index; i--) {
				elementData[size] = elementData[i - 1];
			}
			elementData[index] = value;
			size++;
		}
		
		//remove a value at a specified index
		//and shift values to the left
		public void remove(int index) {
			checkIndex(index);
			for(int i = index; i < size - 1; i++) {
				elementData[i] = elementData[i + 1];
			}
		}

		
		
		//replace the value to new value
		public void set(int index, int value) {
			checkIndex(index);
			elementData[index] = value;
		}
		
		//append all values 
		public void addAll(arrayIntList other) {
			ensureCapacity(size + other.size);
			for(int i = 0; i < other.size; i++) {
				add(other.elementData[i]);
			}
		}
		
	    // post: returns an iterator for this list
	    public ArrayIntListIterator iterator() {
	        return new ArrayIntListIterator(this);
	    }
	    
	  //find all elements and replace them with a different value
	  		public int[] replaceAll(int target, int replacement) {
	  			for(int i = 0; i < size; i++) {
	  				if(elementData[i] == target) {
	  					elementData[i] = replacement;
	  				}
	  			}
	  			return elementData;
	  		}
}