public class Merge {

  /*sort the data from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data) {
       if (data.length > 1) {
           // split data into two halves
           int mid = data.length / 2;
           int[] left = new int[mid];
           for (int i = 0; i < mid; i++) {
               left[i] = data[i];
           }
           int[] right = new int[data.length-mid];
           for (int i = 0; i < data.length-mid; i++) {
               right[i] = data[i + mid];
           }
           mergesort(left);
           mergesort(right);
           merge(data, left, right);
       }
   }


}
