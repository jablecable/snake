package game.snake;
import javax.swing.*;
import java.awt.*;


public class GUI {

    public static void guiStartup () {

        //create JFrame object `window` that initializes the name as "SNAKE" using its constructor
        JFrame window = new JFrame("SNAKE");


        //set size of window
        window.setSize(600,600);

        //exit on close
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //object.object.method(Class object = new Class(arg1 arg2 arg3)
        //changes window background to gray
        window.getContentPane().setBackground(new Color(99, 99, 99));

        //make window visible
        window.setVisible(true);





    }
}
