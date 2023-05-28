/**
 * Write a description of class Board here.
 *
 * @author Eric McNeill
 * @version 22/05/23
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
        /**

        System.out.println("Type how large the board will be");
        System.out.println("Type the length");
        columns = keyboard.nextInt();
        System.out.println("Type the Height");
        rows = keyboard.nextInt();
        */
        columns = 5;
        rows = 5;
        System.out.println("Type co-ordinates of bacteria to spawn");
        System.out.println("Type 'Start' to begin the game after spawning bacteria");
        int coordinatex;
        int coordinatey;
        boolean topLeft = false;
        boolean top = false;
        boolean topRight = false;
        boolean left = false;
        boolean right = false;
        boolean bottomLeft = false;
        boolean bottom = false;
        boolean bottomRight = false;
        int setCaseTo = 1;
        //Look at debugging to see why the bacteria replication is not working right
        //put next bit in a loop so more co-ordintes can be added
        //while(keyboard.nextLine() != "start"){
        for(int i=0;i<3;i++){
            System.out.println("Type what column");
            coordinatex = keyboard.nextInt();
            System.out.println("Type what row");
            coordinatey = keyboard.nextInt();
            board[coordinatey-1][coordinatex-1] = 1;
        }
        //}
        for(int a=0;a<5;a++){
            for (int X=0;X<columns;X++){
                for (int Y=0;Y<rows;Y++)
                    System.out.print(board[X][Y]+" ");
                System.out.println();
            }
            
            for (int X=0;X<columns;X++){
                for (int Y=0;Y<rows;Y++){
                    if(board[X][Y] == 1){
                        if(X == 0 && Y == 0){
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y+1] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == columns && Y == 1){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == 1 && Y == rows){
                            if(board[X][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == columns && Y == rows){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                        }else if (X == 0){
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }    
                        }else if (Y == 0){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                               setCaseTo ++; 
                            }
                        }else if(X == columns){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                               setCaseTo ++; 
                            }
                        }else if(Y == rows){
                            if(board[X-1][Y] == 1){
                                setCaseTo++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo++;
                            }
                        }else{
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X-1][Y] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X][Y+1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++; 
                            }
                        }
                        System.out.println(X+","+Y+" "+setCaseTo);
                        switch (setCaseTo){
                            case 0 : board[X][Y] = 0;
                                break;
                            case 1 :  board[X][Y] = 1;
                                break;
                            case 2 :  board[X][Y] = 1;
                                break;
                            default : board[X][Y] = 0;
                                break;
                        }
                        setCaseTo = 0;
                    }else if(board[X][Y] == 0){
                        if(X == 0 && Y == 0){
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y+1] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == columns && Y == 1){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == 1 && Y == rows){
                            if(board[X][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                        }else if(X == columns && Y == rows){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                        }else if (X == 0){
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++;
                            }    
                        }else if (Y == 0){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                               setCaseTo ++; 
                            }
                        }else if(X == columns){
                            if(board[X-1][Y] == 1){
                                setCaseTo ++;
                            }
                            if(board[X-1][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                               setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                               setCaseTo ++; 
                            }
                        }else if(Y == rows){
                            if(board[X-1][Y] == 1){
                                setCaseTo++;
                            }
                            if(board[X-1][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo++;
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo++;
                            }
                        }else{
                            if(board[X-1][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X-1][Y] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X][Y+1] == 1){
                                setCaseTo ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                setCaseTo ++; 
                            }
                        }
                        System.out.println(X+","+Y+" "+setCaseTo);
                        switch (setCaseTo){
                            case 0 : board[X][Y] = 0;
                                break;
                            case 1 : board[X][Y] = 0;
                                break;
                            case 2 : board[X][Y] = 0;
                                break;
                            case 3 : board[X][Y] = 1;
                                break;
                            default : board[X][Y] = 0;
                                break;
                        }
                        setCaseTo = 0;
                    }
                }
            }
        }
    }
}

