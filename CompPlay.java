
package com.carl.tictactoe;

public class CompPlay {
static int[] gameState={MainFrame.nwState, MainFrame.nState, MainFrame.neState ,MainFrame.wState, MainFrame.cState, MainFrame.eState, MainFrame.swState, MainFrame.sState, MainFrame.seState};

public CompPlay(){
	refreshArray();
	for (int i = 0; i < gameState.length; i++) {
		System.out.println(gameState[i]);
	} 
	
	
	if (!MainFrame.playerTurn){
		//if first move
			//if blank board
		if ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8])){
			chooseCorner();
		    System.out.println("board clear, new game, choosing random corner");
			
			
			//if any one corner is selected
		} else if (((1 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(1 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(1 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(1 == gameState[8]))){
			 compMove(4);
			 System.out.println("one player corner taken, choosing center");
		
		    //if any one side is taken
		}else if (((0 == gameState[0])&&(1 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(1 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(1 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8]))||
				   ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(0 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(1 == gameState[7])&&(0 == gameState[8]))){
			compMove(4);
			System.out.println("one player square on side, choosing center");
		    //if center is taken
		} else if ((0 == gameState[0])&&(0 == gameState[1])&&(0 == gameState[2])&&(0 == gameState[3])&&(1 == gameState[4])&&(0 == gameState[5])&&(0 == gameState[6])&&(0 == gameState[7])&&(0 == gameState[8])){
			chooseCorner();
			System.out.println("center taken, choosing random corner");
			
			
		//if someone is about to win	
			
//if computer is about to win
			
			//on top row
					} else if (((2 == gameState[0])&&(2 == gameState[1])&&(0 == gameState[2])) || ((2 == gameState[0])&&(0 == gameState[1])&&(2 == gameState[2])) || ((0 == gameState[0])&&(2 == gameState[1])&&(2 == gameState[2]))){
							if ((2 == gameState[0])&&(2 == gameState[1])&&(0 == gameState[2])){
								System.out.println("I can win, playing ne");
								compMove(2);
							} else if ((2 == gameState[0])&&(0 == gameState[1])&&(2 == gameState[2])){
								System.out.println("I can win, playing n");
								compMove(1);
							} else if ((0 == gameState[0])&&(2 == gameState[1])&&(2 == gameState[2])){
								System.out.println("I can win, playing nw");
								compMove(0);
							}//end top row if statement
							
						//on middle row
					} else if (((2 == gameState[3])&&(2 == gameState[4])&&(0 == gameState[5])) || ((2 == gameState[3])&&(0 == gameState[4])&&(2 == gameState[5])) || ((0 == gameState[3])&&(2 == gameState[4])&&(2 == gameState[5]))){
						if ((2 == gameState[3])&&(2 == gameState[4])&&(0 == gameState[5])){
							System.out.println("I can win, playing e");
							compMove(5);
						} else if ((2 == gameState[3])&&(0 == gameState[4])&&(2 == gameState[5])){
							System.out.println("I can win, playing c");
							compMove(4);
						} else if ((0 == gameState[3])&&(2 == gameState[4])&&(2 == gameState[5])){
							System.out.println("I can win, playing w");
							compMove(3);
						}//end middle row if statement
						
						//on bottom row
					} else if (((2 == gameState[6])&&(2 == gameState[7])&&(0 == gameState[8])) || ((2 == gameState[6])&&(0 == gameState[7])&&(2 == gameState[8])) || ((0 == gameState[6])&&(2 == gameState[7])&&(2 == gameState[8]))){
						if ((2 == gameState[6])&&(2 == gameState[7])&&(0 == gameState[8])){
							System.out.println("I can win, playing se");
							compMove(8);
						} else if ((2 == gameState[6])&&(0 == gameState[7])&&(2 == gameState[8])){
							System.out.println("I can win, playing s");
							compMove(7);
						} else if ((0 == gameState[6])&&(2 == gameState[7])&&(2 == gameState[8])){
							System.out.println("I can win, playing sw");
							compMove(6);
						}//end bottom row if statement
						
						//on left column
					} else if (((2 == gameState[0])&&(2 == gameState[3])&&(0 == gameState[6])) || ((2 == gameState[0])&&(0 == gameState[3])&&(2 == gameState[6])) || ((0 == gameState[0])&&(2 == gameState[3])&&(2 == gameState[6]))){
						if ((2 == gameState[0])&&(2 == gameState[3])&&(0 == gameState[6])){
							System.out.println("I can win, playing sw");
							compMove(6);
						} else if ((2 == gameState[0])&&(0 == gameState[3])&&(2 == gameState[6])){
							System.out.println("I can win, playing w");
							compMove(3);
						} else if ((0 == gameState[0])&&(2 == gameState[3])&&(2 == gameState[6])){
							System.out.println("I can win, playing nw");
							compMove(0);
						}//end left column if statement
						
						//on center column
					} else if (((2 == gameState[1])&&(2 == gameState[4])&&(0 == gameState[7])) || ((2 == gameState[1])&&(0 == gameState[4])&&(2 == gameState[7])) || ((0 == gameState[1])&&(2 == gameState[4])&&(2 == gameState[7]))){
						if ((2 == gameState[1])&&(2 == gameState[4])&&(0 == gameState[7])){
							System.out.println("I can win, playing s");
							compMove(7);
						} else if ((2 == gameState[1])&&(0 == gameState[4])&&(2 == gameState[7])){
							System.out.println("I can win, playing c");
							compMove(4);
						} else if ((0 == gameState[1])&&(2 == gameState[4])&&(2 == gameState[7])){
							System.out.println("I can win, playing n");
							compMove(1);
						}//end center column if statement
						
						//on right column
					} else if (((2 == gameState[2])&&(2 == gameState[5])&&(0 == gameState[8])) || ((2 == gameState[2])&&(0 == gameState[5])&&(2 == gameState[8])) || ((0 == gameState[2])&&(2 == gameState[5])&&(2 == gameState[8]))){
						if ((2 == gameState[2])&&(2 == gameState[5])&&(0 == gameState[8])){
							System.out.println("I can win, playing se");
							compMove(8);
						} else if ((2 == gameState[2])&&(0 == gameState[5])&&(2 == gameState[8])){
							System.out.println("I can win, playing e");
							compMove(5);
						} else if ((0 == gameState[2])&&(2 == gameState[5])&&(2 == gameState[8])){
							System.out.println("I can win, playing ne");
							compMove(2);
						}//end right column if statement
						
						//on nw-se diagonal
					} else if (((2 == gameState[0])&&(2 == gameState[4])&&(0 == gameState[8])) || ((2 == gameState[0])&&(0 == gameState[4])&&(2 == gameState[8])) || ((0 == gameState[0])&&(2 == gameState[4])&&(2 == gameState[8]))){
						if ((2 == gameState[0])&&(2 == gameState[4])&&(0 == gameState[8])){
							System.out.println("I can win, playing se");
							compMove(8);
						} else if ((2 == gameState[0])&&(0 == gameState[4])&&(2 == gameState[8])){
							System.out.println("I can win, playing c");
							compMove(4);
						} else if ((0 == gameState[0])&&(2 == gameState[4])&&(2 == gameState[8])){
							System.out.println("I can win, playing nw");
							compMove(0);
						}//end nw-se diagonal if statement
						
						//on ne-sw diagonal
					} else if (((2 == gameState[2])&&(2 == gameState[4])&&(0 == gameState[6])) || ((2 == gameState[2])&&(0 == gameState[4])&&(2 == gameState[6])) || ((0 == gameState[2])&&(2 == gameState[4])&&(2 == gameState[6]))){
						if ((2 == gameState[2])&&(2 == gameState[4])&&(0 == gameState[6])){
							System.out.println("I can win, playing sw");
							compMove(6);
						} else if ((2 == gameState[2])&&(0 == gameState[4])&&(2 == gameState[6])){
							System.out.println("I can win, playing c");
							compMove(4);
						} else if ((0 == gameState[2])&&(2 == gameState[4])&&(2 == gameState[6])){
							System.out.println("I can win, playing ne");
							compMove(2);
						}//end ne-sw diagonal if statement
						
						// end of if computer is about to win statements
			
			//if player about to win
			
			//on top row
		} else if (((1 == gameState[0])&&(1 == gameState[1])&&(0 == gameState[2])) || ((1 == gameState[0])&&(0 == gameState[1])&&(1 == gameState[2])) || ((0 == gameState[0])&&(1 == gameState[1])&&(1 == gameState[2]))){
				if ((1 == gameState[0])&&(1 == gameState[1])&&(0 == gameState[2])){
					compMove(2);
					System.out.println("they almost won, blocking on ne");
				} else if ((1 == gameState[0])&&(0 == gameState[1])&&(1 == gameState[2])){
					compMove(1);
					System.out.println("they almost won, blocking on n");
				} else if ((0 == gameState[0])&&(1 == gameState[1])&&(1 == gameState[2])){
					compMove(0);
					System.out.println("they almost won, blocking on nw");
				}//end top row if statement
				
			//on middle row
		} else if (((1 == gameState[3])&&(1 == gameState[4])&&(0 == gameState[5])) || ((1 == gameState[3])&&(0 == gameState[4])&&(1 == gameState[5])) || ((0 == gameState[3])&&(1 == gameState[4])&&(1 == gameState[5]))){
			if ((1 == gameState[3])&&(1 == gameState[4])&&(0 == gameState[5])){
				compMove(5);
				System.out.println("they almost won, blocking on e");
			} else if ((1 == gameState[3])&&(0 == gameState[4])&&(1 == gameState[5])){
				compMove(4);
				System.out.println("they almost won, blocking on c");
			} else if ((0 == gameState[3])&&(1 == gameState[4])&&(1 == gameState[5])){
				compMove(3);
				System.out.println("they almost won, blocking on w");
			}//end middle row if statement
			
			//on bottom row
		} else if (((1 == gameState[6])&&(1 == gameState[7])&&(0 == gameState[8])) || ((1 == gameState[6])&&(0 == gameState[7])&&(1 == gameState[8])) || ((0 == gameState[6])&&(1 == gameState[7])&&(1 == gameState[8]))){
			if ((1 == gameState[6])&&(1 == gameState[7])&&(0 == gameState[8])){
				compMove(8);
				System.out.println("they almost won, blocking on se");
			} else if ((1 == gameState[6])&&(0 == gameState[7])&&(1 == gameState[8])){
				compMove(7);
				System.out.println("they almost won, blocking on s");
			} else if ((0 == gameState[6])&&(1 == gameState[7])&&(1 == gameState[8])){
				compMove(6);
				System.out.println("they almost won, blocking on sw");
			}//end bottom row if statement
			
			//on left column
		} else if (((1 == gameState[0])&&(1 == gameState[3])&&(0 == gameState[6])) || ((1 == gameState[0])&&(0 == gameState[3])&&(1 == gameState[6])) || ((0 == gameState[0])&&(1 == gameState[3])&&(1 == gameState[6]))){
			if ((1 == gameState[0])&&(1 == gameState[3])&&(0 == gameState[6])){
				compMove(6);
				System.out.println("they almost won, blocking on sw");
			} else if ((1 == gameState[0])&&(0 == gameState[3])&&(1 == gameState[6])){
				compMove(3);
				System.out.println("they almost won, blocking on w");
			} else if ((0 == gameState[0])&&(1 == gameState[3])&&(1 == gameState[6])){
				compMove(0);
				System.out.println("they almost won, blocking on nw");
			}//end left column if statement
			
			//on center column
		} else if (((1 == gameState[1])&&(1 == gameState[4])&&(0 == gameState[7])) || ((1 == gameState[1])&&(0 == gameState[4])&&(1 == gameState[7])) || ((0 == gameState[1])&&(1 == gameState[4])&&(1 == gameState[7]))){
			if ((1 == gameState[1])&&(1 == gameState[4])&&(0 == gameState[7])){
				compMove(7);
				System.out.println("they almost won, blocking on s");
			} else if ((1 == gameState[1])&&(0 == gameState[4])&&(1 == gameState[7])){
				compMove(4);
				System.out.println("they almost won, blocking on c");
			} else if ((0 == gameState[1])&&(1 == gameState[4])&&(1 == gameState[7])){
				compMove(1);
				System.out.println("they almost won, blocking on n");
			}//end center column if statement
			
			//on right column
		} else if (((1 == gameState[2])&&(1 == gameState[5])&&(0 == gameState[8])) || ((1 == gameState[2])&&(0 == gameState[5])&&(1 == gameState[8])) || ((0 == gameState[2])&&(1 == gameState[5])&&(1 == gameState[8]))){
			if ((1 == gameState[2])&&(1 == gameState[5])&&(0 == gameState[8])){
				compMove(8);
				System.out.println("they almost won, blocking on se");
			} else if ((1 == gameState[2])&&(0 == gameState[5])&&(1 == gameState[8])){
				compMove(5);
				System.out.println("they almost won, blocking on e");
			} else if ((0 == gameState[2])&&(1 == gameState[5])&&(1 == gameState[8])){
				compMove(2);
				System.out.println("they almost won, blocking on ne");
			}//end right column if statement
			
			//on nw-se diagonal
		} else if (((1 == gameState[0])&&(1 == gameState[4])&&(0 == gameState[8])) || ((1 == gameState[0])&&(0 == gameState[4])&&(1 == gameState[8])) || ((0 == gameState[0])&&(1 == gameState[4])&&(1 == gameState[8]))){
			if ((1 == gameState[0])&&(1 == gameState[4])&&(0 == gameState[8])){
				compMove(8);
				System.out.println("they almost won, blocking on se");
			} else if ((1 == gameState[0])&&(0 == gameState[4])&&(1 == gameState[8])){
				compMove(4);
				System.out.println("they almost won, blocking on c");
			} else if ((0 == gameState[0])&&(1 == gameState[4])&&(1 == gameState[8])){
				compMove(0);
				System.out.println("they almost won, blocking on nw");
			}//end nw-se diagonal if statement
			
			//on ne-sw diagonal
		} else if (((1 == gameState[2])&&(1 == gameState[4])&&(0 == gameState[6])) || ((1 == gameState[2])&&(0 == gameState[4])&&(1 == gameState[6])) || ((0 == gameState[2])&&(1 == gameState[4])&&(1 == gameState[6]))){
			if ((1 == gameState[2])&&(1 == gameState[4])&&(0 == gameState[6])){
				compMove(6);
				System.out.println("they almost won, blocking on sw");
			} else if ((1 == gameState[2])&&(0 == gameState[4])&&(1 == gameState[6])){
				compMove(4);
				System.out.println("they almost won, blocking on c");
			} else if ((0 == gameState[2])&&(1 == gameState[4])&&(1 == gameState[6])){
				compMove(2);
				System.out.println("they almost won, blocking on ne");
			}//end ne-sw diagonal if statement
			
			// end of if player is about to win statements
			
			
			//end of if anyone is about to win statements.
					
					//for when all squares !=0
					}else if (((1 == gameState[0])||(2==gameState[0]))&&((1 == gameState[1])||(2==gameState[1]))&&((1 == gameState[2])||(2==gameState[2]))&&((1 == gameState[3])||(2==gameState[3]))&&((1 == gameState[4])||(2==gameState[4]))&&((1 == gameState[5])||(2==gameState[5]))&&((1 == gameState[6])||(2==gameState[6]))&&((1 == gameState[7])||(2==gameState[7]))&&((1 == gameState[8])||(2==gameState[8]))){
						System.out.println("all square occupied. running isWin()");
						new IsWin();
					}else chooseRandom();
	} 
	//end of all if statements
}



public static void chooseCorner(){ // generates random number 0-3 and uses it to pick a corner that is not already occupied, then passes that number to the compMove method
	int cornerChoice;
	boolean control = true;
	
			
	while (control){
	cornerChoice = (int) (Math.random()*4);
	System.out.println("chose random corner " + cornerChoice + "0=nw, 1=ne, 2=sw, 3=se");
	if ((cornerChoice == 0) && (gameState[0]==0)) {
		control = false;
		compMove(0);
	}else if ((cornerChoice == 1) && (gameState[2]==0)) {
		control = false;
		compMove(2);
	}else if ((cornerChoice == 2) && (gameState[6]==0)) {
		control = false;
		compMove(6);
	}else if ((cornerChoice == 3) && (gameState[8]==0)) {
		control = false;
		compMove(8);
	}else {
		control = true;
	}
	}//end while loop
}//end of chooseCorner()



public static void chooseRandom(){    //generates random number 0-8 and passes that number to the compMove() method
	
	int randChoice;
	boolean control = true;
	
			
	while (control){
	randChoice = (int) (Math.random()*9);
	System.out.println("randChoice() chose " + randChoice);
	if ((randChoice == 0) && (gameState[0]==0)) {
		control = false;
		compMove(0);
	}else if ((randChoice == 1) && (gameState[1]==0)) {
		control = false;
		compMove(1);
	}else if ((randChoice == 2) && (gameState[2]==0)) {
		control = false;
		compMove(2);
	}else if ((randChoice == 3) && (gameState[3]==0)) {
		control = false;
		compMove(3);
	}else if ((randChoice == 4) && (gameState[4]==0)) {
		control = false;
		compMove(4);
	}else if ((randChoice == 5) && (gameState[5]==0)) {
		control = false;
		compMove(5);
	}else if ((randChoice == 6) && (gameState[6]==0)) {
		control = false;
		compMove(6);
	}else if ((randChoice == 7) && (gameState[7]==0)) {
		control = false;
		compMove(7);
	}else if ((randChoice == 8) && (gameState[8]==0)) {
		control = false;
		compMove(8);
	}
	}//end while loop
}//end of chooseRandom()

public static void compMove(int a){  //executes all state changes and makes it's move
	
	
	
	//if selected integer == this number, 
	//put the computers character in the button text (X or O)
	//change button state to 2
	//return playerTurn to the player
	//remove action listener from button.
	//check to see if there is a winner
	
	
	if (a == 0){
		MainFrame.nw.setText(String.valueOf(MainFrame.cChar));
		MainFrame.nwState = 2;
		MainFrame.playerTurn=true;
		MainFrame.nw.removeActionListener(null);
        new IsWin();
	} else if (a == 1){
		MainFrame.n.setText(String.valueOf(MainFrame.cChar));
		MainFrame.nState = 2;
		MainFrame.playerTurn=true;
		MainFrame.n.removeActionListener(null);
        new IsWin();
	} else if (a == 2){
		MainFrame.ne.setText(String.valueOf(MainFrame.cChar));
		MainFrame.neState = 2;
		MainFrame.playerTurn=true;
		MainFrame.ne.removeActionListener(null);
        new IsWin();
	} else if (a == 3){
		MainFrame.w.setText(String.valueOf(MainFrame.cChar));
		MainFrame.wState = 2;
		MainFrame.playerTurn=true;
		MainFrame.w.removeActionListener(null);
        new IsWin();
	} else if (a == 4){
		MainFrame.c.setText(String.valueOf(MainFrame.cChar));
		MainFrame.cState = 2;
		MainFrame.playerTurn=true;
		MainFrame.c.removeActionListener(null);
        new IsWin();
	} else if (a == 5){
		MainFrame.e.setText(String.valueOf(MainFrame.cChar));
		MainFrame.eState = 2;
		MainFrame.playerTurn=true;
		MainFrame.e.removeActionListener(null);
        new IsWin();
	} else if (a == 6){
		MainFrame.sw.setText(String.valueOf(MainFrame.cChar));
		MainFrame.swState = 2;
		MainFrame.playerTurn=true;
		MainFrame.sw.removeActionListener(null);
        new IsWin();
	} else if (a == 7){
		MainFrame.s.setText(String.valueOf(MainFrame.cChar));
		MainFrame.sState = 2;
		MainFrame.playerTurn=true;
		MainFrame.s.removeActionListener(null);
        new IsWin();
	} else if (a == 8){
		MainFrame.se.setText(String.valueOf(MainFrame.cChar));
		MainFrame.seState = 2;
		MainFrame.playerTurn=true;
		MainFrame.se.removeActionListener(null);
        new IsWin();
	} 
}//end of compMove()


public static void refreshArray(){   //refreshes the array with the game changes each click.
	//update array values.
	gameState[0]=MainFrame.nwState;
	gameState[1]=MainFrame.nState;
	gameState[2]=MainFrame.neState;
	gameState[3]=MainFrame.wState;
	gameState[4]=MainFrame.cState;
	gameState[5]=MainFrame.eState;
	gameState[6]=MainFrame.swState;
	gameState[7]=MainFrame.sState;
	gameState[8]=MainFrame.seState;
	
}

/*public static void pause(int x){
	try {
	    Thread.sleep(x);
	} catch(InterruptedException ex) {
	    Thread.currentThread().interrupt();
	}
}*/


}//end of CompPlay class.

