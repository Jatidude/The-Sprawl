import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;

// Nick Hemann, Evan Prince, Jacob Timme, Connor Slamowitz, & Josh Westhoven

/* To Be Completed:
* 
* Occupation stats bonuses. -> Nick
* 	Ideas: Use variables, statics, and getters in the Occupation enum.
* 
* Moveable Civ-like map; extends beyond the borders of the initial screen. -> Evan
* 
* Find way to overload methods to take non-vital parameters but not rewrite them a bunch of times. -> Jacob
* 
* Make dank memes -> Connor
* 
* Determine way to calculate colony morale and wealth. -> Josh
* 
*/

public class Runner extends JApplet implements Runnable, KeyListener, MouseListener {

	// Graphics
	private Image i;
	private Graphics doubleG;
	URL url;
	public int gameSizeX = 1350;
	public int gameSizeY = 660;
	Colony c;
	Colony ai;
	
	public ArrayList<Integer> capitalX = new ArrayList<Integer>();
	public ArrayList<Integer> capitalY = new ArrayList<Integer>();
	public ArrayList<Integer> capitalWidth = new ArrayList<Integer>();
	public ArrayList<Integer> capitalHeight = new ArrayList<Integer>();
	
	// Motion Booleans
	public boolean left, right, up, down; 
	
	//AI added
	public int added = 0;
	public int max = 4;
	String name;
	
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
		c = new Colony("Deep Run", 16);
		capitalX.add(gameSizeX/2 - 30);
		capitalY.add(gameSizeY/2 - 30);
		capitalWidth.add(30);
		capitalHeight.add(30);
		for(Colonist a : c.getColonists()) {
			System.out.println(a.getAge());
		}
	}
	
	public void addAI() {
		int rand = ((int)(Math.random()*12)+1);
		if (rand == 1) {
			name = "1";
		} else if (rand == 2) {
			name = "2";
		} else if (rand == 3) {
			name = "3";
		} else if (rand == 4) {
			name = "4";
		} else if (rand == 5) {
			name = "5";
		} else if (rand == 6) {
			name = "6";
		} else if (rand == 7) {
			name = "7";
		} else if (rand == 8) {
			name = "8";
		} else if (rand == 9) {
			name = "9";
		} else if (rand == 10) {
			name = "10";
		} else if (rand == 11) {
			name = "11";
		}
		c = new Colony(name, 16);
		c.addColonist(new Colonist());
		capitalX.add((int)(Math.random()*1320)+1);
		capitalY.add((int)(Math.random()*1320)+1);
		capitalWidth.add(30);
		capitalHeight.add(30);
	}
	
	public void run() {
		while (true) {
			repaint();
			try {
				Thread.sleep(17);
			} catch (InterruptedException e) {
				
			}
		}
	}
	
	public void paint(Graphics g) {
		paintColony(g, c, 0);
		for (int i = 1; i < max; i++) {
			addAI();
			paintColony(g, c, i);
		}
	}
	
	public void paintColony(Graphics g, Colony c, int i) {
		g.setColor(Color.BLUE);
		g.fillRect(capitalX.get(i), capitalY.get(i), capitalWidth.get(i), capitalHeight.get(i));
		int stringLen = (int)g.getFontMetrics().getStringBounds(c.getName(), g).getWidth();
		int start = 30/2 - stringLen/2;
		g.drawString(String.valueOf(c.getName()), start + capitalX.get(i), capitalY.get(i) - 10);
	}

	public void keyPressed(KeyEvent e) {
		
		//code for beginning motion
		/*
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = true;
        }if (e.getKeyCode() == KeyEvent.VK_LEFT){
            left = true;
        }if (e.getKeyCode() == KeyEvent.VK_UP){
            up = true;
        }if (e.getKeyCode() == KeyEvent.VK_DOWN){
            down = true;
        }
        */
        
	}
	
	public void keyReleased(KeyEvent e) {
		
		//code for stopping motion
		/*
		if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            right = false;
        }if (e.getKeyCode() == KeyEvent.VK_LEFT){
            left = false;
        }if (e.getKeyCode() == KeyEvent.VK_UP){
            up = false;
        }if (e.getKeyCode() == KeyEvent.VK_DOWN){
            down = false;
        }
        */
	}
	
	public void keyTyped(KeyEvent e) {
		
	}
	
	public void mouseReleased(MouseEvent b) {
		
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}
	
	public void mouseEntered(MouseEvent e) {
		
	}
	
	public void mouseExited(MouseEvent e) {
		
	}
	
	public void mousePressed(MouseEvent e) {
		
	}
	
	public void update(Graphics g) {
		// DO NOT EDIT THIS METHOD
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
