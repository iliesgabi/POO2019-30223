
public class Manual extends Rechizita{
	public Manual(String eticheta)
	{
		this.eticheta=eticheta;
	}
	
	public String getNume()
	{
		String manual="Manual ";
		manual=manual.concat(this.eticheta);
		return manual;
		
	}
}
