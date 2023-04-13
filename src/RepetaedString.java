import java.util.*;

public class RepetaedString {


                class RepeatedString {
                    public static void main(String[] args) {
                        Scanner in = new Scanner(System.in);
                        String s = in.next();
                        long n = in.nextLong();
                        long num = n / s.length();
                        long rem = n % s.length();
                        long ans = 0;
                        for (int i = 0; i < s.length(); i++) {
                            if (s.charAt(i) == 'a') {
                                ans += num;
                                if (i < rem)
                                    ans++;
                            }
                        }

                            Object[] fr;
                            Object visited;
                            for (int i = 0; i < 10; i++) {
                                boolean arr = false;
                                int count = 1;
                                int j;
                                for (j = i + 1; !(Array.length <= j); j++) {
                                    System.out.println("---------------------------------------");
                                    System.out.println(" Element | Frequency");
                                    System.out.println("---------------------------------------");
                        System.out.println(ans);
                    }
                }
            }
        }
    }





