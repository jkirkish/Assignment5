package com.coderscampus.arraylist;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int size = 0;
	int arrayLength = 0;

	@Override
	public boolean add(T item) {

		if (arrayLength == items.length)
			items = growArray();
		items[arrayLength] = item;
		arrayLength = arrayLength + 1;

		return true;
	}

	@Override
	public int getSize() {
		size = items.length;
		return size;
	}

	@Override
	public T get(int index) {
		// cast the arraylist you want to return to T
		return (T) items[index];
	}

	public Object[] growArray() {

		Object[] tmp = new Object[getSize() * 2];
		int j = 0;
		while (j < items.length) {
			tmp[j] = items[j];
			j++;
		}
		return tmp;

	}

}
