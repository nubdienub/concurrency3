
public class Koper extends Persoon{

	public Koper(int id, Rai rai) {
		super(id, rai);
	}

	@Override
	public void run() {
		//Gebruiker meld zich aan 
		aanmelden();
	}	

}
