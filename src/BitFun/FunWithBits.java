package BitFun;

/**
 * Created by xeniah on 4/19/15.
 */
public class FunWithBits {
    public static int swapNybbles(int orig) {
        int lowerNybble = orig & 0x0f; // 00001111
        int uppperNybble = orig & 0xf0; //11110000
        return lowerNybble << 4 | uppperNybble >> 4;
    }

    public static int swapAlternateBits(int orig) {
        int oddBits = orig & 0x55; /// 01010101 is 55 in binary
        int evenBits = orig & 0xAA; // 10101010
        return oddBits << 1  | evenBits >> 1;
    }

    public static String toBinaryString(int t) {
        String s = Integer.toBinaryString(t);
        while(s.length() < 8) {
            s = "0"+s;
        }
        return s;
    }

    public static void main(String[] args) {
        int t = 22;
        System.out.println("Original: " + toBinaryString(t));
      //  System.out.println("Swap Nybbles: " + toBinaryString(swapNybbles(t)));
        System.out.println("Swap Odd and Even Bits: " + toBinaryString(swapAlternateBits(t)));
    }

}
