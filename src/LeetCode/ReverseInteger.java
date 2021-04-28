package LeetCode;
/*Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer
 range [-231, 231 - 1], then return 0.*/
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(-564));
    }
    public int reverse(int x) {
        int a = Math.abs(x / 100);//1
        int b = Math.abs(x / 10 % 10);//2
        int c = Math.abs(x % 10);//3
        if(x<0) {
             String s = "-"+c+""+b+""+a;
             return Integer.parseInt(s);
        }else {
            String s = c+""+b+""+a;
            return Integer.parseInt(s);
        }

    }
}

