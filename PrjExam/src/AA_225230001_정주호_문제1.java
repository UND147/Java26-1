// AA_225230001_정주호
import javax.swing.*;
import java.awt.*;

public class AA_225230001_정주호_문제1 extends JFrame {
    public AA_225230001_정주호_문제1() {
        // 프레임 제목 설정
        setTitle("AA_225230001_정주호_문제1");
        // 프레임 종료 시 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트 팬 설정 및 레이아웃 설정
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        // 배경색 노란색으로 설정
        c.setBackground(Color.YELLOW);

        // 컴포넌트 생성 및 추가
        c.add(new JLabel("아 이 디"));
        c.add(new JTextField(20)); // 아이디 입력창

        c.add(new JLabel("비밀번호"));
        c.add(new JPasswordField(20)); // 비밀번호 입력창 (입력 내용 가림)

        c.add(new JButton("확인")); // 확인 버튼

        // 프레임 크기 설정 (300*180)
        setSize(300, 180);
        // 프레임을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        // 프로그램 실행
        new AA_225230001_정주호_문제1();
    }
}
