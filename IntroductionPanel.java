import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class IntroductionPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;

    public IntroductionPanel(){
        mainMenuButton = new JButton("Main Menu");
        mainMenuButton.setBackground(Color.GRAY);
        this.add(mainMenuButton);
    }
    
}