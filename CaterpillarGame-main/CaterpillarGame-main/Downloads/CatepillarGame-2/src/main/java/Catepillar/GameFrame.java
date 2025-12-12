package Catepillar;

/**
 * The Very Hungry Caterpillar game
 * Marlon Hernandez, Kevyn Girao, Adam Shehata, Alexis Salgado
 */
import javax.swing.JFrame;

public class GameFrame extends JFrame{

    GameFrame(){

        this.add(new GamePanel());
        this.setTitle("Caterpillar");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    
    }
}
