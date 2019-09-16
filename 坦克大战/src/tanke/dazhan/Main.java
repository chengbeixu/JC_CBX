package tanke.dazhan;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		TankFrame tf = new TankFrame();
		
//		循环刷新
		while(true) {
			Thread.sleep(50);
			tf.repaint();
		}
	}

}
