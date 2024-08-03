import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainMenuPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton startButton, settingsButton;

    public MainMenuPanel(){
        //Adding details to the Start button
        startButton = new JButton("Start");
        startButton.setBackground(Color.GRAY);
        startButton.addActionListener(this);

        //Adding details to the Settings button
        settingsButton = new JButton("Settings");
        settingsButton.setBackground(Color.GRAY);
        startButton.addActionListener(this);

        //Creating the layout for the buttons
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createRigidArea(new Dimension(0, 5)));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        settingsButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        this.add(startButton);
        this.add(settingsButton);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == startButton){
            GameFrame.gamePanels.show(GameFrame.c, "Introduction");
        }
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
}