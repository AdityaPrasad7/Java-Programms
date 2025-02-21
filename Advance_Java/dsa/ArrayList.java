package dsa;

import java.util.Arrays;

public class ArrayList {

	public static void main(String[] args) {
		// Creates an instance of ArrayList1 with an initial capacity of 4
		ArrayList1 l = new ArrayList1();
		
		// Adding elements to the ArrayList1 instance
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.remove(3);
		
		// Iterates through the elements in the list and prints each one
		for(int i = 0; i < l.size(); i++) {
			// Retrieves each element as an Integer, casts it, and stores it in `n`
			int n = (Integer)l.get(i);
			System.out.println(n); // Prints the element
		}
	}
}

class ArrayList1 {
	private Object[] a; // Array to store elements of any type, using Object to allow multiple types
	private int pos;    // Tracks the current number of elements in the list

	// Default constructor: initializes the array with a default size of 4
	public ArrayList1() {
		a = new Object[4]; // Creates an array `a` with 4 slots
	}

	// Constructor with parameter: initializes the array with a specified initial size
	public ArrayList1(int initialSize) {
		a = new Object[initialSize]; // Creates an array `a` with `initialSize` slots
	}

	// Adds an element to the list
	public void add(Object e) {
		// Checks if the array is full (if pos is equal to or greater than the array length)
		if (pos >= a.length) 
			increase(); // Calls the `increase` method to resize the array if full
		
		// Adds the element `e` at the current position `pos` and then increments `pos`
		a[pos++] = e;
	}

	// Returns the current size of the list (number of elements added)
	public int size() {
		return pos; // `pos` reflects the number of elements in the array
	}

	// Retrieves the element at the specified index
	public Object get(int index) {
		// Checks if the index is within bounds (index must be >= 0 and < size of list)
		if (index < 0 || index >= size()) {
			throw new IndexOutOfBoundsException(); // Throws exception if index is out of range
		}
		return a[index]; // Returns the element at the specified index
	}

	// Increases the size of the array when it reaches capacity
	public void increase() {
		// Creates a new array `temp` with 3 additional slots than the current array
		Object[] temp = new Object[a.length + 3];

		// Copies elements from the old array `a` to the new array `temp`
		for (int i = 0; i < a.length; i++) {
			temp[i] = a[i];
		}
		// Reassigns `a` to the new array `temp` (now `a` has increased capacity)
		a = temp;
	}
	public Object remove(int index) {
		// Check if the index is within the valid range (index >= 0 and index < size).
		// If not, throw an IndexOutOfBoundsException to indicate an invalid index.
		if (index <= -1 || index >= size()) {
			throw new IndexOutOfBoundsException();
		}

		// Shift elements to the left to overwrite the element at the specified index.
		// Start from the element just after `index` and move each element one position back.
		for (int i = index + 1; i < size(); i++) {
			a[i - 1] = a[i]; // Move element at `i` to the position `i-1`
		}

		// Decrement `pos` to reflect the removal of one element from the list.
		// Set the last element (now redundant) to `null` to avoid memory leaks.
		return a[--pos] = null;
	}

}
