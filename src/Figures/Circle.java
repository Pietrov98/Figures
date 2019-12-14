package Figures;
import java.awt.Graphics;

import drawFigures.DrawCircle;;

public class Circle implements IFigure{
	private double r; //promien
	private double[] center = new double[2]; //srodek
	private DrawCircle drawCircle;
	
	public Circle(double r, double[] center)
	{
		this.center = center;
		this.r = r;
		drawCircle = new DrawCircle(r, center);
	}
	
	@Override
	public double getArea() 
	{
		return Math.PI * r * r;
	}
	
	@Override
	public double getPermiter() 
	{
		return 2 * Math.PI * r;
	}

	//@Override
	public void drawFigure(Graphics g) 
	{
		drawCircle.draw(g);
		
	}
}
