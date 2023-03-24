import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {
    public static ArrayList<Integer> checkPerfectNumbersUntil(int perfectNumbersUntil){

        ArrayList<Integer> listOfPerfectNumbers = new ArrayList<>();

        for( int numberToCheck = 1 ; numberToCheck <= perfectNumbersUntil ; numberToCheck++ ){

            int sum = 0;

            for( int iterator = 1 ; iterator < numberToCheck ; iterator++ ){

                if( numberToCheck % iterator == 0 ){

                    sum = sum + iterator;

                }

            }

            if( sum == numberToCheck ){

                listOfPerfectNumbers.add(numberToCheck);

            }

        }

        return listOfPerfectNumbers;

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int perfectNumbersUntil = scanner.nextInt();

        System.out.println(checkPerfectNumbersUntil(perfectNumbersUntil));

    }
}