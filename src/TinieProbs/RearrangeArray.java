package TinieProbs;

/**
 * Created by xeniah on 4/14/15.
 */
public class RearrangeArray {
    /* given an array of numbers, rearrange the numbers so that all even numbers are at even indices */
    public static void reArrange(int [] numbers) {
        int start = 0;
        int end = (numbers.length % 2 == 0)? numbers.length-1 : numbers.length-2;
        while(start < numbers.length-2 && end > 1) {
            while(numbers[start] % 2 == 0) {
                start += 2;
            }
            while(numbers[end] % 2 == 1) {
                end -=2;
            }
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
        }
    }

    public static void main(String[] args) {
        int [] numbers = {2, 1, 6, 8, 99, 100, 13, 72, 9};
        reArrange(numbers);
        for(int i : numbers)
        System.out.print(" " + i);
    }
}
