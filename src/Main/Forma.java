//package Main;
//
//import javax.swing.*;
//import java.awt.*;
//
//public class Forma {
//
//    public static void main(String[] args) {
//        JFrame jframe = new JFrame();
//        Toolkit toolkit = Toolkit.getDefaultToolkit();//леха любит чужие писюны
//        Dimension dm = toolkit.getScreenSize();
//        jframe.setBounds((dm.width/2)-250,(dm.height/2)-150,500,300);
//        jframe.setTitle("AlexeyGay");
//        jframe.setResizable(true);
//        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jframe.setVisible(true);
//        JPanel panel = new JPanel();
//        panel.setBounds((dm.width/2)-250,(dm.height/2)-150,500,300);
//        panel.setVisible(true);//любит чурок
//        jframe.add(panel);
//        JTextField t = new JTextField();
//        t.setBounds(10,10,150,20);
//        t.setVisible(true);//он(леша) любит чорные письки вонючие
//        panel.add(t);
//
//    }
//}
package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {

    public void start() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 100);

        JPanel panel = new JPanel(new FlowLayout());
        JTextField textField = new JTextField(10);
        JLabel label1 = new JLabel("2 * ");
        JLabel label2 = new JLabel(" = ");
        JLabel result = new JLabel("0");

        JButton button = new JButton("Calc");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = 0;
                try {
                    x = Integer.parseInt(textField.getText());
                } catch (NumberFormatException e1) {
                    JOptionPane.showMessageDialog(panel, "Некорректный ввод!");
                }
                result.setText(String.valueOf(2 * x));
            }
        });

        panel.add(label1);
        panel.add(textField);
        panel.add(label2);
        panel.add(result);
        panel.add(button);
        add(panel);

        setVisible(true);
    }
}