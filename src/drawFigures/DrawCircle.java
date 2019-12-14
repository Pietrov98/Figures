package drawFigures;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class DrawCircle implements IDraw{

	private Color color;
	private double r;
	private double[] center;
	
	public DrawCircle(double r, double[] center) 
	{
		Random random = new Random();
		this.color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
		this.r = r;
		this.center = center;
	}
	
	@Override
	public void draw(Graphics g)
	{
		g.setColor(this.color);
		g.drawOval((int) this.center[0], (int) this.center[1], (int) r, (int) r);
		
	}

}
