/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomfacegenerator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Khouiled
 */
public class RandomFaceGenerator {

    /**
     * @param args the command line arguments
     */
    public static Random random=new Random();
    public static void main(String[] args) {
    JFrame frame = new JFrame("Random Face Generator");
    frame.setBounds(10, 10, 300, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p=new JPanel(){
        @Override
        public void paint(Graphics g2) {
            Graphics2D g=(Graphics2D)g2.create();
            g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            if(random.nextBoolean()){
                g.fillRect(50, 50, 200, 200);
            }else{
                g.fillOval(50, 50, 200, 200);
            }
                g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            if(random.nextBoolean()){
                g.fillRect(100, 100, 35, 35);
            }else{
                g.fillOval(100, 100, 35, 35);
            }
                g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            if(random.nextBoolean()){
                g.fillRect(165, 100, 35, 35);
            }else{
                g.fillOval(165, 100, 35, 35);
            }
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            if(random.nextBoolean()){
                g.fillRect(110, 160, 80, 20);
            }else{
                g.fillOval(110, 170, 80, 20);
            }
        }
    };
    frame.add(p);
    
    frame.setVisible(true);
    }
    
}
