# SortingAlgorithmsBenchmark in Java

This Java package contains code for benchmarking various sorting algorithms, including Bubble Sort, Insertion Sort, Quick Sort, Counting Sort, and Heap Sort. The project includes `SortingAlgorithms.java` and a `Runner.java` file to facilitate benchmarking.

## Overview

The application measures the performance of each sorting algorithm based on various input sizes. The benchmarking process involves running each algorithm multiple times for accurate performance testing. The input array sizes are specified in `inputSizes`.

## Sorting Algorithms

### Bubble Sort
Bubble Sort sorts an array by repeatedly stepping through the list to swap adjacent elements if they are in the wrong order. It is inefficient for large and random datasets.

### Insertion Sort
Insertion Sort builds the final sorted array one item at a time by taking elements from the input and swapping them into their correct position. It is slower with reversed sorted data but efficient for nearly sorted or small datasets.

### Quick Sort
Quick Sort uses a divide-and-conquer strategy, partitioning the array into smaller subarrays and sorting them independently. Suitable for complex data, with a time complexity of O(n log n). Beware of worst-case time complexity when the pivot choice is poor.

### Counting Sort
Counting Sort sorts elements by counting the frequency of their occurrences and arranging them accordingly. Highly efficient for sorting a list of positive integers from 1 to 1000.

### Heap Sort
Heap Sort uses a binary heap data structure to sort elements efficiently with a time complexity of O(n log n). It may not be stable in complex data sets but is suitable for large data sets.

## Number of Runs and Input Sizes

The benchmarking application runs each algorithm multiple times for accurate performance testing. Different input array sizes specified in `inputSizes` are used to test the algorithms.

## Usage

To use the provided class for benchmarking:

1. Compile Java Files:
    javac SortingAlgorithms.java Runner.java
2. Run Java Application:
    java Runner



![image](https://github.com/Richard-JWE/SortingAlgorithmsBenchmark/assets/86606594/55016cd0-41e8-4337-853d-e4f48837d01e)


