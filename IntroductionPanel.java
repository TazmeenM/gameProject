import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Timer;

class IntroductionPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;
    private JLabel introduction;
    private Timer typewriteTimer;
    private int characterCounter;
    private BufferedReader input;

    public IntroductionPanel() throws IOException{
        //Adding the buttons
        mainMenuButton = new JButton("Main Menu");
        mainMenuButton.setBackground(Color.GRAY);
        this.add(mainMenuButton);
        mainMenuButton.addActionListener(this);

        introduction = new JLabel("");
        this.add(introduction);
        typewriteTimer = new Timer();
        typewriteTimer.start();

        //Reading the text
        input = new BufferedReader(new FileReader("Introduction.txt"));
        characterCounter = 0;
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == mainMenuButton){
            GameFrame.gamePanels.show(GameFrame.c, "Main Menu");
            
        }
        else if (e.getSource() == typewriteTimer){
            typewrite("Introduction.txt");
        }
    }

    public void typewrite(String file) throws IOException{
        String fileString = "";
        String string = "";
        string = input.readLine();
        while (string != null){
            fileString += string;
            string = input.readLine();
        }
        introduction.setText(introduction.getText() + fileString.charAt(characterCounter));
        characterCounter++;
    }

    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
}