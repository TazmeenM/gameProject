import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainMenuPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton startButton;

    public MainMenuPanel(){
        startButton = new JButton("Start");
        startButton.setBackground(Color.GRAY);
        this.add(startButton);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == startButton){
            GameFrame.gamePanels.show(GameFrame.c, "Introduction");
        }
    }
    
}