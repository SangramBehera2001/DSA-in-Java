public class SelectionSort {
  public static void selectionSort(int[] arr) {
      
    // Outer loop for selecting the position
      for (int i = 0; i < arr.length - 1; i++) {
          int smallest = i; // Assume the current element is the smallest

          // Inner loop for finding the minimum element in the unsorted part
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[j] < arr[smallest]) {
                smallest = j; // Update minIndex if a smaller element is found
              }
          }

          // Swap the found minimum element with the element at position 'i'
          int temp = arr[smallest];
          arr[smallest] = arr[i];
          arr[i] = temp;
      }
  }

  public static void printArray(int[] arr) {
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] arr = {64, 25, 12, 22, 11};
      System.out.println("Original array:");
      printArray(arr);

      selectionSort(arr);

      System.out.println("Sorted array:");
      printArray(arr);
  }
}
