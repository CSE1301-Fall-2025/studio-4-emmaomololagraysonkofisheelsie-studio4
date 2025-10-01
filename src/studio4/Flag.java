package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.2);

		double[] xArray = {0.4, 0.5, 0.6, 0.5};
		double[] yArray = {0.5, 0.6, 0.5, 0.4};

		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.5, 0.5, 0.2);

		StdDraw.setPenColor(Color.RED);
		StdDraw.filledPolygon(xArray, yArray);

		
	}
}