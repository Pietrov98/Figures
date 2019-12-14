package drawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class DrawRectangle implements IDraw{
	
	private double[] X1 = new double[2]; //lewy gorny rog
	private double height;
	private double width;
	private Color color;
	
	public DrawRectangle(double[] X1, double width, double height)
	{
		Random random = new Random();
		this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
		this.X1 = X1;
		this.height = height;
		this.width = width;
	}
	
	@Override
	public void draw(Graphics g) 
	{
		g.setColor(this.color);
		g.drawRect((int) X1[0], (int) X1[1], (int) width, (int) height);
		
		
	}
	
}

