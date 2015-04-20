package TinieProbs;

/**
 * Created by xeniah on 4/13/15.
 */
public class OneEditApart {
    /*
    Given two strings, return boolean True/False, if they are only one edit apart.
    Edit can be insert/delete/update of only one character in the string. */

    public static boolean oneEditAway(String one, String two) {
        if(Math.abs(one.length() - two.length()) > 1) return false;

        int found = 0;

        int n = Math.max(one.length(), two.length());
        int p1, p2;
        p1 = p2 = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == one.length() || i == two.length()) {
                break;
            }

            if(one.charAt(p1) != two.charAt(p2)) {
                found++;
                if(one.length() > two.length()){
                    p1++;
                }else if(two.length() > one.length())
                {
                    p2++;
                }else
                {
                    p1++;
                    p2++;
                }

            }else
            {
                p1++;
                p2++;
            }
        }
        return found < 2;
    }

    public static void main(String[] args) {
        System.out.println(oneEditAway("Monomery","Mongomery"));
    }
}
