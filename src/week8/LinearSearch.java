package week8;

import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] data, int key) {
		for(int i = 0; i < data.length; i++)
			if(data[i] == key)
				return i;
		
		return -1;
	}
	
	public static void main(String[] args) {
		int x [] = {2, 67, 56, 29, 41 ,35, 7, 12};
		Scanner s = new Scanner(System.in);
		int searchKey;
		int pos;
		System.out.print("Array: ");
		for(int element: x) {
			System.out.print(element + " ");
		}
		System.out.println("\nPlease enter an integer value: ");
		searchKey = s.nextInt();
		pos = linearSearch(x, searchKey);
		if(pos == -1)
			System.out.println("The integer " + searchKey + " was not found.");
		else
			System.out.println("The integer " + searchKey + " was found in position " + pos + ".");
	}
}

/*
 *  Best Case: 1
 *  Average Case: (n+1)/2
 *  Worst Case: n
 *  Complexity: O(n)
 */


