import java.util.Scanner;
import utilities.Preparation;
import utilities.Search;

public class Application {
    
    int[][] array = new int[20][1000];

    public static void main(String[] args) {

        Preparation.numbersToSearchFor = Preparation.getNumbersToSearch( Preparation.obtainData() );

        Scanner input = new Scanner(System.in);
        System.out.println("(1) to run sequencial search");
        System.out.println("(2) to run binary search");
        System.out.print("> ");
        String choose = input.next();
        
        if( choose.equals("1") ){
            Search.time = 0;
            Search.sequencialSearch( Preparation.numbersToSearchFor );
        }else if( choose.equals("2") ){
            Search.time = 0;
            Search.binarySearch(Preparation.numbersToSearchFor);
        } else { // delete this else after its to test normal binary seach
            Search.time = System.nanoTime();
            Search.normalBinarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        }

        System.out.println("-------------------------------");
        input.close();
    }
}
