import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JPanel;
public class Box extends JPanel
{
    private Rectangle[] boxes = new Rectangle[750];
    Random random =new Random();

     Box(){
       super(); 
       for(int i=0; i< boxes.length;i++){
            boxes[i] =new Rectangle(random.nextInt(100),random.nextInt(100),100,100);
       }
    }
    

         public void paintComponent (Graphics g)
         {
               
            g.setColor(Color.red);     
            for(int i=0; i< boxes.length;i++){
               g.fillRect(boxes[i].x,boxes[i].y,20,20);
               }
            
         }   
}