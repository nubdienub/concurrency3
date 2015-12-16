
public class Koper extends Persoon{

	public Koper(int id, Rai rai) {
		super(id, rai);
	}

	@Override
	public void run() {
		try {
			aanmelden();
			System.out.println("Koper " + getPersoonId() + ": Aangemeld!");
			getRai().verhoogWachtendeKopers();
			getRai().getKoperSemaphore().acquire();
			betreedRAI();
			getRai().verlaagWachtendeKopers();
			System.out.println("Koper " + getPersoonId() + ": Hoppakee, 25000 euro lichter!");
			verlaatRAI();
			System.out.println("Koper " + getPersoonId() + " heeft de rai verlaten!");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	

}
