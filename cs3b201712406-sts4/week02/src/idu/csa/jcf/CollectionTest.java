package idu.csa.jcf;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
	
	public static void main(String args[]){		   
		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("India");
		listofcountries.add("US");
		listofcountries.add("china");
		listofcountries.add("Denmark");
		listofcountries.set(2, "ComputerSoftware");	
		/*Unsorted List*/
		System.out.println("Before Sorting:");
		for(Object counter: listofcountries){
			System.out.println(counter);
		}
	
		/* Sort statement*/
		Collections.sort(listofcountries);
	
		/* Sorted List*/
		System.out.println("After Ascending Sorting:");
		
		for(Object counter: listofcountries){
			System.out.println(counter);
		}
		
		/* Sort statement*/
		Collections.sort(listofcountries, Collections.reverseOrder());
	
		/* Sorted List*/
		System.out.println("After Descending Sorting:");
		
		for(Object counter: listofcountries){
			System.out.println(counter);
		}
		
	}
}
