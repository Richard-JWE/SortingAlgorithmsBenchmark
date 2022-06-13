package ie.gmit.dip;
public class SortingAlgorithms {

  public static void bubbleSort(int[] arr) {
    int n = arr.length;
    for (int outer = n - 1; outer > 0; outer--) {
      for (int inner = 0; inner < outer; inner++) {
        if (arr[inner] > arr[inner + 1]) {
          int temp = arr[inner];
          arr[inner] = arr[inner + 1];
          arr[inner + 1] = temp;
        }
      }
    }
  }

  public static void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;
      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j = j - 1;
      }
      arr[j + 1] = key;
    }
  }

  public static void quickSort(int[] arr, int low, int high) {
    if (arr == null || arr.length == 0) return;
    // Base case stopping recursion when low and high come into contact.
    if (low >= high) return;

    // Sets the pivot as the middle value in array.
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];

    // Set left to low and set right to high.
    int i = low, j = high;

    /*
     * While loop executes until bounds cross, after which
     * all values to the left are lower than pivot
     *and all to the right are higher.
     */

    while (i <= j) {
      // Find a value greater than pivot.
      while (arr[i] < pivot) {
        i++;
      }

      // Find a value less than pivot.
      while (arr[j] > pivot) {
        j--;
      }

      // Perform swap if values are in wrong position.
      if (i <= j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
      }
    }

    // Recursive calls to deal with partitions created.
    if (low < j) quickSort(arr, low, j);

    if (high > i) quickSort(arr, i, high);
  }

  public static int[] countingSort(int[] arr, int maxValue ) { // count the number of times each value appears.
    int[] counts = new int[maxValue + 1];
    for (int item : arr) {
      counts[item] += 1;
    }

    // overwrite counts to hold the next index an item with a given value goes.
    int numItemsBefore = 0;
    for (int i = 0; i < counts.length; i++) {
      int count = counts[i];
      counts[i] = numItemsBefore;
      numItemsBefore += count;
    }

    // output array to be filled in
    int[] sortedArray = new int[arr.length];

    // run through the input array
    for (int item : arr) {

      // place the item in the sorted array
      sortedArray[ counts[item] ] = item;

      // and, make sure the next item we see with the same value
      // goes after the one we just placed
      counts[item] += 1;
    }

    return sortedArray;
  }

  public static void heapSort(int[] arr) {
    int temp;
    for (int i = arr.length / 2 - 1; i >= 0; i--) // build the heap
    {
      heapify(arr, arr.length, i);
    }

    for (int i = arr.length - 1; i > 0; i--) { // get elements from the heap
      temp = arr[0]; // move current root to end, since it's the largest
      arr[0] = arr[i];
      arr[i] = temp;
      heapify(arr, i, 0); // recall heapify to rebuild heap for the remaining elements
    }
  }

  public static void heapify(int[] arr, int n, int i) {
    int MAX = i; // Initialize largest as root
    int left = 2 * i + 1; // index of the left child of ith node 
    int right = 2 * i + 2; // index of the right child of ith node 
    int temp;

    if (left < n && arr[left] > arr[MAX]) { // check if the left child of the root is larger than the root

      MAX = left;
    }
    if (right < n && arr[right] > arr[MAX]) { // check if the right child of the root is larger than the root
      MAX = right;
    }
    if (MAX != i) { // repeat to find the largest element in the heap
      temp = arr[i];
      arr[i] = arr[MAX];
      arr[MAX] = temp;
      heapify(arr, n, MAX);
    }
  }
}

