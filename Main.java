import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame{
    static int width = 1100;
    static int height = 1100;
    public static void main(String[] args) throws IOException{
        
        GameFrame frame = new GameFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(width, height);
        frame.setResizable(true);
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }
}