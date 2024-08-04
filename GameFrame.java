import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class GameFrame extends JFrame{
    //Declaring and initializing variables
    static CardLayout gamePanels;
    static Container c;
    static Color backgroundColour;

    private JFrame frame;
    private MainMenuPanel mainMenuPanel;
    private IntroductionPanel introductionPanel;
    private SecondPanel secondPanel;

    public GameFrame() throws IOException{
        backgroundColour = new Color(82, 189, 255);
        //Creating the layout
        c = getContentPane();
        gamePanels = new CardLayout();
        c.setLayout(gamePanels);

        //Adding the panels
        mainMenuPanel = new MainMenuPanel();
        introductionPanel = new IntroductionPanel();
        secondPanel = new SecondPanel();

        c.add("Main Menu", mainMenuPanel);
        c.add("Introduction", introductionPanel);
        c.add("Second Panel", secondPanel);

    }
}