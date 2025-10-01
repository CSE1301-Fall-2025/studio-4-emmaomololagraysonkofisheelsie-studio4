package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File

		String shape = in.next();

		int redComponent = in.nextInt();
		int greenComponent = in.nextInt();
		int blueComponent = in.nextInt();

		boolean isFilled = in.nextBoolean();

		double parameterOne = in.nextDouble();
		double parameterTwo = in.nextDouble();
		double parameterThree = in.nextDouble();
		double parameterFour = in.nextDouble();

		if(shape.equals("ellipse"))
		{
			if(isFilled)
			{
				StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
				StdDraw.filledEllipse(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
			else
			{
				StdDraw.ellipse(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
			
		}
		else if(shape.equals("rectangle"))
		{
			if(isFilled)
			{
				StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
				StdDraw.filledRectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
			else
			{
				StdDraw.rectangle(parameterOne,parameterTwo,parameterThree,parameterFour);
			}
		}
		else if(shape.equals("triangle"))
		{
			double parameterFive = in.nextDouble();
			double parameterSix = in.nextDouble();

			double[] x = {parameterOne, parameterTwo, parameterThree};
			double[] y = {parameterFour, parameterFive, parameterSix};

			if(isFilled)
			{
				StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
				StdDraw.filledPolygon(x,y);
				System.out.println("test");
			}
			else
			{
				StdDraw.polygon(x,y);
			}
		}
		else
		{
			System.out.println("THIS SHOULD NOT HAPPEN");
		}
		
	}
}
