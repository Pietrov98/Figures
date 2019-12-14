package Figures;

import java.awt.Graphics;

import drawFigures.DrawRectangle;

public class Rectangle implements IFigure{
	private double[] X1 = new double[2]; //lewy gorny rog
	private double height;
	private double width;
	private DrawRectangle drawRectangle;
	
	public Rectangle(double[] X1, double height, double width)
	{
		this.X1 = X1;
		this.height = height;
		this.width = width;
		this.drawRectangle = new DrawRectangle(X1, height, width);
	}
	
	@Override
	public double getArea() 
	{
		return height * width;
	}
	@Override
	public double getPermiter() 
	{
		return 2 * height + 2 * width;
	}
	@Override
	public void drawFigure(Graphics g) 
	{
		drawRectangle.draw(g);
		
	}
}
