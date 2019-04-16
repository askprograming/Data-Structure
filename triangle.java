import java.awt.Graphics;
import java.awt.Color;

public class triangle {

	public static void main(String[] args) {
		
		//create a panel and set background color		
		DrawingPanel panel = new DrawingPanel(500,500);
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		//draw the oval and fill the Oval with color
		g.setColor(Color.BLUE);
		g.fillOval(50, 50, 100, 100);
		g.fillOval(250, 50, 100, 100);
			
		//draw the Rectangle and fill the Rectangle with color
		g.setColor(Color.RED);
		g.fillRect(100, 100, 200, 200);
		
		//draw the line and set color
		g.setColor(Color.BLACK);
		g.drawLine(100, 200, 300, 200);
	}

}
