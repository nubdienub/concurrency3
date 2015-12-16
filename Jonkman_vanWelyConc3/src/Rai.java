import java.util.concurrent.Semaphore;

public class Rai {
	private Semaphore koperSemaphore = new Semaphore(0);
	private Semaphore kijkerSemaphore = new Semaphore(0);
	private Semaphore raiSemaphore = new Semaphore(0);
	private int achtereenGekochteAutos = 0;
	private int vrijePlaatsen = 10;
	private int wachtendeKijkers = 0;
	private int wachtendeKopers = 0;
	private boolean koperBinnen = false;
	
	public Rai(int kopers,int kijkers) throws InterruptedException{	
		
		//personen aanmelden
		for (int i = 0; i < kopers; i++) {
			Koper k = new Koper(i, this);
			k.start();
		}
		
		for (int i = 0; i < kijkers; i++) {
			Kijker k = new Kijker(i, this);
			k.start();
		}
		
		
		//Wachten op de eerste persoon die zich aanmeld
		raiSemaphore.acquire();
		
		//Eerste persoon is aangemeld en de RAI gaat van start
		while(true){
			
			//als er nog geen kopers zijn aagemeld dan mogen kijkers naar binnen
			if(wachtendeKopers == 0 && koperBinnen == false){
				if (wachtendeKijkers < vrijePlaatsen) {
					kijkerSemaphore.release(wachtendeKijkers);
				}else{
					kijkerSemaphore.release(10);
				}
			}else{
				
			}
			
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
	 * Verhoogt het aantal gekochte auto's 
	 * @param achtereenGekochteAutos
	 */
	public void raiseAchtereenGekochteAutos() {
		this.achtereenGekochteAutos++;
	}

	/**
	 * Haalt het semaphore van de RAI op
	 * @return
	 */
	public Semaphore getRaiSemaphore() {
		return raiSemaphore;
	}

	/**
	 * Geeft het aantal vrije plaatsen terug
	 * @return
	 */
	public int getVrijePlaatsen() {
		return vrijePlaatsen;
	}

	/**
	 * Verhoog het aantal vrije plaatsen
	 * @param vrijePlaatsen
	 */
	public void verhoogVrijePlaatsen() {
		this.vrijePlaatsen++;
	}
	
	/**
	 * Verlaagt het aantal vrije plaatsen
	 * @param vrijePlaatsen
	 */
	public void verlaagtVrijePlaatsen() {
		this.vrijePlaatsen--;
	}

	/**
	 * Geeft het aantal wachtende kijkers terug
	 * @return
	 */
	public int getWachtendeKijkers() {
		return wachtendeKijkers;
	}

	/**
	 * Verhoogt het aantal wachtende kijkers
	 */
	public void verhoogWachtendeKijkers() {
		this.wachtendeKijkers++;
	}
	
	/**
	 * Verlaagt het aantal wachtende kijkers
	 */
	public void verlaagWachtendeKijkers() {
		this.wachtendeKijkers--;
	}

	/**
	 * Geeft het aantal wachtende kopers terug
	 * @return
	 */
	public int getWachtendeWachtendeKopers() {
		return wachtendeKopers;
	}

	/**
	 * Verhoogt het aantal wachtende kopers
	 */
	public void verhoogWachtendeKopers() {
		this.wachtendeKopers++;
	}

	/**
	 * Verlaagt het aantal wachtende kopers
	 */
	public void verlaagWachtendeKopers() {
		this.wachtendeKopers--;
	}

}
