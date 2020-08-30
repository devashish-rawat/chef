import java.sql.SQLOutput;
import java.util.Scanner;

public class Lapindromes {
    public static void main(String[] args) {

        final Scanner scan = new Scanner(System.in);

        int testCases = scan.nextInt();
        scan.nextLine();

        while(testCases > 0){

            String word = scan.nextLine();
            String input, process;

            Boolean diffChar = false;

            int wordLength = word.length();


            if(wordLength % 2 == 0){

                input = word.substring(0, wordLength/2);
                process = word.substring(wordLength/2);

                /*System.out.println("input ->" + input);
                System.out.println("process ->" + process);*/
            }else{

                input = word.substring(0, wordLength/2);
                process = word.substring(wordLength/2 + 1);

                /*System.out.println("input ->" + input);
                System.out.println("process ->" + process);*/
            }

            for(int indexInput = 0; indexInput < input.length(); indexInput++){

                if(process.contains(Character.toString(input.charAt(indexInput)))){

                    process = process.replaceFirst(Character.toString(input.charAt(indexInput)), "");
                    //System.out.println(process);

                }else{
                    diffChar = true;
                    break;
                }
            }

            if(diffChar){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }

            testCases--;
        }
    }
}
