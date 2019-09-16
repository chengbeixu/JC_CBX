package tanke.dazhan;

public class Main {
	
	public static void main(String[] args) throws InterruptedException {
		TankFrame tf = new TankFrame();
		
//		Ñ­»·Ë¢ÐÂ
		while(true) {
			Thread.sleep(50);
			tf.repaint();
		}
	}

}
