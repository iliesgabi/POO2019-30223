package javasmmr.zoowsome.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javasmmr.zoowsome.views.AddFrame;
import javasmmr.zoowsome.views.MainMenuFrame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenuController extends AbstractController {
	
	
	public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
		super(frame, hasBackButton);
		frame.setAddButtonActionListener(new AddButtonActionListener());
		frame.setSaveAndExitButtonActionListener(new SaveAndExitButtonListener());
		frame.setListButtonActionListener(new ListButtonActionListener());
	}

	private class AddButtonActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			new AddController(new AddFrame("Add"), true);
		}
	}
	
	private class SaveAndExitButtonListener implements ActionListener{

		@Override
		 public void actionPerformed(ActionEvent e) {
	            System.exit(0);
	        }
	}
	    
	    
	private static class ListButtonActionListener extends JPanel implements ActionListener  {

	    
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
		
	}

}
	