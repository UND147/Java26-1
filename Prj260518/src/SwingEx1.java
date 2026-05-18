import javax.swing.*;
import java.awt.*;
// 이벤트 처리
import javax.swing.event.*;
import java.awt.event.*;
public class SwingEx1 extends JFrame{
	SwingEx1(){ // 동작 정의
		setTitle("첫번째 스윙 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(700, 300); // 프레임 좌표
		
		Container ctn = getContentPane(); // Frame의 contentpane을 알아냄
		ctn.setLayout(new FlowLayout());
		ctn.setBackground(Color.CYAN);
		JButton btn = new JButton("OK");
		ctn.add(btn);
		ctn.add(new JButton("EXIT"));
		
		setSize(500,500);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// main에 클래스 instance 생성
		SwingEx1 swing = new SwingEx1();
		
		
	}

}
