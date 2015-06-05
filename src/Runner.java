import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

// Nick Hemann, Evan Prince, Jacob Timme, Connor Slamowitz, & Josh Westhoven

/* To Be Completed:
* 
* Occupation, Nature, and Mood stats bonuses. -> Nick
* 	Ideas: Use variables, statics, and getters in the Occupation, Nature, and Mood enums.
* 
* CARAVAN\getCaravansaryStringArray() -> Nick
* 
* WANDERER\revokeWanderer() -> Jacob
*
* Wanderers -> Evan
* 	Ideas: You can choose to accept or revoke them into you're caravans once they're embarked.
*
* Bigger civilizations have higher disease growth rate.
* 
* Moveable Civ-like map; extends beyond the borders of the initial screen. -> Evan
* 
* Find way to overload methods to take non-vital parameters but not rewrite them a bunch of times. -> Jacob
* 
* Determine way to calculate colony morale and wealth. -> Josh
* 	Ideas: Create individual colonist morale and the colony's morale is the summation of its parts.
* 
*/

public class Runner extends JApplet implements Runnable, KeyListener, MouseListener {

	// Graphics
	private Image i;
	private Graphics doubleG;
	URL url;
	public int gameSizeX = 1350;
	public int gameSizeY = 660;
	Polygon p;
	int draw = 4;
	int test = 0;
	Point centers;
	public int polyWidth = 50, polyHeight = 50;
	
	// Motion Booleans
	public boolean left, right, up, down; 
	
	// Runs init first, then start, then run.
	public void init() {
		setSize(gameSizeX, gameSizeY);
		repaint();
		addKeyListener(this);
		addMouseListener(this);
		try {
			url = getDocumentBase();
		} catch(Exception e) {
			
		}
	}
	
	public void start() {
		
	}
	
	public void run() {
		while(true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(4));
		for(int k=0; k<8; k++) {
			test = (k*100)+50;
			for (int j=1; j<=15; j++) {
					p = new Polygon();
					for(int i = 0; i < 6; i++) {
						if (((k % 2) == 0) && (j*90 < 1350)) {
							p.addPoint((int) (((j*90)) + polyWidth * Math.sin(i * 2 * Math.PI / 6)), (int) (test - draw + polyHeight * Math.cos(i * 2 * Math.PI / 6)));
						} else if (((k % 2) != 0) && (j*90 <= 1350)) {
							p.addPoint((int) (((j*90)) - 45 + polyWidth * Math.sin(i * 2 * Math.PI / 6)), (int) (test - draw + polyHeight * Math.cos(i * 2 * Math.PI / 6)));
						}
					}
				g.drawPolygon(p);
			}
			draw+=polyHeight/2;
		}
	}

	public void keyPressed(KeyEvent k) { 
		/* Beginning Motion
		if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = true;
        }if(k.getKeyCode() == KeyEvent.VK_LEFT) {
            left = true;
        }if(k.getKeyCode() == KeyEvent.VK_UP) {
            up = true;
        }if(k.getKeyCode() == KeyEvent.VK_DOWN) {
            down = true;
        }
        */
        
	}
	
	public void keyReleased(KeyEvent k) {
		/* Stopping Motion
		if(k.getKeyCode() == KeyEvent.VK_RIGHT) {
            right = false;
        }if(k.getKeyCode() == KeyEvent.VK_LEFT) {
            left = false;
        }if(k.getKeyCode() == KeyEvent.VK_UP) {
            up = false;
        }if(k.getKeyCode() == KeyEvent.VK_DOWN) {
            down = false;
        }
        */
	}
	
	public void keyTyped(KeyEvent k) {
		
	}
	
	public void mouseReleased(MouseEvent m) {
		
	}
	
	public void mouseClicked(MouseEvent m) {
		
	}
	
	public void mouseEntered(MouseEvent m) {
		
	}
	
	public void mouseExited(MouseEvent m) {
		
	}
	
	public void mousePressed(MouseEvent m) {
		
	}
	
	public void update(Graphics g) {
		// Final Method
		if (i == null) {
			i = createImage(this.getWidth(), this.getHeight());
			doubleG = i.getGraphics();
		}
		doubleG.setColor(getBackground());
		doubleG.fillRect(0, 0, this.getWidth(), this.getHeight());
		doubleG.setColor(getForeground());
		paint(doubleG);
		g.drawImage(i, 0, 0, this);
	}
	
}
