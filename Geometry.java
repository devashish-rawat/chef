//CodeChef Feb2020B
//https://www.codechef.com/FEB20B/problems/SNUG_FIT/
import java.math.BigInteger;
import java.util.*;
class Geometry {
    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();

        while(testCases > 0){

            int rectangles = scan.nextInt();

            int A[] = new int[rectangles];
            int B[] = new int[rectangles];
            BigInteger S = new BigInteger("0");

            for(int index = 0; index < rectangles; index++){

                A[index] = scan.nextInt();
            }

            for(int index = 0; index < rectangles; index++){

                B[index] = scan.nextInt();
            }

            Arrays.sort(A);
            Arrays.sort(B);

            for(int index = 0; index < rectangles; index++){

                int diameter = Math.min(A[index], B[index]);
                S = S.add(BigInteger.valueOf(diameter));
            }

            System.out.println(S);

            testCases--;
        }
    }
}
