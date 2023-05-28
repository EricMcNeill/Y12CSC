
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
        System.out.println("Type how large the board will be");
        System.out.println("Type the length");
        
        System.out.println("Type the Height");

        int board[][] = new int[columns][rows];
        System.out.println("Type co-ordinates of bacteria to spawn");
        int coordinatex;
        int coordinatey;
        //put next bit in a loop so more co-ordintes can be added
        System.out.println("Type the x co-ordinate");
        coordinatex = keyboard.nextInt();
        System.out.println("Type the y co-ordinate");
        coordinatey = keyboard.nextInt();
        board[coordinatey][coordinatex] = 1;
        
        for (int X=0;X<columns;X++){
            for (int Y=0;Y<rows;Y++)
                System.out.print(board[X][Y]+" ");
            System.out.println();
        }
    }
}
