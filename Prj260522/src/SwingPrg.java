import javax.swing.*;
import java.awt.*;
import java.util.Set;
class SwingPrg2 extends JFrame{
	int width, height;
	int x, y;
	String title, color;
	
	SwingPrg2(String title, int width, int height, int x, int y){
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// 서브패널 제어 확보 및 패널 속성 변경
		Container cp = getContentPane();
		cp.setBackground(Color.YELLOW);
		
		cp.setLayout(new FlowLayout());
		// 컴포넌트 생성 및 패널에 추가
		JButton b1 = new JButton("확인"); cp.add(b1);
		JButton b2 = new JButton("취소"); cp.add(b2);
		//화면에 가시화
		setVisible(true);
	}
}
public class SwingPrg extends JFrame {
	int width, height;
	int x, y;
	String title, color;
	
	SwingPrg(String title, int width, int height, int x, int y){
		setTitle(title);
		setSize(width, height);
		setLocation(x, y);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new BorderLayout());
		// 서브패널 제어 확보 및 패널 속성 변경
		Container cp = getContentPane();
		cp.setBackground(Color.CYAN);
		JLabel la1 = new JLabel("컴포넌트 추가", JLabel.CENTER);
		JLabel la2 = new JLabel("두번째 라벨", JLabel.CENTER);
		cp.add(la1, BorderLayout.CENTER);
		cp.add(la2, BorderLayout.NORTH);
		cp.add(new JLabel("세번째 라벨", JLabel.CENTER), BorderLayout.SOUTH);
		
		//화면에 가시화
		setVisible(true);
	}

	public static void main(String[] args) {
		
		//1st
		SwingPrg swing1 = new SwingPrg("1st Swing App", 400, 300, 500, 200);
		SwingPrg2 swing2 = new SwingPrg2("2nd Swing App", 300, 200, 200, 200);

	}

}
