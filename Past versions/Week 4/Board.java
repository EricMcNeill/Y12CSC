
/**
 * Write a description of class Board here.
 *
 * @author Eric McNeill
 * @version 8/05/2023
 */
import java.util.Scanner; 
public class Board
{
    // instance variables - replace the example below with your own
    int rows = 10;
    int columns = 10 ;
    //maybe add code to make this change before creating the board?
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        Scanner keyboard = new Scanner(System.in);
        int board[][] = new int[columns][rows];
        System.out.println("Type how large the board will be");
        System.out.println("Type the length");
        columns = keyboard.nextInt();
        System.out.println("Type the Height");
        rows = keyboard.nextInt();
        System.out.println("Type co-ordinates of bacteria to spawn");
        System.out.println("Type 'Start' to begin the game after spawning bacteria");
        int coordinatex;
        int coordinatey;
        //put next bit in a loop so more co-ordintes can be added
        for(int i=0;i<5;i++){
            System.out.println("Type what column");
            coordinatex = keyboard.nextInt();
            System.out.println("Type what row");
            coordinatey = keyboard.nextInt();
            board[coordinatey-1][coordinatex-1] = 1;
        }
        for (int X=0;X<columns;X++){
            for (int Y=0;Y<rows;Y++)
                System.out.print(board[X][Y]+" ");
            System.out.println();
        }
    }
}
