package org.Collections;

import java.util.LinkedList;
import java.util.List;

public class Collections {


	public static void main(String[] args) {

		List<String> li=new LinkedList<>();
		li.add("Ramann");
		li.add("R");
		li.add("A");
		li.add("M");
		li.add("A");
		li.add("N");
		li.add("N");

		//1. to find the index value (without index)

		li.size();
		System.out.println(li);
		//2. Iterate the 5 values

		for (String string : li) {

			for (int i = 0; i < 5; i++) {
				System.out.println(string);
			}
		}
//3. To print the middle index
		li.indexOf(0);
		System.out.println(li);
		
4//

	}

}
