/**
 * class to run after each move to determine if there is a winner. 
 * looks at each vertical, horizontal and diagonal winning possibility
 * resets the MainFrame variable winner
 */

package com.carl.tictactoe;

public class IsWin {{
		//x wins
	
		//horizontal wins
		if ((1 == MainFrame.nwState) && (1 == MainFrame.nState) && (1 == MainFrame.neState)){
			MainFrame.winner=1;
		} else if ((1 == MainFrame.wState) && (1 == MainFrame.cState) && (1 == MainFrame.eState)){
			MainFrame.winner=1;
		} else if ((1 == MainFrame.swState) && (1 == MainFrame.sState) && (1 == MainFrame.seState)){
			MainFrame.winner=1;
		}  //vertical wins for x
		  else if ((1 == MainFrame.nwState) && (1 == MainFrame.wState) && (1 == MainFrame.swState)){
				MainFrame.winner=1;
		} else if ((1 == MainFrame.nState) && (1 == MainFrame.cState) && (1 == MainFrame.sState)){
			MainFrame.winner=1;
		} else if ((1 == MainFrame.neState) && (1 == MainFrame.eState) && (1 == MainFrame.seState)){
			MainFrame.winner=1;
		} //diagonal wins
		  else if ((1 == MainFrame.nwState) && (1 == MainFrame.cState) && (1 == MainFrame.seState)){
			MainFrame.winner=1;
		} else if ((1 == MainFrame.neState) && (1 == MainFrame.cState) && (1 == MainFrame.swState)){
			MainFrame.winner=1;
		}
		//o wins
		//horizontal wins
		  else if ((2 == MainFrame.nwState) && (2 == MainFrame.nState) && (2 == MainFrame.neState)){
			MainFrame.winner=2;
		} else if ((2 == MainFrame.wState) && (2 == MainFrame.cState) && (2 == MainFrame.eState)){
			MainFrame.winner=2;
		} else if ((2 == MainFrame.swState) && (2 == MainFrame.sState) && (2 == MainFrame.seState)){
			MainFrame.winner=2;
		}  //vertical wins for x
		  else if ((2 == MainFrame.nwState) && (2 == MainFrame.wState) && (2 == MainFrame.swState)){
				MainFrame.winner=2;
		} else if ((2 == MainFrame.nState) && (2 == MainFrame.cState) && (2 == MainFrame.sState)){
			MainFrame.winner=2;
		} else if ((2 == MainFrame.neState) && (2 == MainFrame.eState) && (2 == MainFrame.seState)){
			MainFrame.winner=2;
		} //diagonal wins
		  else if ((2 == MainFrame.nwState) && (2 == MainFrame.cState) && (2 == MainFrame.seState)){
			MainFrame.winner=2;
		} else if ((2 == MainFrame.neState) && (2 == MainFrame.cState) && (2 == MainFrame.swState)){
			MainFrame.winner=2;
			// Tie Detector. checks that every square has been given x or o
		} else if ((2  == MainFrame.nwState || 1 == MainFrame.nwState)&&(2  == MainFrame.nState || 1 == MainFrame.nState)&&(2  == MainFrame.neState || 1 == MainFrame.neState)&&(2  == MainFrame.wState || 1 == MainFrame.wState)&&(2  == MainFrame.cState || 1 == MainFrame.cState)&&(2  == MainFrame.eState || 1 == MainFrame.eState)&&(2  == MainFrame.swState || 1 == MainFrame.swState)&&(2  == MainFrame.sState || 1 == MainFrame.sState)&&(2  == MainFrame.seState || 1 == MainFrame.seState)){
			MainFrame.winner=3;
			} else MainFrame.winner=0;
		
		//CompPlay.pause(800);
		
		//sets winner variable to 1, 2, or three for x, o, or tie. Then removes panel and replaces it with one for end of game.
		if (1 == MainFrame.winner){
			MainFrame.frame.remove(MainFrame.panel);
			MainFrame.frame.add(MainFrame.xWinsPanel);
			MainFrame.frame.repaint();
			
		}else if (2 == MainFrame.winner){
			MainFrame.frame.remove(MainFrame.panel);
		    MainFrame.frame.add(MainFrame.oWinsPanel);
		    MainFrame.frame.repaint();
		}else if (3 == MainFrame.winner){
			MainFrame.frame.remove(MainFrame.panel);
		    MainFrame.frame.add(MainFrame.tiePanel);
		    MainFrame.frame.repaint();
		}

}}
