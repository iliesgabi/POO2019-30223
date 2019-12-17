import java.math.BigInteger;

public class ConvertorModel {

	static final String INITIAL_VALUE = "1";

	private String m_total;

	private Double[][] curs= new Double[6][6];
	
	
	ConvertorModel() {
		initializeaza();
		reset();
	}

	public void reset() {
		 m_total=INITIAL_VALUE;
	}

	private void initializeaza() {
		curs[0][0]=1.0;
		curs[0][1]=0.21;
		curs[0][2]=0.23;
		curs[0][3]=0.004;
		curs[0][4]=0.34;
		curs[0][5]=0.30;
		
		curs[1][0]=4.77;
		curs[1][1]=1.0;
		curs[1][2]=1.11;
		curs[1][3]=0.02;
		curs[1][4]=1.61;
		curs[1][5]=1.46;
		
		curs[2][0]=4.28;
		curs[2][1]=0.89;
		curs[2][2]=1.0;
		curs[2][3]=0.02;
		curs[2][4]=1.45;
		curs[2][5]=1.31;
		
		curs[3][0]=203.68;
		curs[3][1]=42.62;
		curs[3][2]=47.5;
		curs[3][3]=1.0;
		curs[3][4]=68.99;
		curs[3][5]=62.38;
		
		curs[4][0]=2.95;
		curs[4][1]=0.61;
		curs[4][2]=0.68;
		curs[4][3]=0.014;
		curs[4][4]=1.0;
		curs[4][5]=0.90;
		
		curs[5][0]=3.26;
		curs[5][1]=0.68;
		curs[5][2]=0.76;
		curs[5][3]=0.06;
		curs[5][4]=1.1;
		curs[5][5]=1.0;
																		
	}
	public void multiplyBy(String userInput, String valInitiala, String valFinala) {
		Double aux=1.0;
		aux=Double.parseDouble(userInput);
		Double aux2= (aux*transformaInRezultat(valInitiala,valFinala));
		this.m_total=String.valueOf(aux2);
	}

	public void setValue(String value) {
		m_total = value;
	}

	public String getValue() {
		return m_total;
	}
	
	public Double transformaInRezultat(String valInitiala, String valFinala) {
		int row=0;
		int col=0;
		
		if (valInitiala.equals("RON"))
			row=0;
		if (valInitiala.equals("EUR"))
			row=1;
		if (valInitiala.equals("USD"))
			row=2;
		if (valInitiala.equals("XAU"))
			row=3;
		if (valInitiala.equals("AUD"))
			row=4;
		if (valInitiala.equals("CAN"))
			row=5;
		
		if (valFinala.equals("RON"))
			col=0;
		if (valFinala.equals("EUR"))
			col=1;
		if (valFinala.equals("USD"))
			col=2;
		if (valFinala.equals("XAU"))
			col=3;
		if (valFinala.equals("AUD"))
			col=4;
		if (valFinala.equals("CAN"))
			col=5;
		
		return curs[row][col];
	}

}