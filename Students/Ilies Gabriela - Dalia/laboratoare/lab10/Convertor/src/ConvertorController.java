import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class ConvertorController {

	private ConvertorModel m_model;
	private ConvertorView m_view;

	ConvertorController(ConvertorModel model, ConvertorView view) {
		m_model = model;
		m_view = view;
		view.addMultiplyListener(new MultiplyListener()); 
		view.addMultiplyListener(new MultiplyListener()); 
		
	}

	class MultiplyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String userInput = "";
			try {
				userInput = m_view.getUserInput();
				String valutaInitiala=m_view.getSuma();
				String valutaFinala=m_view.getRezultat();
				
				m_model.multiplyBy(userInput,valutaInitiala,valutaFinala);
				m_view.setTotal(m_model.getValue());

			} catch (NumberFormatException nfex) {
				m_view.showError("Bad input: '" + userInput + "'");
			}
		}
	}
}
