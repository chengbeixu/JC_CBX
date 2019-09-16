package tanke.dazhan;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	
	public int X = 20, Y = 20;//方块的坐标
	
	public int ZX = 0, ZY = 0;//方块坐标的增减量
	
	public TankFrame() {
		setSize(800, 600);//窗口大小
		setResizable(false);//不可调整大小
		setTitle("坦克大战");//窗口标题
		setVisible(true);//窗口可见
		
//		定义键盘事件
		this.addKeyListener(new MyKeyListener());
		
//		能关闭窗口的方法
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
//	在窗口中画正方形
	@Override
	public void paint(Graphics g) {
//		System.out.println("123");
		g.fillRect(X, Y, 50, 50);//(X轴, Y轴, 长, 宽)
		X+=ZX;
		Y+=ZY;
	}
	
//	自定义键盘监听类
	class MyKeyListener extends KeyAdapter {

//		在键被按下去的时候被调用
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println("键盘被按下"+e);
//			if(e.getKeyCode()==38) {
//				System.out.println("38----------");
//			}
			switch (e.getKeyCode()) {
			case 37://左
				X=X-10;
				break;
			case 38://上
				Y=Y-10;
				break;
			case 39://右
				X=X+10;
				break;
			case 40://下
				Y=Y+10;
				break;
			default:
				break;
			}
//			X+=20;
			//这个方法会自动的去调用paint方法，间接的实现页面的更新，从而使正方块动起来
			repaint();
		}

//		在键被弹起的时候被调用
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("键盘被弹起");
//			ZX = 0;
//			ZY = 0;
		}
		
	}

}
