import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.imageio.*;

class IntroductionPanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;
    private JLabel introductionText;
    private BufferedReader input;
    private int backgroundImageLocationY;
    private Timer backgroundImageScrollTimer;

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
        introductionText.setForeground(Color.WHITE);
        this.add(introductionText);

        //Adding the background
        backgroundImageLocationY = 0;
        backgroundImageScrollTimer = new Timer(10, this);
        backgroundImageScrollTimer.start();

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
        else if (e.getSource() == backgroundImageScrollTimer){
            if (backgroundImageLocationY >= -1100){
                repaint();
            }
            else{
                backgroundImageScrollTimer.stop();
                GameFrame.gamePanels.show(GameFrame.c, "Second Panel");
            }
        }
        /*
        else if (e.getSource() == typewriteTimer){
            try{
                typewrite("Introduction.txt");
            }
            catch(Exception ex){
                System.out.println("Error: " + ex);
            }
        }
        */

    }

    /*
    public void typewrite(String file) throws IOException{
        String fileString = "";
        String string = "";
        char[] charString;
        string = input.readLine();
        fileString = string.substring(0, characterCounter);
        if (characterCounter <= string.length()){
            characterCounter++;
            introduction.setText(fileString);
        }
        
    }
    */


    public void keyPressed(KeyEvent e){
    }
    public void keyReleased(KeyEvent e){
    }
    public void keyTyped(KeyEvent e){
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        try{
            Image background = ImageIO.read(new File("citySkylineDrawing.png"));
            g.drawImage(background, 0, backgroundImageLocationY, null);
            backgroundImageLocationY -= 10;
        }
        catch(Exception e){
            System.out.println("Exception:" + e);
        }
    }
}