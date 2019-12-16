package Board;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JPanel;

import DataLoader.DataLoader;
import Figures.Circle;
import Figures.IFigure;
import Figures.Rectangle;
import Figures.Triangle;
import drawFigures.DrawCircle;
import drawFigures.IDraw;

public class Board extends JPanel{

	private List<IFigure> figures = new ArrayList();
	
	public Board()
	{
		/*Random random = new Random();
		double[] center = new double[2];
		center[0] = random.nextInt(800) + 5;
		center[1] = random.nextInt(800) + 5;
		//figures.add(new Circle(random.nextInt(150) + 50, center));
		
		double[] X1 = new double[2];
		X1[0] = random.nextInt(800) + 5;
		X1[1] = random.nextInt(800) + 5;
		//figures.add(new Rectangle(X1, random.nextInt(150) + 50, random.nextInt(150) + 50));
		
		double[] X = new double[3];
		X[0] = random.nextInt(800) + 5;
		X[1] = random.nextInt(800) + 5;
		X[2] = random.nextInt(800) + 5;
		
		double[] Y = new double[3];
		Y[0] = random.nextInt(800) + 5;
		Y[1] = random.nextInt(800) + 5;
		Y[2] = random.nextInt(800) + 5;*/
		//figures.add(new Triangle(X, Y));
		figures = DataLoader.loader();
	}
	
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);

        for(int i = 0; i < figures.size(); i++)
        	figures.get(i).drawFigure(g);
    }
	
	
}
