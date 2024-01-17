package week9;

//Rearrange list by selecting an element and moving it to its proper position
//Find the smallest (or largest) element and move it to the beginning (end) of the list


public class SelectionSort {
	public static void selectionSort(int[] data) {
        int smallest;

        for (int i = 0; i < data.length - 1; i++) {
            smallest = i;

            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[smallest]) {
                    // Update the index of the smallest element
                    smallest = j;
                }
            }

            // Swap the found smallest element with the element at index i
            int temp = data[i];
            data[i] = data[smallest];
            data[smallest] = temp;
        }
    }
	
	public static void main(String[] args) {
        // Example usage:
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        selectionSort(arrayToSort);

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int num : arrayToSort) {
            System.out.print(num + " ");
        }
    }
}

/*
 * Complexity: O(n^2)
 */
