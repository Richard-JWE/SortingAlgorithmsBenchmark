package ie.gmit.dip;

public class Runner {
  private static final String[] sortingAlgs = {
    "Bubble Sort", "Insertion Sort", "Quick Sort", "Counting Sort", "Heap Sort"
  };
  private static final int numRuns = 10;
  private static final int[] inputSizes = {
    100, 500, 1000, 2500, 5000, 7500, 10000, 15000, 20000, 25000
  };
  private static final double[][] sResults = new double[sortingAlgs.length][inputSizes.length];

  public static double callAlg(int count, double totalElapsedMillis, int[] arr, String Sort) {
    double startTime = 0, elapsedMillis = 0, endTime = 0, timeElapsed = 0;
    int[] random = arr.clone();
    switch (Sort) {
      case "Bubble":
        startTime = System.nanoTime();
        SortingAlgorithms.bubbleSort(random);
        endTime = System.nanoTime();
        break;
      case "Insertion":
        startTime = System.nanoTime();
        SortingAlgorithms.insertionSort(random);
        endTime = System.nanoTime();
        break;
      case "Quick":
        startTime = System.nanoTime();
        SortingAlgorithms.quickSort(random, 0, random.length - 1);
        endTime = System.nanoTime();
        break;
      case "Counting":
        startTime = System.nanoTime();
        SortingAlgorithms.countingSort(random, random.length - 1 );
        endTime = System.nanoTime();
        break;
      case "Heap":
        startTime = System.nanoTime();
        SortingAlgorithms.heapSort(random);
        endTime = System.nanoTime();
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + Sort);
    }

    timeElapsed = endTime - startTime;
    elapsedMillis = timeElapsed / 1000000; // convert from nanoseconds to milliseconds
    totalElapsedMillis += elapsedMillis; // keep total

    if (count <= 1) {
      return (totalElapsedMillis / numRuns);
    }
    return callAlg(count - 1, totalElapsedMillis, arr, Sort);
  }

  static int[] RandomArray(int size) {
    int[] arr = new int[size];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = (int) (Math.random() * size);
    }
    return arr;
  }

  static void Results() {
    System.out.println();
    System.out.println("\t \t \t \t Sorting Algorithms Benchmarking in milliseconds\r");
    System.out.println();
    System.out.printf("%-15s", "Input Size");

    // number of samples
    int numSamples = inputSizes.length;
    for (int inputSize : inputSizes) System.out.printf("%10d", inputSize);
    System.out.println();
    System.out.println(
        "-------------------------------------------------------------------------------------------------------------------");
    // number of sorting algorithms
    int size = sortingAlgs.length;

    for (int row = 0; row < size; row++) {
      System.out.printf("%-15s", sortingAlgs[row]);
      for (int col = 0; col < numSamples; ++col) {
        // set decimal format to display 3 decimal places
        System.out.printf("%10.3f", sResults[row][col]);
      }
      System.out.println();
    }
    System.out.println(
        "-------------------------------------------------------------------------------------------------------------------");
  }

  public static void main(String[] args) {
    new SortingAlgorithms();
    int[] arr;

    for (int i = 0; i <= inputSizes.length - 1; i++) {
      arr = Runner.RandomArray(inputSizes[i]);
      sResults[0][i] = callAlg(numRuns, 0, arr, "Bubble");
      sResults[1][i] = callAlg(numRuns, 0, arr, "Insertion");
      sResults[2][i] = callAlg(numRuns, 0, arr, "Quick");
      sResults[3][i] = callAlg(numRuns, 0, arr, "Counting");
      sResults[4][i] = callAlg(numRuns, 0, arr, "Heap");
    }
    Results();
  }
}
