package Permute;

/**
 * Created by xeniah on 4/13/15.
 */
public class PermuteString {
    public static void permuteString(String s)
    {
        permute("", s);
    }

    private static void permute(String prefix, String str) {
        if(str.length() == 0)
        {
            System.out.println(prefix);
        }

        for(int i = 0; i < str.length(); i++)
        {
            permute(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1));
        }

    }

    public static void main(String[] args) {
        permuteString("abc");
    }
}
