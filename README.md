Sorting Algorithms in Java


SortingAlgorithms that implements various sorting algorithms to sort arrays of integers efficiently.
These algorithms offer different strategies for sorting elements in ascending order.

Implemented Algorithms

Bubble Sort
Description: A simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
Method: bubbleSort(int[] arr)
Insertion Sort
Description: Builds the final sorted array one item at a time by comparing each element with the elements to its left and inserting it into the correct position.
Method: insertionSort(int[] arr)
Quick Sort
Description: Uses a pivot element to partition the array into smaller segments and recursively sorts these segments.
Method: quickSort(int[] arr, int low, int high)
Counting Sort
Description: Sorts elements by counting the number of occurrences of each unique element in the input array.
Method: countingSort(int[] arr, int maxValue)
Heap Sort
Description: Uses a binary heap data structure to sort elements. It starts by building a max heap and then repeatedly extracts the maximum element from the heap.
Methods: heapSort(int[] arr) and heapify(int[] arr, int n, int i)
Usage
The provided class offers static methods for each sorting algorithm. To use these methods:

Create an integer array to be sorted.
Call the desired sorting method from the SortingAlgorithms class, passing the array as an argument.
Example:
int[] arrayToSort = {5, 2, 9, 1, 5, 6};
SortingAlgorithms.bubbleSort(arrayToSort);

These sorting algorithms are implemented for educational purposes. For large datasets, consider using Java's built-in sorting methods (Arrays.sort()) or other optimized libraries.
Each method in the SortingAlgorithms class operates directly on the input array and sorts it in place.

