package drawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DrawTriangle implements IDraw{

	private double[] X = new double[3];
	private double[] Y = new double[3];
	private Color color;
	
	public DrawTriangle(double[] X, double[] Y) 
	{
		this.X = X;
		this.Y = Y;
		Random random = new Random();
		this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
	}

	@Override
	public void draw(Graphics g) 
	{
		g.setColor(this.color);
		int[] X = new int[3];
		int[] Y = new int[3];
		
		for(int i = 0; i < 3; i++)
		{
			X[i] = (int) this.X[i];
			Y[i] = (int) this.Y[i];
		}
		g.drawPolygon(X, Y, 3);
		
	}


}
