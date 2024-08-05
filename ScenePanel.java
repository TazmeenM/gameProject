import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.Timer;
import javax.imageio.*;

class ScenePanel extends JPanel implements ActionListener, KeyListener{
    //Declaring and initializing variables
    private JButton mainMenuButton;
    private BufferedReader input;
    private JLabel text;
    private int backgroundImageLocationX;
    private int backgroundImageLocationY;
    private Image background;
    private Timer backgroundImageScrollTimer;
    private Timer backgroundPauseTimer;

    public ScenePanel(int panelNumber, String backgroundFile) throws IOException{
        input = new BufferedReader(new FileReader("Text.txt"));
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
        text = new JLabel(input.readLine());
        text.setForeground(Color.WHITE);
        this.add(text);

        //Adding the background
        try{
            background = ImageIO.read(new File(backgroundFile));
        }
        catch(Exception e){
            System.out.println("Error: " + e);
        }
        backgroundImageLocationY = 0;
        backgroundImageScrollTimer = new Timer(10, this);
        backgroundImageScrollTimer.start();
        backgroundPauseTimer = new Timer(600, this);

        //Adding the labels
        //introductionText = new JLabel(input.readLine());
        //introductionText.setForeground(Color.WHITE);
        //this.add(introductionText);
    }

    public ScenePanel(int panelNumber) throws IOException{
        this(panelNumber, "background.png");
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
                backgroundPauseTimer.start();
                
            }
        }
        else if (e.getSource() == backgroundPauseTimer){
            backgroundPauseTimer.stop();
            GameFrame.gamePanels.next(GameFrame.c);
            reset();
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
        try{
            Image background = ImageIO.read(new File("citySkylineDrawing.png"));
            g.drawImage(background, 0, backgroundImageLocationY, null);
            backgroundImageLocationY -= 10;
        }
        catch(Exception e){
            System.out.println("Exception:" + e);
        }
    }

    public void reset(){
        backgroundImageLocationY = 0;
        backgroundImageScrollTimer.start();
    }
}