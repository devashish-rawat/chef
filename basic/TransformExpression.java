package CodeChef;

import java.io.*;
import java.util.Stack;

public class TransformExpression {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCases = Integer.parseInt(br.readLine());

        while (testCases > 0){

            String exp = br.readLine();
            //System.out.println(exp);
            Stack<Character> stack = new Stack<>();
            for(int index = 0; index < exp.length(); index++){

                char currentChar = exp.charAt(index);

                if(Character.isAlphabetic(currentChar)){
                    System.out.print(currentChar);
                }else{
                    if(currentChar == ')') {
                        char currentPop;
                        do {
                            currentPop = stack.pop();

                            if(currentPop != '(') {
                                System.out.print(currentPop);
                            }
                        } while (currentPop != '(');
                    }else{
                        stack.push(currentChar);
                    }
                }
            }

            System.out.println();
            testCases--;
        }
    }
}
