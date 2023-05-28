/**
 * Write a description of class Board here.
 *
 * @author Eric McNeill
 * @version 29/05/23
 */
import java.util.Scanner; 
public class Board
{
    // instance variables - replace the example below with your own
    int rows = 5;
    int columns = 5 ;
    /**
     * Constructor for objects of class Board
     */
    public Board()
    {
        Scanner keyboard = new Scanner(System.in);
        int board[][] = new int[columns][rows];
        int life[][] = new int[columns][rows];
        int coordinatex;
        int coordinatey;
        /**
        System.out.println("Type how large the board will be");
        System.out.println("Type the length");
        columns = keyboard.nextInt();
        System.out.println("Type the Height");
        rows = keyboard.nextInt();
        */
        System.out.println("Random or Manual spawning?");
        String spawning = keyboard.nextLine();
        int random = (int)(Math.random() * 20);
        System.out.println(random);
        if(spawning == "random" ||spawning == "Random"){
            System.out.println("random");
            for(int p=0; p<random; p++){
                int randomX = (int)(Math.random() * columns);
                int randomY = (int)(Math.random() * rows);
                board[randomX][randomY] = 1;
                System.out.println(randomX + ", " + randomY);
            }
        }else if(spawning == "manual" ||spawning == "Manual"){
            System.out.println("Type co-ordinates of bacteria to spawn");
            System.out.println("Type 'Start' to begin the game after spawning bacteria");
            //make a loop to be able to choose how many to spawn
            for(int i=0;i<5;i++){
                System.out.println("Type what column");
                coordinatex = keyboard.nextInt();
                System.out.println("Type what row");
                coordinatey = keyboard.nextInt();
                board[coordinatey-1][coordinatex-1] = 1;
            }
        }else{
            System.out.println("Please type either Random or Manual");
        }
        for(int a=0;a<5;a++){
            for (int X=0;X<columns;X++){
                for (int Y=0;Y<rows;Y++){
                    System.out.print(board[X][Y]+" ");
                }
                System.out.println();
            }
            System.out.println();
            for (int X=0;X<columns;X++){
                for (int Y=0;Y<rows;Y++){
                    if(board[X][Y] == 1){
                        if(X == 0 && Y == 0){
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == columns - 1 && Y == 0){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == 0 && Y == rows - 1){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == columns - 1 && Y == rows - 1){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if (X == 0){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }    
                        }else if (Y == 0){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X+1][Y] == 1){
                                life[X][Y] ++; 
                            }
                        }else if(X == columns - 1){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X-1][Y] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                        }else if(Y == rows - 1){
                            if(board[X-1][Y] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y]++;
                            }
                        }else{
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++; 
                            }
                        }
                    }else if(board[X][Y] == 0){
                        if(X == 0 && Y == 0){
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == columns - 1 && Y == 0){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == 0 && Y == rows - 1){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                        }else if(X == columns - 1 && Y == rows - 1){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                        }else if (X == 0){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++;
                            }    
                        }else if (Y == 0){
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X+1][Y] == 1){
                                life[X][Y] ++; 
                            }
                        }else if(X == columns - 1){
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++;
                            }
                            if(board[X-1][Y-1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X-1][Y] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                life[X][Y] ++; 
                            }
                        }else if(Y == rows - 1){
                            if(board[X-1][Y] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y]++;
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y]++;
                            }
                        }else{
                            if(board[X-1][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y-1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X+1][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X-1][Y+1] == 1){
                                 life[X][Y] ++; 
                            }
                            if(board[X-1][Y] == 1){
                                 life[X][Y] ++; 
                            }
                        }
                    }
                    //System.out.println(X+","+Y+" "+board[X][Y]+" "+life[X][Y]); debugging for interactions
                }
            }
            for (int X=0;X<columns;X++){
                for (int Y=0;Y<rows;Y++){
                    if(board[X][Y] == 1){
                        switch (life[X][Y]){
                            case 0 : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                            case 1 : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                            case 2 :  board[X][Y] = 1;
                                    life[X][Y] = 0;
                                break;
                            case 3 :  board[X][Y] = 1;
                                    life[X][Y] = 0;
                                break;
                            default : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                        }
                    }else if(board[X][Y] == 0){
                        switch ( life[X][Y]){
                            case 0 : board[X][Y] = 0;
                                   life[X][Y] = 0;
                                break;
                            case 1 : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                            case 2 : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                            case 3 : board[X][Y] = 1;
                                    life[X][Y] = 0;
                                break;
                            default : board[X][Y] = 0;
                                    life[X][Y] = 0;
                                break;
                        }
                    }
                    }
            }
        }
    }
}