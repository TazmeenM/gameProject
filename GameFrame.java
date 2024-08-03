import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameFrame extends JFrame{
    //Declaring and initializing variables
    static CardLayout gamePanels;
    static Container c;

    private JFrame frame;
    private MainMenuPanel mainMenuPanel;
    private IntroductionPanel introductionPanel;

    public GameFrame(){
        //Creating the layout
        c = getContentPane();
        gamePanels = new CardLayout();
        c.setLayout(gamePanels);

        //Adding the panels
        mainMenuPanel = new MainMenuPanel();
        introductionPanel = new IntroductionPanel();

        c.add("Main Menu", mainMenuPanel);
        c.add("Introduction", introductionPanel);

    }
}