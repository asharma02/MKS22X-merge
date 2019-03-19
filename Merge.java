public class Merge {

  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int lo = 0;
    int hi = data.length -1;
    if (lo < hi) {
        // Same as (l+r)/2, but doesnt overflow for large l and h
        int mid = lo+(hi-lo)/2;
        // Sort first and second halves
        mergeSort(data, lo, mid);
        mergeSort(data, mid+1, hi);

        merge(data, lo, mid, ro);
    }
  }

  private static void mergesorth(int[]data, int lo, int mid, int hi) {
    if (lo == hi) {
      return; //base case, more than one item in the list
    }
    int mid = (lo + hi)/2; //middle index
    mergesorth(data, lo, mid); //call on left half
    mergesorth(data, mid + 1, hi); //call on right half
    merge
  }

  private static void merge(int[]data, int lo, int hi) {

  }



}
