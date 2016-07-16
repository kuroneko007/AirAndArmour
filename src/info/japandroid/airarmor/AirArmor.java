package info.japandroid.airarmor;

import javax.swing.*;
import java.awt.*;

/**
 * Created by sven on 16/07/16.
 */
public class AirArmor {

    public static void main(String[] args) {
        new AirArmor().go();
    }

    private void go(){
        buildGUI();
    }

    private void buildGUI(){
        JFrame theFrame = new JFrame("Air and Armor");
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        BorderLayout layout = new BorderLayout();
        JPanel background = new JPanel(layout);
        background.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        Box buttonBox = new Box(BoxLayout.Y_AXIS);
        JButton newGame = new JButton("New Game");
        buttonBox.add(newGame);

        JButton newPlayer = new JButton("New Player");
        buttonBox.add(newPlayer);

        JButton newBoard = new JButton("New Board");
        buttonBox.add(newBoard);

        background.add(BorderLayout.CENTER, buttonBox);
        theFrame.getContentPane().add(background);
        theFrame.setBounds(150, 150, 600, 600);
        theFrame.pack();
        theFrame.setVisible(true);
    }
}
