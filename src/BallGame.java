import javax.swing.*;
import java.awt.*;
public class BallGame extends JFrame  {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100,y=100;//С��ĺ�������
	boolean right=true;
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>856-70) {//40�����ӱ߿�30��С��ֱ��
			right=false;
		}
		if(x<40) {
			right=true;
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
		BallGame game=new BallGame();
		game.launchJFrame();
	}

}
