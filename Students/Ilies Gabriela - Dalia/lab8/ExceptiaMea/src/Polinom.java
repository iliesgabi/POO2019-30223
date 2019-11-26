
public class Polinom {
	private Integer[] coeficienti;
	private Integer grad;

	public Polinom(Integer[] coeficienti, Integer grad) {
		this.coeficienti = coeficienti;
		this.grad = grad;
	}

	public Integer[] getCoeficienti() {
		return coeficienti;
	}

	public void setCoeficienti(Integer[] coeficienti) {
		this.coeficienti = coeficienti;
	}

	public Integer getGrad() {
		return grad;
	}

	public void setGrad(Integer grad) {
		this.grad = grad;
	}

	public void verificareCoeficienti() throws NumarNegativ {
		for (int i = 0; i < this.grad; i++) {
			if (this.coeficienti[i] < 0)
				throw new NumarNegativ("coeficientul e negativ");
		}
	}

}
