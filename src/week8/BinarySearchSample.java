package week8;

public class BinarySearchSample {
	public static int binarySearch(int[] data, int key) {
		int low = 0;
		int high = data.length - 1;
		int middle = (low + high) / 2;
		int location = -1;
		
		do {
			if (key == data[middle])
				location = middle;
			else if(key < data[middle])
				high = middle - 1;
			else
				low = middle + 1;
			middle = (low + high) / 2;
		} while((low <= high) && (location == -1));
		return location;
	}
}

/*
 * complexity: O(log n)
 */
