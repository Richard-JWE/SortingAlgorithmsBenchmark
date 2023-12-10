SortingAlgorithmsBenchmark in Java

The java package contains SortingAlgorithms.java and a runner.java file.. The application uses a list of sorting algorithms to measure performance based on various input sizes and benchmark each soring algorithm to sort the inputted input size. This project contains Java code for benchmarking various sorting algorithms including Bubble Sort, Insertion Sort, Quick Sort, Counting Sort, and Heap Sort.

Number of Runs: The benchmarking application runs each algorithm multiple times for accurate performance testing.

Input Sizes: The benchmark tests the algorithms with different input array sizes specified in inputSizes.

The following sorting algorithms are used in the application:

Bubble Sort: Sorts an array by repeatedly stepping through the list to swap adjacent elements if they are in the wrong order. This is inefficient for large datasets and random datasets.
Insertion Sort: Builds the final sorted array one item at a time by taking elements from the input and swapping them into their correct position. Slower with reversed sorted data where the running time is O(n^2) which is the maximum amount of comparisons and swaps. When sorted or nearly sorted it just needs to compare each element once so not as many swaps 
Quick Sort: Quicksort uses a  divide-and-conquer strategy to partition the array into smaller subarrays and then sorting the subarrays independently. Is suitable for complex  data. Quick Sort's worst-case time complexity is O(n^2) when the pivot choice is poor, which occurs in picking the first or last character in the dataset. The best is to pick median of the three.
Counting Sort: Sorts elements by counting the frequency of their occurrences and arranging them accordingly. Sorting a list of positive integers from 1 to 1000 would be highly efficient using Counting Sort.
Heap Sort: Uses a binary heap data structure to sort elements efficiently. In complex data there is complications where it’s not stable. Time complexity of O(n log n). Suitable for large data sets

Usage
The provided class offers static methods for each sorting algorithm. The arrays are generated using java.util.Random; and populated using the callAlg function.

Compile Java files 
javac SortingAlgorithms.java Runner.java

Run the application 
Java Runner



![image](https://github.com/Richard-JWE/SortingAlgorithmsBenchmark/assets/86606594/55016cd0-41e8-4337-853d-e4f48837d01e)


