package oo.testes;

import java.awt.*;
import java.applet.*;

public class Scribble1 extends Applet {
	public boolean mouseDrag(Event evt, int x, int y) {
		Graphics g = getGraphics();
		g.fillOval(x, y, 4, 4);
		return true;
	}
	public static void main(String[] args) {
		new Scribble1();
	}
}