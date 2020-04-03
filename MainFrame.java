package com.carl.tictactoe;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class MainFrame extends JFrame{

	static JFrame frame = new JFrame("TicTacToe v2.0");
	
	static JPanel panel = new JPanel();
	static JPanel xWinsPanel = new JPanel();
	static JPanel oWinsPanel = new JPanel();
	static JPanel tiePanel = new JPanel();
	
	JLabel xWinLabel = new JLabel("                          Player WINS!                       ");
	JLabel oWinLabel = new JLabel("                          Computer WINS!                       ");
	JLabel tieLabel = new JLabel("                         It's a Tie!                          ");
	
	JButton oplayAgain = new JButton ("Play Again");
	JButton tieAgain = new JButton ("Play Again");
	JButton oexit = new JButton ("Exit");
	JButton tieexit = new JButton ("Exit");
	JButton xplayAgain = new JButton ("Play Again");
	JButton xexit = new JButton ("Exit");
	
	static JButton nw = new JButton("");
	static JButton n = new JButton("");
	static JButton ne = new JButton("");
	static JButton w = new JButton("");
	static JButton c = new JButton("START");
	static JButton e = new JButton("");
	static JButton sw = new JButton("");
	static JButton s = new JButton("");
	static JButton se = new JButton("");
	
	static int cntrl;
	
	static int nwState = 0;
	static int nState = 0;
	static int neState = 0;
	static int wState = 0;
	static int cState = 0;
	static int eState = 0;
	static int swState = 0;
	static int sState = 0;
	static int seState = 0;
	
	static int winner = 0;
	
	static boolean playerTurn = true;
	static int player = 0;
	static char pChar;
	static char cChar;
	
	//Main Window Constructor
	public MainFrame(){
		
		//construct main game panel
		panel.setLayout(new GridLayout(3,3));
		panel.add(nw);
		panel.add(n);
		panel.add(ne);
		panel.add(w);
		panel.add(c);
		panel.add(e);
		panel.add(sw);
		panel.add(s);
		panel.add(se);
		
		//construct xwins panel
		xWinsPanel.add(xWinLabel);
		xWinsPanel.add(xplayAgain);
		xWinsPanel.add(xexit);
		
		//construct owins panel
		oWinsPanel.add(oWinLabel);
		oWinsPanel.add(oplayAgain);
		oWinsPanel.add(oexit);
		
		//construct tie panel
		tiePanel.add(tieLabel);
		tiePanel.add(tieAgain);
		tiePanel.add(tieexit);
		
		//construct main game frame
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setResizable(false);
		frame.setLocation(450, 250);
		frame.setVisible(true);
		
		//set actionListener for all 9 buttons
		c.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				
				if (cntrl != 2){
				c.setText("");
				
				new CoinFlip();
				
			    
			    }
				else if (cntrl == 2) {
					//if blank and player 1 turn
		    	    if (cState == 0 && playerTurn == true){
		    	    	c.setText(String.valueOf(pChar));
		    		    cState = 1;
		    		    playerTurn=false;
		    		    c.removeActionListener(null);
		    		    new IsWin();
		    		    new CompPlay();
		    	    }  
		    			
		    	    }   
		        }
			
		});
		nw.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				if (cntrl == 2) {
				if (nwState == 0 && playerTurn == true){
		    	    	nw.setText(String.valueOf(pChar));
		    		    nwState = 1;
		    		    playerTurn=false;
		    		    new IsWin();
		    		    new CompPlay();
		    	    } 
		    			
		    	    }   
			}
			
		});
		n.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				if (cntrl == 2) {
				if (nState == 0 && playerTurn == true){
		    	    	n.setText(String.valueOf(pChar));
		    		    nState = 1;
		    		    playerTurn=false;
		    		    new IsWin();
		    		    new CompPlay();
		    	    } 
		    			
		    	    }   
			}
			
		});
		ne.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				if (cntrl == 2) {
				if (neState == 0 && playerTurn == true){
		    	    	ne.setText(String.valueOf(pChar));
		    		    neState = 1;
		    		    playerTurn=false;
		    		    new IsWin();
		    		    new CompPlay();
		    	    } 
		    			
		    	    }   
			}
			
		});
		w.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent arg0) {
		if (cntrl == 2) {
		if (wState == 0 && playerTurn == true){
    	    	w.setText(String.valueOf(pChar));
    		    wState = 1;
    		    playerTurn=false;
    		    new IsWin();
    		    new CompPlay();
    	    }
    			
    	    }   
	}
	
});
		e.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent arg0) {
		if (cntrl == 2) {
		if (eState == 0 && playerTurn == true){
    	    	e.setText(String.valueOf(pChar));
    		    eState = 1;
    		    playerTurn=false;
    		    new IsWin();
    		    new CompPlay();
    	    }
    			
    	    }   
	}
	
});
		sw.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent arg0) {
		if (cntrl == 2) {
		if (swState == 0 && playerTurn == true){
    	    	sw.setText(String.valueOf(pChar));
    		    swState = 1;
    		    playerTurn=false;
    		    new IsWin();
    		    new CompPlay();
    	    }
    			
    	    }   
	}    
	
});
		s.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent arg0) {
		if (cntrl == 2) {
		if (sState == 0 && playerTurn == true){
    	    	s.setText(String.valueOf(pChar));
    		    sState = 1;
    		    playerTurn=false;
    		    new IsWin();
    		    new CompPlay();
    	    }
    			
    	    }   
	}
	
});
		se.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent arg0) {
		if (cntrl == 2) {
		if (seState == 0 && playerTurn == true){
    	    	se.setText(String.valueOf(pChar));
    		    seState = 1;
    		    playerTurn=false;
    		    new IsWin();
    		    new CompPlay();
    	    }
    			
    	    }   
	}
	
});
		
		//set actionListener for owins panel buttons
		oexit.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();   
			}
			
		});
		oplayAgain.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				TicTacToe.again=true;
				frame.remove(oWinsPanel);
				resetAll();
				frame.add(panel);
				frame.repaint();
				
			}
		
		});
		
		//set actionListener for xwins panel buttons
		xplayAgain.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				TicTacToe.again=true;
				frame.remove(xWinsPanel);
				resetAll();
				frame.add(panel);
				frame.repaint();
				
			}
		
		});
		xexit.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();   
			}
			
		});
		
		//set actionListener for tie panel buttons
		tieAgain.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent arg0) {
				TicTacToe.again=true;
				frame.remove(tiePanel);
				resetAll();
				frame.add(panel);
				frame.repaint();
			}
		
		});
		tieexit.addActionListener(new ActionListener(){

			
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();   
			}
			
		});
	}
	public void resetAll(){
		
		//resets coin flip control variable so it goes back to start screen
		cntrl = 0;
		
		//resets all buttons to new game state
		nwState = 0;
		nState = 0;
		 neState = 0;
		 wState = 0;
		cState = 0;
		eState = 0;
		swState = 0;
		sState = 0;
		seState = 0;
		
		//removes all x's and o's and replaces "START" on center button
		nw.setText("");
		n.setText("");
		ne.setText("");
		w.setText("");
		c.setText("START");
		e.setText("");
		sw.setText("");
		s.setText("");
		se.setText("");
		
		//resets winner to new game state
		winner = 0;
		
		//resets player turn to new game state
		playerTurn = true;
	}
	
	
}
