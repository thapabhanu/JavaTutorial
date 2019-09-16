package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
	public static void main(String[] args) {
			
			List<String> list = new ArrayList<String>();
			
			list.add("One");
			list.add("Two");
			list.add("Three");
			
			Iterator<String> it = list.iterator();
			while(it.hasNext()){
				System.out.println("Arrayslist data using Iterator ="+it.next());
			}
		}
}
