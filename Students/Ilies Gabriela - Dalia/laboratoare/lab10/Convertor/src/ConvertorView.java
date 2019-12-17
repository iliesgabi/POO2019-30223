import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConvertorView extends JFrame {
	private ConvertorModel m_model;
	private ComboBox comboBox = new ComboBox();
	private JTextField m_userInputTf = new JTextField(5);
	private JTextField m_totalTf = new JTextField(5);
	private JButton button = new JButton("Converteste");

	ConvertorView(ConvertorModel model) {
		m_model = model;
		m_model.setValue(ConvertorModel.INITIAL_VALUE);

		m_totalTf.setText(m_model.getValue());
		m_totalTf.setEditable(false);

		JFrame jf = new JFrame("Convertor");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(new Dimension(500, 500));
		jf.setLocation(300, 300);

		JPanel content = new JPanel();
		content.setLayout(new FlowLayout());

		content.add(comboBox.getLblText());
		content.add(Box.createRigidArea(new Dimension(1000, 5)));

		content.add(comboBox.getCmbMessageList());
		content.add(comboBox.getCmbMessageList2());
		content.add(Box.createRigidArea(new Dimension(1000, 5)));
		content.add(new JLabel("Suma: "));
		content.add(m_userInputTf);
		content.add(comboBox.getLblTextSuma());

		content.add(Box.createRigidArea(new Dimension(1000, 5)));
		content.add(button);

		content.add(Box.createRigidArea(new Dimension(1000, 5)));
		content.add(new JLabel("Rezultat: "));
		content.add(m_totalTf);
		content.add(comboBox.getLblTextRezultat());
		
		content.setBackground(Color.pink);
		jf.add(content);
		jf.setVisible(true);
	}

	void reset() {
		m_totalTf.setText(ConvertorModel.INITIAL_VALUE);
	}

	String getUserInput() {

		return m_userInputTf.getText();
	}

	void setTotal(String newTotal) {
		m_totalTf.setText(newTotal);
	}

	void showError(String errMessage) {
		JOptionPane.showMessageDialog(this, errMessage);
	}

	void addMultiplyListener(ActionListener mal) {
		button.addActionListener(mal);
	}
	public String getSuma() {
		return (String)comboBox.getCmbMessageList().getSelectedItem();
	}

	public String getRezultat() {
		return (String)comboBox.getCmbMessageList2().getSelectedItem();
	}
}
