package col;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {
	
	private JFrame frame;
	private Farmacie model;
	private JButton buttonStart;
	private JButton buttonSortare;
	private JPanel panel;
	
	
	public View(Farmacie model) {
		this.model=model;
		frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(300,300));
		
		panel= new JPanel();
		panel.setLayout(new FlowLayout());
		buttonStart= new JButton(" Start ");
		panel.add(buttonStart);
		
		buttonSortare= new JButton(" Sortare ");
		panel.add(buttonSortare);
		
		frame.add(panel);
		frame.setVisible(true);
	}
	
	public void start(ActionListener e) {
		buttonStart.addActionListener(e);
	}
	
	public void sortare(ActionListener e) {
		buttonSortare.addActionListener(e);
	}
}
