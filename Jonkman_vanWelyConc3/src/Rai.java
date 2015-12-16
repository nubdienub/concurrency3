import java.util.concurrent.Semaphore;

public class Rai {
	private Semaphore koperSemaphore = new Semaphore(0);
	private Semaphore kijkerSemaphore = new Semaphore(0);
	private Semaphore raiSemaphore = new Semaphore(0);
	private int achtereenGekochteAutos;
	
	
	public Rai() throws InterruptedException{
		
		achtereenGekochteAutos = 0;
		
		while(true){
			raiSemaphore.acquire();
			
			
		}
	}

	/**
	 * Haalt het semaphore van de koper op
	 * @return
	 */
	public Semaphore getKoperSemaphore() {
		return koperSemaphore;
	}

	/**
	 * Haalt het semaphore van de kijker op
	 * @return
	 */
	public Semaphore getKijkerSemaphore() {
		return kijkerSemaphore;
	}

	/**
	 * Haalt het aantal achtereen gekochte auto's op
	 * @return
	 */
	public int getAchtereenGekochteAutos() {
		return achtereenGekochteAutos;
	}

	/**
	 * 
	 * @param achtereenGekochteAutos
	 */
	public void raiseAchtereenGekochteAutos() {
		this.achtereenGekochteAutos += 1;
	}


}
