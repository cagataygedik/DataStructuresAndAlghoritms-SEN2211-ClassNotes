package week9;

//The insertion sort algorithm sorts the list by moving each element to its proper place.

public class InsertionSort {
	public static void insertionSort(int[] data) {
        int insert, moveItem;

        for (int i = 1; i < data.length; i++) {
            insert = data[i];
            moveItem = i;

            while (moveItem > 0 && data[moveItem - 1] > insert) {
                // Shift elements to the right until the correct position for insert is found
                data[moveItem] = data[moveItem - 1];
                moveItem--;
            }

            // Place the insert element in its correct position
            data[moveItem] = insert;
        }
    }
	
	public static void main(String[] args) {
        // Example usage:
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        insertionSort(arrayToSort);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Best case: O(n)
 * Worst case: O(n^2)
 */
