import javax.swing.*;
import java.awt.*;

public class SwingComponentEx extends JFrame {
    SwingComponentEx() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("AA_225230001_정주현");
        setSize(300, 300);
        setLocation(600, 300);

        Container ctn = getContentPane();
        ctn.setLayout(new BorderLayout(10, 10));

        JLabel messageLabel = new JLabel("종료하시겠습니까?", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Malgun Gothic", Font.BOLD, 20));

        JPanel centerPanel = new JPanel(new BorderLayout());
        centerPanel.setBorder(BorderFactory.createEmptyBorder(120, 40, 40, 40));
        centerPanel.add(messageLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 20));
        buttonPanel.add(new JButton("확인"));
        buttonPanel.add(new JButton("취소"));

        ctn.add(centerPanel, BorderLayout.CENTER);
        ctn.add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingComponentEx();
    }
}
