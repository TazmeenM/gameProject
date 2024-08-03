import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;

class IntroductionPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;
    private JLabel introductionText;
    private BufferedReader input;
    /*
    private JLabel introduction;
    private Timer typewriteTimer;
    private int characterCounter;
    */

    public IntroductionPanel() throws IOException{
        input = new BufferedReader(new FileReader("Introduction.txt"));
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
        introductionText = new JLabel(input.readLine());
        this.add(introductionText);
        /*
        introduction = new JLabel("");
        this.add(introduction);
        typewriteTimer = new Timer(10, this);
        typewriteTimer.start();
        
        characterCounter = 0;
        */
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == mainMenuButton){
            GameFrame.gamePanels.show(GameFrame.c, "Main Menu");
            
        }
        /*
        else if (e.getSource() == typewriteTimer){
            try{
                typewrite("Introduction.txt");
            }
            catch(Exception ex){
                System.out.println("Error");
            }
        }
            */
    }

    /*
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
    */

    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }
}