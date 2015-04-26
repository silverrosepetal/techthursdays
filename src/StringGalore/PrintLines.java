package StringGalore;

/**
 * Created by xeniah on 4/25/15.
 */

/**
 * Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque nisl leo, fermentum et ipsum id,
 * commodo venenatis justo. Sed odio libero, finibus non luctus dapibus, tristique ac purus. Sed ultrices
 * justo vel lorem vehicula posuere. Phasellus sodales lacus et tellus sagittis pretium. Donec porttitor
 * porttitor pulvinar. Mauris molestie massa et nisi porttitor ornare. Proin ullamcorper risus vitae odio
 * pharetra congue pellentesque non mi. Nulla eu commodo dolor.
 */
public class PrintLines {
   public static void printSplitString(String str)
   {
       char [] charStr= str.toCharArray();
       int position = charStr.length-1;
       printSplitString(charStr, 0, position);
   }

    public static void printChars(char [] charStr, int begin, int end) {
        for(int i = begin; i < end; i++)
        {
            System.out.print(charStr[i]);
        }
        System.out.println();
    }

    private static void printSplitString(char[] charStr, int length, int position) {
        int nextPosition = position;
        int counter = 0;
        while(counter <= length) {
            nextPosition--;
            counter++;
        }
        while(charStr[nextPosition] != ' ') nextPosition--;
        length = position-nextPosition;
        nextPosition++; //compensate for the prepended space
        if(length >= nextPosition){
            printChars(charStr, 0, position);
        }else {
            printSplitString(charStr, length, nextPosition);
            printChars(charStr, nextPosition, position);
        }
    }

    public static void main(String[] args) {
        /*
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque nisl leo, fermentum et ipsum id," +
                "commodo venenatis justo. Sed odio libero, finibus non luctus dapibus, tristique ac purus. Sed ultrices " +
                "justo vel lorem vehicula posuere. Phasellus sodales lacus et tellus sagittis pretium. Donec porttitor " +
                "porttitor pulvinar. Mauris molestie massa et nisi porttitor ornare. Proin ullamcorper risus vitae odio " +
                "pharetra congue pellentesque non mi. Nulla eu commodo dolor.";
                */
        String s = "Median value of a range of values is the mid value of a range of values. Easiest way to get to this is to sort the array and pick the middle element. If the number of elements in the array is odd and the middle two elements if the number of elements in the array is even. However, sorting will mean that you will spend O(nlogn) time. The trick is to get to the median value without needing to sort the entire array.";
        printSplitString(s);
    }

}
