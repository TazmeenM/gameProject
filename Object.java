import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.imageio.*;

class Object extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private BufferedReader input;
    private int imageLocationX;
    private int imageLocationY;
    private Image objectImage;

    public Object(int panelNumber) throws IOException{
    }

    public void actionPerformed(ActionEvent e){
    }

    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
}