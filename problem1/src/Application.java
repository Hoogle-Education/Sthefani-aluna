import java.util.Scanner;
import utilities.Preparation;
import utilities.Search;

public class Application {
    
    int[][] array = new int[20][1000];

    public static void main(String[] args) throws Exception {

        long time = System.nanoTime();

        Preparation.numbersToSearchFor = Preparation.getNumbersToSearch( Preparation.obtainData() );


        // scanner
        // int option
        
        
        Search.sequencialSearch( Preparation.numbersToSearchFor );

        System.out.println(time);

    }
}
