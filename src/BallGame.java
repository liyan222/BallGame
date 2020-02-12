import javax.swing.*;
import java.awt.*;
public class BallGame extends JFrame  {
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.jpg");
	double x=100,y=100;//小球的横纵坐标
	boolean right=true;
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>856-70) {//40是桌子边框，30是小球直径
			right=false;
		}
		if(x<40) {
			right=true;
		}
		
	}
	//窗口加载
	void launchJFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		//重画窗口
		while(true) {
			repaint();
			try {
				Thread.sleep(40);//大约一秒画20次窗口
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
