/**
 * 
 */
package com.coderscampus.arraylist;

/**
 * @author kirkish
 *
 */
public class CustomArrayApplication {

	
	public static void main(String[] args) {
		CustomList<String>names = new CustomArrayList<>();
		
		System.out.println(names.add("1Trevor"));
		System.out.println(names.add("2Michael"));
		System.out.println(names.add("3Christopher"));
		System.out.println(names.add("4Christina"));
		System.out.println(names.add("5Josephina"));
		System.out.println(names.add("6Garbage Monster"));
		System.out.println(names.add("7Mr. Pickles"));
		System.out.println(names.add("8Bart"));
		System.out.println(names.add("90Michelle"));
		System.out.println(names.add("10Trevor"));
		System.out.println(names.add("11Michael"));
		System.out.println(names.add("12Christopher"));
		System.out.println(names.add("13Christina"));
		System.out.println(names.add("14Josephina"));
		System.out.println("Array Size is: " + names.getSize());
		
		for(int i = 0; i < names.getSize(); i++) {
			
			System.out.println(names.get(i));
		}
		
		
	}

}
