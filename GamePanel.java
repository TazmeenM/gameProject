import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.imageio.*;

class GamePanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;
    private BufferedReader input;
    private int backgroundImageLocationX;
    private int backgroundImageLocationY;

    public GamePanel(int panelNumber) throws IOException{
        this.setBackground(GameFrame.backgroundColour);
        //Adding the buttons
        mainMenuButton = new JButton("Main Menu");
        mainMenuButton.setBackground(Color.WHITE);
        this.add(mainMenuButton);
        mainMenuButton.addActionListener(this);
        
        //Creating the layout of the buttons
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.add(Box.createRigidArea(new Dimension(10, 10)));
        mainMenuButton.setAlignmentX(Component.LEFT_ALIGNMENT);

        //Adding the labels
        //introductionText = new JLabel(input.readLine());
        //introductionText.setForeground(Color.WHITE);
        //this.add(introductionText);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == mainMenuButton){
            GameFrame.gamePanels.show(GameFrame.c, "Main Menu");
            
        }
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