
public class Client extends Persoana implements Comparable {
	private int nrCamera;
	private String dataCheckIn;
	private String dataCheckOut;

	public Client(int id, String nume, String nrTelefon) {
		super(id, nume, nrTelefon);
	}

	public int getNrCamera() {
		return nrCamera;
	}

	public void setNrCamera(int nrCamera) {
		this.nrCamera = nrCamera;
	}

	public String getDataCheckIn() {
		return dataCheckIn;
	}

	public void setDataCheckIn(String dataCheckIn) {
		this.dataCheckIn = dataCheckIn;
	}

	public String getDataCheckOut() {
		return dataCheckOut;
	}

	public void setDataCheckOut(String dataCheckOut) {
		this.dataCheckOut = dataCheckOut;
	}

	public int nrNopti() {
	
		return 0;
	}

	@Override
	public int compareTo(Object o) {
		if (this.nrNopti() == ((Client) o).nrNopti()) {
			return 0;
		} else if (this.nrNopti() < ((Client) o).nrNopti()) {
			return -1;
		} else {
			return 1;
		}
	}

	public String toString() {
		return "Clientul " + this.getNume() + " a petrecut " + this.nrNopti() + " nopti la hotel";
	}
	
}
