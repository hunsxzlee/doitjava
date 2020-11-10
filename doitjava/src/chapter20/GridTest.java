package chapter20;

import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame {
	public MyFrame3() {
		
		setTitle("GridLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(0, 3));
		
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Button5"));

		pack();
		setVisible(true);
	}
}
	
public class GridTest {
	public static void main(String[] args) {
		MyFrame3 f = new MyFrame3();
	}
}