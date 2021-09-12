package oo.testes;

import java.awt.Color;  
import java.awt.GradientPaint;  
import java.awt.Graphics;  
import java.awt.Graphics2D;  
import java.awt.Paint;  
import java.awt.RenderingHints;  
import java.awt.geom.AffineTransform;  
import java.util.Calendar;  
import javax.swing.JFrame;

/** 
* 
* @author http://www.jroller.com/page/adrianromero?entry=jugando_con_java_2d 
*/  
public class Main extends JFrame {  
      
    public Main() {  
        this.setDefaultCloseOperation( this.EXIT_ON_CLOSE );  
        setSize(400,400);  
    }  
      
    public static void main(String[] args) {  
        // TODO code application logic here  
        new Main().setVisible(true);  
    }  
      
    public void paint(Graphics g) {  
        int width = getWidth();  
        int height = getHeight();  
          
        java.util.Date data = new java.util.Date();  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(data);  
          
        double dhour = (double) cal.get( Calendar.HOUR_OF_DAY );  
        double dminute = (double) cal.get( Calendar.MINUTE);  
        double dsecond = (double) cal.get( Calendar.SECOND);  
          
        Graphics2D g2 = (Graphics2D) g;  
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);  
          
        Paint oldPainter = g2.getPaint();  
        AffineTransform oldt = g2.getTransform();  
          
        g2.setPaint(new GradientPaint(0, 0, Color.WHITE, width, 0, Color.LIGHT_GRAY));  
        g2.fill(g2.getClip());  
          
        int icenterx = width / 2;  
        int icentery = height / 2;  
        int iradius = Math.min(icenterx, icentery);  
          
        g2.transform(AffineTransform.getTranslateInstance(icenterx, icentery));  
        g2.transform(AffineTransform.getScaleInstance(iradius / 1100.0 , iradius / 1100.0));  
        AffineTransform mytrans = g2.getTransform();  
          
        g2.setPaint(new GradientPaint(-1200, -1200, Color.BLUE, 1200, 1200, Color.CYAN));  
        g2.fillOval(-1000, -1000, 2000, 2000);  
        g2.setPaint(new GradientPaint(-1200, -1200, Color.CYAN, 1200, 1200, Color.BLUE));  
        g2.fillOval(-900, -900, 1800, 1800);  
        g2.setColor(Color.BLACK);  
        g2.drawOval(-1000, -1000, 2000, 2000);  
          
        for (int i = 0; i < 60; i++) {  
            g2.setColor(Color.WHITE);  
            g2.fillRect(900, -5 , 50, 10);  
            g2.transform(AffineTransform.getRotateInstance(Math.PI / 30.0));  
        }  
          
        g2.setTransform(mytrans);  
        for (int i = 0; i < 12; i++) {  
            g2.setColor(Color.WHITE);  
            g2.fillRect(800, -15 , 150, 30);  
            // g2.setColor(Color.BLACK);  
            // g2.drawRect(800, -15 , 150, 30);  
            g2.transform(AffineTransform.getRotateInstance(Math.PI / 6.0));  
        }  
          
        g2.setTransform(mytrans);  
        g2.transform(AffineTransform.getRotateInstance((dhour + dminute / 60.0) * Math.PI / 6.0)); // Poner hora  
        g2.setColor(Color.WHITE);  
        g2.fillPolygon(new int[]{0, -35, 0, 35}, new int[]{100, 0, -600, 0}, 4);  
        g2.setColor(Color.DARK_GRAY);  
        g2.drawPolygon(new int[]{0, -35, 0, 35}, new int[]{100, 0, -600, 0}, 4);  
          
        g2.setTransform(mytrans);  
        g2.transform(AffineTransform.getRotateInstance((dminute) * Math.PI / 30.0)); // Poner minutos  
        g2.setColor(Color.WHITE);  
        g2.fillPolygon(new int[]{0, -35, 0, 35}, new int[]{100, 0, -900, 0}, 4);  
        g2.setColor(Color.DARK_GRAY);  
        g2.drawPolygon(new int[]{0, -35, 0, 35}, new int[]{100, 0, -900, 0}, 4);  
          
        g2.setTransform(mytrans);  
        g2.transform(AffineTransform.getRotateInstance(dsecond * Math.PI / 30.0)); // Poner segundos  
        g2.setColor(Color.YELLOW);  
        g2.fillPolygon(new int[]{-15, 0, 15}, new int[]{200, -900, 200},  3);  
        g2.setColor(Color.DARK_GRAY);  
        g2.drawPolygon(new int[]{-15, 0, 15}, new int[]{200, -900, 200},  3);  
          
        g2.setTransform(mytrans);  
        g2.setColor(Color.YELLOW);  
        g2.fillOval(-25, -25, 50, 50);  
        g2.setColor(Color.DARK_GRAY);  
        g2.drawOval(-25, -25, 50, 50);  
        g2.setColor(Color.WHITE);  
        g2.fillOval(-10, -10, 20, 20);  
        g2.setColor(Color.BLACK);  
        g2.drawOval(-10, -10, 20, 20);  
          
        g2.setTransform(oldt);  
        g2.setPaint(oldPainter);  
    }  
} 
