package tanke.dazhan;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame {
	
	public int X = 20, Y = 20;//���������
	
	public int ZX = 0, ZY = 0;//���������������
	
	public TankFrame() {
		setSize(800, 600);//���ڴ�С
		setResizable(false);//���ɵ�����С
		setTitle("̹�˴�ս");//���ڱ���
		setVisible(true);//���ڿɼ�
		
//		��������¼�
		this.addKeyListener(new MyKeyListener());
		
//		�ܹرմ��ڵķ���
		addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
//	�ڴ����л�������
	@Override
	public void paint(Graphics g) {
//		System.out.println("123");
		g.fillRect(X, Y, 50, 50);//(X��, Y��, ��, ��)
		X+=ZX;
		Y+=ZY;
	}
	
//	�Զ�����̼�����
	class MyKeyListener extends KeyAdapter {

//		�ڼ�������ȥ��ʱ�򱻵���
		@Override
		public void keyPressed(KeyEvent e) {
//			System.out.println("���̱�����"+e);
//			if(e.getKeyCode()==38) {
//				System.out.println("38----------");
//			}
			switch (e.getKeyCode()) {
			case 37://��
				X=X-10;
				break;
			case 38://��
				Y=Y-10;
				break;
			case 39://��
				X=X+10;
				break;
			case 40://��
				Y=Y+10;
				break;
			default:
				break;
			}
//			X+=20;
			//����������Զ���ȥ����paint��������ӵ�ʵ��ҳ��ĸ��£��Ӷ�ʹ�����鶯����
			repaint();
		}

//		�ڼ��������ʱ�򱻵���
		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println("���̱�����");
//			ZX = 0;
//			ZY = 0;
		}
		
	}

}
