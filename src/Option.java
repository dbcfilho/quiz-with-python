import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Option {
     JFrame frame;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Option window = new Option();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public Option() {
        initialize();
    }
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(0, 255, 255));
        frame.setBounds(100, 100, 761, 513);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JButton btnNewButton = new JButton("Hardware");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new quizhardware();
            }
        });
        btnNewButton.setBounds(176, 181, 160, 57);
        frame.getContentPane().add(btnNewButton);

        JButton btnNewButton_1 = new JButton("T.I.");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new quizti();
            }
        });
        btnNewButton_1.setBounds(418, 181, 139, 57);
        frame.getContentPane().add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Sistema operacional");
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new quizso();
            }
        });
        btnNewButton_2.setBounds(176, 293, 160, 62);
        frame.getContentPane().add(btnNewButton_2);

        JButton btnNewButton_3 = new JButton("Software");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new quizsoftware();
            }
        });
        btnNewButton_3.setBounds(418, 293, 139, 57);
        frame.getContentPane().add(btnNewButton_3);

        JLabel lblNewLabel = new JLabel("Escolha o assunto");
        lblNewLabel.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 30));
        lblNewLabel.setBounds(256, 37, 299, 93);
        frame.getContentPane().add(lblNewLabel);
        frame.setVisible(true);
    }
}
