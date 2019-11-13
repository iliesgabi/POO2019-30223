import java.util.Arrays;

public class Hotel {
	private Angajat[] angajat;
	private int nrAngajati;
	private Client[] client;
	private int nrClienti;
	private Camera[] camera;
	private int nrCamere;

	public Hotel() {
		this.angajat = new Angajat[50];
		this.client = new Client[50];
		this.camera = new Camera[50];
	}

	public Hotel(Angajat[] angajat, Client[] client, Camera[] camera) {
		this.angajat = angajat;
		this.client = client;
		this.camera = camera;
		this.nrAngajati=angajat.length;
		this.nrCamere=camera.length;
		this.nrClienti=client.length;
	}

	public void addAngajat(Angajat angajat) {
		this.angajat[this.nrAngajati] = angajat;
		this.nrAngajati++;
	}

	public void addClient(Client client) {
		this.client[this.nrClienti] = client;
		this.nrClienti++;
	}

	private Camera cautaCamera(int nrCamera) {
		for (int i = 0; i < this.nrCamere; i++) {
			if (nrCamera == this.camera[i].getNrIdentificare()) {
				return this.camera[i];
			}
		}
		return this.camera[0];
	}

	public void emiteFactura(Client client) {
		int nrCameraClient = client.getNrCamera();
		Camera cameraClient = cautaCamera(nrCameraClient);
		System.out.println(
				"Clentul " + client.getNume() + " are de platit " + cameraClient.calculeazaPret(client.nrNopti(), 0));

	}

	public void afiseazaClienti() {
		Arrays.sort(this.client);
		for (int i = 0; i < this.nrClienti; i++) {
			System.out.println(this.client[i].toString());
		}
	}

	public void afiseazaAngajati() {
		Arrays.sort(angajat);
		for (int i = 0; i < 3; i++) {
			System.out.println(this.angajat[i].toString());
		}
	}

	public void afiseazaStatistici() {
		int ocupate = 0;
		int libere = 0;
		for (int i = 0; i < this.nrCamere; i++)
			if (camera[i].getNrOaspeti() == 0)
				libere++;
			else
				ocupate++;
		System.out.println("sunt " + libere + " camere libere");
		System.out.println("sunt " + ocupate + " camere ocupate");
	}
	
	public void afiseazaCamereLibere(String data)
	{
		for(int i=0; i<this.nrCamere; i++)
		{	
				boolean ok=true;
				Client[] aux=camera[i].getClient();
				for (int j=0; j<this.camera[i].getNrOaspeti(); j++)
				{
					if (aux[j].getDataCheckIn().compareTo(data)>=0 && aux[j].getDataCheckOut().compareTo(data)<=0)
						ok=false;
				}
				if (ok==true)
				{
					System.out.println("Camera "+camera[i].getNrIdentificare()+" este libera");
				}
		}
	}
}
