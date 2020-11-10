package chapter20;

import java.awt.*;
import javax.swing.*;

class MyFrame2 extends JFrame {
	public MyFrame2() {
		
		setTitle("BorderLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		add(new JButton("Center"), BorderLayout.CENTER);
		add(new JButton("Line Start"), BorderLayout.LINE_START);
		add(new JButton("Line End"), BorderLayout.LINE_END);
		add(new JButton("Page Start"), BorderLayout.PAGE_START);
		add(new JButton("Page End"), BorderLayout.PAGE_END);
		pack();
		setVisible(true);
	}
}

public class BorderTest {
	public static void main(String[] args) {
		MyFrame2 f = new MyFrame2();
	}
}