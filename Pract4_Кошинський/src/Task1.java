import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.program.GraphicsProgram;


public class Task1 extends GraphicsProgram{
	private static final long serialVersionUID = 1L;

	public void run() {
		Font font1 = new Font("Arial", 10, 10);
		Font font2 = new Font("Abadi", 20, 20);
		Font font3 = new Font("Aptos", 30, 30);
		setSize(700, 700);
		String pib = "Кошинський Станіслав Михайлович";
		GLabel label1 = new GLabel(pib ,50,50);
		label1.setFont(font1);
		label1.setColor(Color.RED);
		GLabel label2 = new GLabel(pib ,200,200);
		label2.setFont(font2);
		label2.setColor(Color.BLACK);
		GLabel label3 = new GLabel(pib ,150,600);
		label3.setFont(font3);
		label3.setColor(Color.BLUE);
		add(label1);
		add(label2);
		add(label3);
	}

}
