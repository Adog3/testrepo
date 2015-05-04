package neo;

import javax.swing.JPanel; 

import java.awt.Graphics;

import javax.swing.JFrame; 

public class Morpheus extends JPanel{
	int x = 0;
	int y = 0;
	int a = 0;
	int b = 0; 
	int c = 30;

	public static void main(String[] args) { 
		JFrame f = new JFrame();
	      f.setSize(400, 400);
	      f.add(new Morpheus());
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      f.setVisible(true);
	}
	public int[] numbers = new int[c];
 
	public void paint(Graphics g){
	    super.paint(g);
	    for (int z = 0; z < c; z++){
	    	numbers[z] = z+1;
	    	String number_string = ""+numbers[z];
	    	g.drawString(number_string, a, b);
	        a=a+5;	
	        b=b+5;
	    }
	}

}
 