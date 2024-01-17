package week9;

public class QuickSort {

}

//-The quick sort algorithm uses the divide-and-conquer technique to sort a list.
/*
 *-The list is partitioned into two sublists, 
 * which are then sorted and combined into one list 
 * in such a way so that the combined list is sorted.
 */

//-The general algorithm is:
/*
 * if (the list size greater than 1) {
 * a. Partition the list into two sublists, lowerSublist and upperSublist.
 * b. Quick sort the lowerSublist.
 * c. Quick sort the upperSublist.
 * d. Combine the sorted sublists together.
 */


//              Number of Comparisons || Number of Swaps
// Average Case:     O(n log2 n)      ||   O(n log2 n)
// Worst Case:       O(n^2)           ||   O(n^2)
