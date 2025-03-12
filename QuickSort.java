public class QuickSort {
  static void quickSort(int [] arr, int low, int high){
    if(low < high){
      int pivot = partition(arr, low, high);
      quickSort(arr, low, pivot - 1);
      quickSort(arr, pivot + 1, high);
    }
  }
  static int partition(int [] arr, int low, int high){
    int pivot = arr[high];
    int i = low - 1;
    for(int j = low; j < high; j++){
      if(arr[j] < pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;
    return i + 1;
  }
  public static void main(String[] args) {
    int [] arr = {10, 7, 8, 9, 1, 5};
    quickSort(arr, 0, arr.length - 1);
    for(int i = 0; i < arr.length; i++){
      System.out.print(arr[i] + " ");
    }
  }
  
}
