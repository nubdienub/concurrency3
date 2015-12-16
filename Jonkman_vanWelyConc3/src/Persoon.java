
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
	 */
	public void aanmelden(){
		rai.getRaiSemaphore().release();
	}
	
	/**
	 * Geeft het id van de persoon terug
	 * @return
	 */
	public int getPersoonId(){
		return this.persoonId;
	}
}
