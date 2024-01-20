package uu.edu.csc125;
import java.util.Scanner;

public class TicTacToe {


    public TicTacToe() { 
        
    char[][] board = new char[3][3]; //create 3x3 array

    for(int i=0;i<3;i++) 
		for(int j=0;j<3;j++)
				board[0][0] = '1'; //initialize board with blanks to be filled
                board[0][1] = '2';
                board[0][2] = '3';
                board[1][0] = '4';
                board[1][1] = '5';
                board[1][2] = '6';
                board[2][0] = '7';
                board[2][1] = '8';
                board[2][2] = '9';

                

                char winner = Game(board);			// play the game and get the winner ('X', 'O' or ' ' for draw)
                printBoard(board);							// display the final grid
                if(winner=='X') System.out.println("X wins!");	// output the winner
                else if(winner=='O') System.out.println("O wins!");
                else System.out.println("Its a draw");
    
    }

    public char Game(char[][] board){

        Scanner in = new Scanner(System.in);
        int count = 0;

        char winner = ' ';
        int choice;
        
        char turn = 'X';

        while(winner!='X'&&winner!='O'&&count<9)	// while no one has won and not yet a draw
		{
			printBoard(board);							// display the tic tac toe grid
			choice = getInput(board, turn, in);	// get user's choice, data verified
			board[(choice)/3][(choice)%3] = turn;	// fill in the user's choice with the appropriate letter ('X' or 'O')
			winner = checkForWinner(board);			// now see if anyone has won yet, checkForWinner returns 'X', 'O' or ' '
			count++;							// we have now done 1 more turn, count is used to determine draws
			if(turn=='X') turn = 'O';			
			else turn = 'X';
		}
		return winner;
	}

    
    

                public static char checkForWinner(char[][] board)		// there are 8 possible winners, we check to see if the character in any row, column or diagonal is the same and not ' '
                {													// if the character is ' ' then its not a winner because any ' ' entries are empty squares
                    if(board[0][0]==board[0][1]&&board[0][1]==board[0][2]&&board[0][0]!=' ') return board[0][0];		// upon a match, return the character found in one of those squares
                    else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2]&&board[1][0]!=' ') return board[1][0];
                    else if(board[2][0]==board[2][1]&&board[2][1]==board[2][2]&&board[2][0]!=' ') return board[2][0];
                    else if(board[0][0]==board[1][0]&&board[1][0]==board[2][0]&&board[0][0]!=' ') return board[0][0];
                    else if(board[0][1]==board[1][1]&&board[1][1]==board[2][1]&&board[0][1]!=' ') return board[0][1];
                    else if(board[0][2]==board[1][2]&&board[1][2]==board[2][2]&&board[0][2]!=' ') return board[0][2];
                    else if(board[0][0]==board[1][1]&&board[1][1]==board[2][2]&&board[0][0]!=' ') return board[0][0];
                    else if(board[0][2]==board[1][1]&&board[1][1]==board[2][0]&&board[0][2]!=' ') return board[0][2];
                    else return ' ';								// no winner yet
	}



                public void printBoard(char[][] board) {

                    
                    //Row0
                        System.out.println("    _______________________");            
                    //row1 
                    System.out.println("   |       |       |       |");
                    //row2      
                    System.out.println("   |   "   + board[0][0] +    "   |   "   + board[0][1] +    "   |   "  + board[0][2] +    "   |"); 
                    //row3
                        System.out.println("   |_______|_______|_______|");
                    //row4
                    System.out.println("   |       |       |       |");
                    //row5
                        System.out.println("   |   "   + board[1][0] +    "   |   "   + board[1][1] +    "   |   "  + board[1][2] +    "   |");
                    //row6
                        System.out.println("   |_______|_______|_______|");
                    //row7
                    System.out.println("   |       |       |       |");
                    //row8
                        System.out.println("   |   "   + board[2][0] +    "   |   "   + board[2][1] +    "   |   "  + board[2][2] +    "   |"); ;
                    //row9
                        System.out.println("   |_______|_______|_______|");
                        }



                public static int getInput(char[][]board, char turn, Scanner in)		// get the user's choice (1-9), data verify that the choice is legal, and return the value-1 so that
                    {																// we can adjust it to be "carved up" into [0-2][0-2] for array access
                        
                           // int i,j;
                            int input;
		                    do {
		                    System.out.print("Its " + turn + "'s turn, enter your grid coordinate from 1-9   ");
                        
                            input = in.nextInt();

		                                        }while(
                                                    input<1||input>9
                                                    ||board[(input-1)/3][(input-1)%3]!='1'
                                                    &&board[(input-1)/3][(input-1)%3]!='2'
                                                    &&board[(input-1)/3][(input-1)%3]!='3'
                                                    &&board[(input-1)/3][(input-1)%3]!='4'
                                                    &&board[(input-1)/3][(input-1)%3]!='5'
                                                    &&board[(input-1)/3][(input-1)%3]!='6'
                                                    &&board[(input-1)/3][(input-1)%3]!='7'
                                                    &&board[(input-1)/3][(input-1)%3]!='8'
                                                    &&board[(input-1)/3][(input-1)%3]!='9');	// illegal if out of bounds (<1, >9) or the grid location is already filled (not blank)
		                                        return input-1;												// adjust the choice to be on a 0-8 scale instead of 1-9 for easier computation
	}


        
                            
                          
}

      


   

