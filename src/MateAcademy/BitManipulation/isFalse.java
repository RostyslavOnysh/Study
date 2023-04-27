package MateAcademy.BitManipulation;

public class isFalse {
    public static boolean isFalse(boolean a, boolean b, boolean c, boolean d) {
        return (a ^ b) && (c ^ d)    // a b c d
                ||
                (a ^ c) && (b ^ d)   // a c b d
                ||
                (a ^ d) && (b ^ c);  // a d b c
    }


    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        boolean aFalse = isFalse(a, b, c, d);
        System.out.println(aFalse);
    }
}


/*

two arguments being true and the other two being false.
we can use the XOR (^) operator to compare each pair of arguments.
 If two arguments are different
 their XOR will be true. If two pairs of arguments are different
 their XORs will be true as well. We can combine these comparisons using logical
  (and or) operators to cover all possible combinations.
 */