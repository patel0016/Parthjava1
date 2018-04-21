/* Name : Parth Patel
 * course section :18W_CST8110_300 Intro to Computer Programming
 * Lab Teacher :Anissa Shaddy
 * Purpose of the program : Array
 * Assignment number : 4
 * Date : April 20th 2018
 */



import java.util.Scanner;

public class StringArray {

	private int capacity;
	private int size;
	private String[] stringArray;

	public StringArray() {
		capacity = 10;
		stringArray = new String[capacity];
	}

	public StringArray(int input) {
		capacity = input;
		stringArray = new String[capacity];
	}

	// copy constructor is copy of the class.
	public StringArray(StringArray copy) {
		capacity = copy.capacity;
		size = copy.size;
		stringArray = copy.stringArray;
	}

	public void add(String add) {
		if (size == stringArray.length) {
			ensureCapacity(size + 1);
		}
		if (stringArray[size] == null) {
			stringArray[size] = add;
			size++;

		}

	}

	public void add(int index, String userInput) {

		if (size == stringArray.length) {
			ensureCapacity(size + 1);
		}
		if (stringArray[index] == null) {
			stringArray[index] = userInput;
		}
		size++;
	}

	public int capacity() {
		return capacity;
	}

	public void clear() {
		for (int i = 0; i < capacity; i++) {
			stringArray[i] = null;
		}
		size = 0;
	}

	public boolean contains(String a) {

		for (int i = 0; i < capacity; i++) {
			if (stringArray[i] != null && stringArray[i].equals(a)) {

				return true;
			}
		}
		return false;
	}

	public void ensureCapacity(int minCapacity) {
		if (size >= capacity) {
			String[] newArray = new String[minCapacity];

			for (int i = 0; i < capacity; i++) {
				newArray[i] = stringArray[i];
			}
			stringArray = newArray;
			capacity = minCapacity;

		}

	}

	public String get(int position) {

		return stringArray[position];
	}

	public int indexOf(String specific_String) {

		for (int i = 0; i < capacity; i++) {

			if (stringArray[i] != null && stringArray[i].equals(specific_String)) {

				return i;

			}

		}
		return -1;
	}

	public boolean isEmpty() {

		if (size == 0) {

			return true;
		}

		return false;
	}

	//
	public String remove(int remove_position) {
		String a = stringArray[remove_position];
		stringArray[remove_position] = null;
		return a;
	}

	//
	public boolean remove(String s) {

		for (int i = 0; i < capacity; i++) {

			if (stringArray[i].equals(s)) {

				stringArray[i] = null;

				return true;
			}
		}
		return false;
	}

	public String set(int location, String replace) {
		if (size == stringArray.length) {
			ensureCapacity(size + 1);
		}

		String old_String = stringArray[location];

		stringArray[location] = null;

		stringArray[location] = replace;

		return old_String;

	}

	public int size() {

		return size;
	}
}
