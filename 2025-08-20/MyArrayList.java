import java.util.Arrays;

public class MyArrayList<T> {
    private T[] data;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        data = (T[]) new Object[INITIAL_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T value) {
        if(size >= data.length) { resize(); }
	  data[size] = value;
	  size++;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
	  	throw new IndexOutOfBoundsException("You tried fetching an invalid index.");
	  }
        return data[index];
    }

    private void resize() {
        System.out.println("...resizing...");
	  T[] newData = (T[]) new Object[data.length * 2];
	  for(int i = 0; i < size; i++) {
	  	newData[i] = data[i];
	  }
	  data = newData;
    }

    public void add(int index, T value) {
        if (index < 0 || index >= size) {
	  	throw new IndexOutOfBoundsException("You tried adding at an invalid index.");
	  }
	  if (size >= data.length) {
	  	resize();
	  }
	  for (int i = size; i > index; i--) {
	  	data[i] = data[i-1];
	  }
	  data[index] = value;
	  size++;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
	  	throw new IndexOutOfBoundsException("You tried adding at an invalid index.");
	  }
	  T removedElement = data[index];
	  for(int i = index; i < size - 1; i++) {
	  	data[i] = data[i+1];
	  }
	  size--;
	  data[size] = null;
	  return removedElement;
    }

    @Override
    public String toString() {
	  if (size == 0) { return "[]"; }
	  String result = "[";
	  for(int i = 0; i < size; i++) {
		if (i+1 == size) {
			result += (data[i] + "]");
		} else {
			result += (data[i] + ", ");
		}
	  }
	  return result;
    }

	public static void main(String[] args) {
        System.out.println("--- Testing MyArrayList ---");
        MyArrayList<String> names = new MyArrayList<>();

        System.out.println("Adding names...");
        names.add("Sam");
        names.add("Anne");
        names.add("Chris");
        System.out.println("Current list: " + names + " (Size: " + names.size() + ")");

        System.out.println("\nGetting element at index 1: " + names.get(1));

        System.out.println("\nAdding 'Cynthia' at index 1...");
        names.add(1, "Cynthia");
        System.out.println("Current list: " + names + " (Size: " + names.size() + ")");

        System.out.println("\nRemoving element at index 2...");
        String removedName = names.remove(2);
        System.out.println("Removed: " + removedName);
        System.out.println("Current list: " + names + " (Size: " + names.size() + ")");

        System.out.println("\n--- Testing Resize ---");
        MyArrayList<Integer> numbers = new MyArrayList<>();
        for (int i = 1; i <= 15; i++) {
            numbers.add(i);
        }
        System.out.println("Final number list: " + numbers + " (Size: " + numbers.size() + ")");
    }
}