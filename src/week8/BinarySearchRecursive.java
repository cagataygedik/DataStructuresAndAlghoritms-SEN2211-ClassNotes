package week8;

import java.util.Scanner;

public class BinarySearchRecursive {
	public static int binarySearch(int[] data, int key, int low, int high) {
		int mid = (low + high) / 2;
		if (low > high)
			return -1;
		else if (data[mid] == key)
			return mid;
		else if (data[mid] > key)
			return binarySearch(data, key, low, mid - 1);
		else
			return binarySearch(data, key, low, mid + 1);
	}

	public static void main(String[] args) {
		int x [] = {2, 7, 12, 13, 29, 35, 41, 56, 67};
		Scanner s = new Scanner(System.in);
		int searchKey;
		int pos;
		System.out.print("Array: ");
		for(int element: x)
			System.out.print(element + " ");
		
		System.out.println("\nPlease enter an integer value:");
		searchKey = s.nextInt();
		
		pos = binarySearch(x, searchKey, 0, x.length);
		
		if(pos == -1)
			System.out.println("The integer " + searchKey + " was not found.");
		else
			System.out.println("The integer " + searchKey + " was not found in positon " + pos + ".");
	}

}

/*
 * complexity: O(log n)
 */
