import javax.swing.*;
class GameLoop
{
public static  void main(String[] args)
{
    JFrame f= new JFrame("Box");
    Box b1= new Box();
    f.add(b1);
    f.setSize(500,500);
    f.setVisible(true);
}
}