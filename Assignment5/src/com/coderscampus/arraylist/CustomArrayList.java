package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int itemCounter = 0;

	@Override
	public boolean add(T item) {

		if (itemCounter == items.length)
			items = growArray();
		items[itemCounter++] = item;

		return true;
	}

	@Override
	public int getSize() {
		
		return itemCounter;
	}

	@Override
	public T get(int index) {
		// cast the arraylist you want to return to T
		return (T) items[index];
	}

	private Object[] growArray() {

		Object[] backingArray = new Object[items.length * 2];
		System.out.println("BackingArrayLength: " + backingArray.length);
		int counter = 0;
		while (counter < items.length) {
			backingArray[counter] = items[counter];
			counter++;
		}
		return backingArray;

	}

}
