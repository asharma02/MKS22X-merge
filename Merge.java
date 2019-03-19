public class Merge {

  /*sort the data from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[] data) {
       if (data.length > 1) { //go until its lenght is 1
           // splits data into two halves
           int mid = data.length / 2; //middle index
           int[] left = new int[mid]; //make left array with all the values from start to mid
           for (int i = 0; i < mid; i++) {
               left[i] = data[i];
           }
           int[] right = new int[data.length-mid]; //make right array with all values from mid to end
           for (int i = 0; i < data.length-mid; i++) {
               right[i] = data[i + mid];
           }
           mergesort(left);//recursively call wrapper on left side
           mergesort(right);//recursivley call weapper on right side
           merge(data, left, right); //merge both using helper
       }
   }


}
