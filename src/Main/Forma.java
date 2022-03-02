package Main;

import javax.swing.*;
import java.awt.*;

public class Forma {

    public static void main(String[] args) {
        JFrame jframe = new JFrame();
        Toolkit toolkit = Toolkit.getDefaultToolkit();//леха любит чужие писюны
        Dimension dm = toolkit.getScreenSize();
        jframe.setBounds((dm.width/2)-250,(dm.height/2)-150,500,300);
        jframe.setTitle("AlexeyGay");
        jframe.setResizable(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
        JPanel panel = new JPanel();
        panel.setBounds((dm.width/2)-250,(dm.height/2)-150,500,300);
        panel.setVisible(true);//любит чурок
        jframe.add(panel);
        JTextField t = new JTextField();
        t.setBounds(10,10,150,20);
        t.setVisible(true);//он(леша) любит чорные письки вонючие
        panel.add(t);

    }
}
