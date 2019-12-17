import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox implements ActionListener {
		private String[] messageStrings = { "RON", "EUR", "USD", "XAU", "AUD", "CAD" };
		private String[] messageStrings2 = { "RON", "EUR", "USD", "XAU", "AUD", "CAD" };
		private JComboBox cmbMessageList = new JComboBox(messageStrings);
		private JComboBox cmbMessageList2 = new JComboBox(messageStrings2);
		private JLabel lblText = new JLabel();
		private JLabel lblTextSuma = new JLabel();
		private JLabel lblTextRezultat = new JLabel();

		public ComboBox() {
			lblTextSuma.setText("EUR");
			lblTextRezultat.setText("EUR");
			lblText.setText("1 EUR = 1 EUR");
			cmbMessageList.setSelectedIndex(1);
			cmbMessageList.addActionListener(this);
			cmbMessageList2.setSelectedIndex(1);
			cmbMessageList2.addActionListener(this);
		}

		public JLabel getLblText() {
			return this.lblText;
		}
		
		public JComboBox getCmbMessageList() {
			return this.cmbMessageList;
		}
		
		public JComboBox getCmbMessageList2() {
			return this.cmbMessageList2;
		}

		public JLabel getLblTextSuma() {
			return this.lblTextSuma;
		}

		public JLabel getLblTextRezultat() {
			return this.lblTextRezultat;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String aux = new String();
			if (e.getSource() == cmbMessageList || e.getSource() == cmbMessageList2) {
				aux = (String) cmbMessageList2.getSelectedItem();
				if (((String) cmbMessageList.getSelectedItem()).equals("RON")) {
					lblTextSuma.setText("RON");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 RON = 1 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 RON = 0.21 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 RON = 0.004 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 RON = 0.34 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 RON = 0.30 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 RON = 0.23 USD");
					}
				}
				if (((String) cmbMessageList.getSelectedItem()).equals("EUR")) {
					lblTextSuma.setText("EUR");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 EUR = 4.77 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 EUR = 1 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 EUR = 0.02 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 EUR = 1.61 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 EUR = 1.46 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 EUR = 1.11 USD");
					}
				}
				if (((String) cmbMessageList.getSelectedItem()).equals("USD")) {
					lblTextSuma.setText("USD");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 USD = 4.28 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 USD = 0.89 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 USD = 0.02 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 USD = 1.45 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 USD = 1.31 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 USD = 1 USD");
					}
				}
				if (((String) cmbMessageList.getSelectedItem()).equals("CAD")) {
					lblTextSuma.setText("CAD");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 CAD = 3.26 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 CAD = 0.68 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 CAD = 0.016 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 CAD =1.1 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 CAD = 1 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 CAD = 0.76 USD");
					}
				}
				if (((String) cmbMessageList.getSelectedItem()).equals("XAU")) {
					lblTextSuma.setText("XAU");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 XAU = 203.68 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 XAU = 42.62 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 XAU = 1 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 XAU = 68.99 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 XAU = 62.38 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 XAU = 47.5 USD");
					}
				}
				if (((String) cmbMessageList.getSelectedItem()).equals("AUD")) {
					lblTextSuma.setText("AUD");
					if (aux.equals("RON")) {
						lblTextRezultat.setText("RON");
						lblText.setText("1 AUD = 2.95 RON");
					}
					if (aux.equals("EUR")) {
						lblTextRezultat.setText("EUR");
						lblText.setText("1 AUD = 0.61 EUR");
					}
					if (aux.equals("XAU")) {
						lblTextRezultat.setText("XAU");
						lblText.setText("1 AUD = 0.014 XAU");
					}
					if (aux.equals("AUD")) {
						lblTextRezultat.setText("AUD");
						lblText.setText("1 AUD = 1 AUD");
					}
					if (aux.equals("CAD")) {
						lblTextRezultat.setText("CAD");
						lblText.setText("1 AUD = 0.90 CAD");
					}
					if (aux.equals("USD")) {
						lblTextRezultat.setText("USD");
						lblText.setText("1 AUD = 0.68 USD");
					}
				}
			}
		}
		
	}