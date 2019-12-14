package Figures;

import java.awt.Graphics;

import drawFigures.DrawTriangle;

public class Triangle implements IFigure{
	private double[] X = new double[3];
	private double[] Y = new double[3];
	private DrawTriangle drawTriangle;
	
	public Triangle(double[] X, double[] Y)
	{
		this.X = X;
		this.Y = Y;
		drawTriangle = new DrawTriangle(X, Y);
	}
	
	@Override
	public double getArea() 
	{
		return 0.5 * Math.abs((X[1] - X[0]) * (Y[2] - Y[0]) - (Y[1] - Y[0]) * (X[2] - X[0]));
	}
	
	@Override
	public double getPermiter() 
	{
		double a = Math.sqrt(Math.pow(X[1] - X[0], 2) + Math.pow(Y[1] - Y[0], 2));
		double b = Math.sqrt(Math.pow(X[2] - X[1], 2) + Math.pow(Y[2] - Y[1], 2));
		double c = Math.sqrt(Math.pow(X[2] - X[0], 2) + Math.pow(Y[2] - Y[0], 2));
		return a + b + c;
	}
	
	@Override
	public void drawFigure(Graphics g) 
	{
		drawTriangle.draw(g);
		
	}
}
