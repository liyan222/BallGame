import javax.swing.*;
import java.awt.*;
public class BallGame2 extends JFrame  {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100,y=100;//С��ĺ�������
	double degree=3.14/3;
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		if(y>500-70||y<40+40) {
			degree=-degree;
		}
		if(x<40||x>856-70) {
			degree=3.14-degree;
		}
	}
	//���ڼ���
	void launchJFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//�ػ�����
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//��Լһ�뻭20�δ���
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		BallGame2 game=new BallGame2();
		game.launchJFrame();
	}

}
