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
           mergesort(right);//recursivley call wrapper on right side
           merge(data, left, right); //merge both using helper
       }
       //doesnt do anything if it is one length
   }

   //this merges the numbers from the sorted left/right into data,
   public static void merge(int[] data, int[] left, int[] right) {
     int leftcurrent = 0;
     int rightcurrent = 0;
     for (int i = 0; i < data.length; i++) { //loop through data
       if (rightcurrent >= right.length || (leftcurrent < left.length && left[leftcurrent] <= right[rightcurrent])) { //if finished with right or left isnt finished and the current in left is < current in right
         data[i] = left[leftcurrent];//insert the one from left
         leftcurrent += 1; //index up the left
       }
       else { //otherwise
        data[i] = right[rightcurrent]; //insert the one form the right
        rightcurrent += 1; //index up the right
      }
    }
  } //end merging




}
