
public abstract class Persoon extends Thread{
	private int persoonId;
	private Rai rai;
	
	public Persoon(int id, Rai rai) {
		this.persoonId = id;
		this.rai = rai;
	}
	
	@Override
	public abstract void run();
	
	/**
	 * Aanmelden bij auto RAI
	 * @throws InterruptedException 
	 */
	public void aanmelden(){
		try {
			Thread.sleep((int)(Math.random() * 25000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rai.getRaiSemaphore().release();
	}
	
	/**
	 * Geeft het id van de persoon terug
	 * @return
	 */
	public int getPersoonId(){
		return this.persoonId;
	}
	
	/**
	 * Geeft het object van de RAI terug
	 * @return
	 */
	public Rai getRai(){
		return this.rai;
	}
	
	/**
	 * Betreden van de RAI
	 */
	public void betreedRAI(){
		rai.verlaagtVrijePlaatsen();
	}
	
	/**
	 * Verlaten van de RAI
	 */
	public void verlaatRAI(){
		try {
			Thread.sleep((int)(Math.random() * 25000));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		rai.verhoogVrijePlaatsen();
	}
	
	
}
