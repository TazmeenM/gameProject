import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame{
    public static void main(String[] args) throws IOException{
        GameFrame frame = new GameFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1100, 1100);
        frame.setResizable(true);
    }
}