package tanke.dazhan;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		TankFrame tf = new TankFrame();
		
//		ѭ��ˢ��
		while(true) {
			Thread.sleep(50);
			tf.repaint();
		}
	}

}
