import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener {
    Score(int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(new Color(0, 255, 255));
        getContentPane().setLayout(null);

        JLabel heading = new JLabel("Obrigado por participar do quiz");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        getContentPane().add(heading);

        JLabel lblscore = new JLabel("Sua pontuação é: " + score);
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        getContentPane().add(lblscore);

        JButton submit = new JButton("Começar de novo");
        submit.setBounds(380, 270, 120, 30);
        submit.setBackground(new Color(0, 0, 128));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        getContentPane().add(submit);

        JButton btnNewButton = new JButton("Opções");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new Option();
            }
        });
        btnNewButton.setForeground(new Color(255, 255, 255));
        btnNewButton.setBackground(new Color(0, 0, 128));
        btnNewButton.setBounds(380, 334, 120, 30);
        getContentPane().add(btnNewButton);
        JButton btnNewButton_1 = new JButton("Sair");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnNewButton_1.setBackground(new Color(0, 0, 128));
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBounds(380, 393, 120, 35);
        getContentPane().add(btnNewButton_1);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String[] args) {
        new Score(0);
    }
}
