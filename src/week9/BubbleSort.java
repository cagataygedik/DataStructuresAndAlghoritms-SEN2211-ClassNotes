package week9;

public class BubbleSort {
	public static void bubbleSort(int[] data) {
        int temp;

        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < data.length - i; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap elements if they are in the wrong order
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
	
	public static void main(String[] args) {
        // Example usage:
        int[] arrayToSort = {5, 2, 9, 1, 5, 6};
        bubbleSort(arrayToSort);

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
