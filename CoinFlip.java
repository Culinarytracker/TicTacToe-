package com.carl.tictactoe;

import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class CoinFlip extends JFrame {
private double rand;
private boolean flip;

JFrame coinFrame = new JFrame("Coin Toss");
JPanel coinPanel = new JPanel();
JLabel coinLabel = new JLabel("Choose to see who goes first.");
JButton heads = new JButton("Heads");
JLabel or = new JLabel("or");
JButton tails = new JButton("Tails");
JButton ok = new JButton("OK");

public CoinFlip() {
	coinPanel.add(coinLabel);
	coinPanel.add(heads);
	coinPanel.add(or);
	coinPanel.add(tails);
	coinFrame.add(coinPanel);
	coinFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	coinFrame.setSize(200, 125);
	coinFrame.setVisible(true);
	coinFrame.setLocation(500, 335);
	coinFrame.setResizable(false);
	coinFrame.setAlwaysOnTop(true);
	flipCoin();
	heads.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
		    if (flip){
		    	coinPanel.remove(heads);
		    	coinPanel.remove(tails);
		    	MainFrame.pChar='X';
		    	MainFrame.cChar='O';
		    	coinLabel.setText("     Heads it is. You win!  ");
		    	or.setText("                  You Go First             ");
		    	coinPanel.add(ok);
		    	coinPanel.repaint();
		    	
		    	
		    }else if (!flip){
		    	coinPanel.remove(heads);
		    	coinPanel.remove(tails);
		    	MainFrame.pChar='O';
		    	MainFrame.cChar='X';
		    	coinLabel.setText("       Nope, it's Tails.    ");
		    	or.setText("              Computer Goes First             ");
		    	coinPanel.add(ok);
		    	coinPanel.repaint();
		    	MainFrame.playerTurn = false;
		    	MainFrame.cntrl = 2;
		    	new CompPlay();
		    	
		    }
		    MainFrame.cntrl = 2;
		}
	
	});
	tails.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
		    if (!flip){
		    	coinPanel.remove(heads);
		    	coinPanel.remove(tails);
		    	MainFrame.pChar='X';
		    	MainFrame.cChar='O';
		    	coinLabel.setText("       Tails it is. You win!");
		    	or.setText("                   You Go First           ");
		    	coinPanel.add(ok);
		    	coinPanel.repaint();
		    	MainFrame.cntrl = 2;
		    	
		    }else if (flip){
		    	coinPanel.remove(heads);
		    	coinPanel.remove(tails);
		    	MainFrame.pChar='O';
		    	MainFrame.cChar='X';
		    	coinLabel.setText("         Nope, it's Heads.     ");
		    	or.setText("                Computer Goes First             ");
		    	coinPanel.add(ok);
		    	coinPanel.repaint();
		    	MainFrame.playerTurn = false;
		    	MainFrame.cntrl = 2;
		    	new CompPlay();
		    }
		}
		
	});
    ok.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			coinFrame.dispose();
		}
    	
    });
}

 
private boolean flipCoin(){  //simple random number to flip coin
	rand = Math.random();
	if (rand < .5){
		flip = true;
	}else flip = false;
	return flip;
}
}
