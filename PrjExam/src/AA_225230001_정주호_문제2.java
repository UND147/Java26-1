// AA_225230001_정주호
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AA_225230001_정주호_문제2 extends JFrame {
    // 주요 컴포넌트를 필드로 선언하여 이벤트 리스너에서 접근 가능하게 함
    private JTextField tfSalary; // 월급 입력창
    private JTextField tfBonus;  // 보너스 입력창
    private JLabel lblResult;    // 결과 출력 레이블

    public AA_225230001_정주호_문제2() {
        // 프레임 제목 설정
        setTitle("AA_225230001_정주호_문제2");
        // 프레임 종료 시 프로그램 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 컨텐트 팬 설정 및 BorderLayout 적용
        Container c = getContentPane();
        c.setLayout(new BorderLayout());

        // 중앙 패널 생성 (입력창 및 결과 레이블 포함)
        JPanel centerPanel = new JPanel();
        centerPanel.setBackground(Color.CYAN); // 배경색을 하늘색(Cyan)으로 설정
        centerPanel.setLayout(new FlowLayout()); // 컴포넌트들을 순차적으로 배치

        // 월급 입력 섹션
        centerPanel.add(new JLabel("월  급"));
        tfSalary = new JTextField("400", 20);
        centerPanel.add(tfSalary);

        // 보너스 입력 섹션
        centerPanel.add(new JLabel("보너스"));
        tfBonus = new JTextField("200", 20);
        centerPanel.add(tfBonus);

        // 결과 출력 섹션
        lblResult = new JLabel("당신의 연봉은 5000 입니다.");
        centerPanel.add(lblResult);

        // 중앙 패널을 프레임의 CENTER에 추가
        c.add(centerPanel, BorderLayout.CENTER);

        // 연봉 계산 버튼 생성 및 SOUTH에 추가
        JButton btnCalc = new JButton("연봉 계산");
        c.add(btnCalc, BorderLayout.SOUTH);

        // 버튼 클릭 이벤트 리스너 등록
        btnCalc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 입력된 월급과 보너스를 정수로 변환
                    int salary = Integer.parseInt(tfSalary.getText());
                    int bonus = Integer.parseInt(tfBonus.getText());
                    // 연봉 계산: 월급 * 12 + 보너스
                    int total = salary * 12 + bonus;
                    // 결과 레이블 업데이트
                    lblResult.setText("당신의 연봉은 " + total + " 입니다.");
                } catch (NumberFormatException ex) {
                    // 숫자 형식이 아닐 경우 오류 메시지 출력
                    lblResult.setText("숫자를 올바르게 입력하세요.");
                }
            }
        });

        // 프레임 크기 설정 (300*200)
        setSize(300, 200);
        // 프레임을 화면에 표시
        setVisible(true);
    }

    public static void main(String[] args) {
        // 프로그램 실행
        new AA_225230001_정주호_문제2();
    }
}
