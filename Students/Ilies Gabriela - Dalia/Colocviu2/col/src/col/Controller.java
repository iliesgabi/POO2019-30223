package col;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;

public class Controller {
	private Farmacie model;
	private View view;
	
	public Controller(Farmacie model, View view)
	{
		this.model=model;
		this.view=view;
		view.start(new ListenerStart());
		view.sortare(new ListenerSortare());
	}
	
	private class ListenerStart implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new Simulare(model);
		}
		
	}
	
	private class ListenerSortare implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			SortareBonus sortare= new SortareBonus();
			Collections.sort(model.getAngajati(),sortare);
			model.listAngajati();
		}
		
	}
}
