import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

public class Sierpinski {
	
	public static final int SIZE =256;

	public static void main(String[] args) {
		
		
		
		//prompt user for level
		Scanner console = new Scanner(System.in);
		System.out.println("How many Levels: ");
		int level = console.nextInt();
		
		//initialize the drawing panel
		DrawingPanel p = new DrawingPanel(SIZE, SIZE);
		p.setBackground(Color.CYAN);
		Graphics g = p.getGraphics();
		
		//compute end points of triangle and begin recursion
		int triangleHeight = (int) Math.round(SIZE * Math.sqrt(3.0)/2.0);
		Point p1 = new Point(0, triangleHeight);
		Point p2 = new Point(SIZE/2, 0);
		Point p3 = new Point(SIZE, triangleHeight);
		
		drawFigure(level, g, p1, p2, p3);
		
	}
	//draw the triangle fractal to the given level inside the triangle with  p1, p2, p3
	private static void drawFigure(int level, Graphics g, Point p1, Point p2, Point p3) {
		//base case drawing one case
		if(level == 1) {
			//one triangle
			Polygon p = new Polygon();
			p.addPoint(p1.x, p1.y);
			p.addPoint(p2.x, p2.y);
			p.addPoint(p3.x, p3.y);
			g.setColor(Color.RED);
			g.fillPolygon(p);
			
		}else {// recursive case : split into 3 triangles
			Point p4 = midpoint(p1, p2);
			Point p5 = midpoint(p2, p3);
			Point p6 = midpoint(p1, p3);
			
			//draw the 3 triangles
			drawFigure(level - 1, g, p1, p4, p6);
			drawFigure(level - 1, g, p4, p2, p5);
			drawFigure(level - 1, g, p6, p5, p3);
			
			
		}
		
	}
	private static Point midpoint(Point p1, Point p2) {
		
		return new Point((p1.x + p2.x)/2, (p1.y + p2.y)/2);
	}

}








