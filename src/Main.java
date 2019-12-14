import java.awt.BorderLayout;

import javax.swing.JFrame;

import Board.Board;
import DataLoader.DataLoader;

public class Main {
	
	public static void main(String[] args)
	{
		JFrame window = new JFrame(); 
		Board board = new Board();
       
		window.add(board, BorderLayout.CENTER);
		window.setSize(1000, 1000);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
		DataLoader.loader();
	}
}
