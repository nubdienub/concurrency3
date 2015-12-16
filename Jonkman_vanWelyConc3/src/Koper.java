
public class Koper extends Thread{
	private int koperId;
	private Rai rai;
	
	public Koper() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		try {
			while(true){
			//dingen
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void aanmelden(){
		rai.getFloor().joinAsVisitor(this);
	}
	
	public int getKijkerId(){
		return this.koperId;
	}

}
