public class Kijker extends Thread {
	private int kijkerId;
	private Rai rai;

	public Kijker(int id, Rai rai){
		this.kijkerId = id;
		this.rai = rai;
	}
	
	@Override
	public void run() {

	}
	
	/**
	 * Aanmelden bij auto RAI
	 */
	public void aanmelden(){
		
	}
	
	/**
	 * Geeft het id van de kijker terug
	 * @return
	 */
	public int getKijkerId(){
		return this.kijkerId;
	}
	
	
}
