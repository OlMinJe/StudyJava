package exam28;

import java.awt.*;
import java.awt.event.*;

public class Exam28 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new EventHandler());
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
				System.exit(0);
			}
		});
	}	
}
