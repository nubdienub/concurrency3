public class Kijker extends Persoon {

	public Kijker(int id, Rai rai) {
		super(id, rai);
	}

	@Override
	public void run() {
		try {
			aanmelden();
			System.out.println("Kijker " + getPersoonId() + ": Aangemeld!");
			getRai().verhoogWachtendeKijkers();
			getRai().getKijkerSemaphore().acquire();
			betreedRAI();
			getRai().verlaagWachtendeKijkers();
			System.out.println("Kijker " + getPersoonId() + ": Wow, vette auto's!");
			verlaatRAI();
			System.out.println("Kijker " + getPersoonId() + " heeft de rai verlaten!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
