public class Kijker extends Persoon {

	public Kijker(int id, Rai rai) {
		super(id, rai);
	}

	@Override
	public void run() {
		//Gebruiker meld zich aan
		aanmelden();
	}

	
}
