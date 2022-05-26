package io.github.xadrezsuico.system.view.panel;

import javax.swing.JPanel;

import io.github.xadrezsuico.system.controller.EventController;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonEventoPanel extends JPanel {

	EventController event_controller;
	
	/**
	 * Create the panel.
	 */
	public ButtonEventoPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnNovoEvento = new JButton("Novo Evento");
		btnNovoEvento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				newEvento();
			}
		});
		GridBagConstraints gbc_btnNovoEvento = new GridBagConstraints();
		gbc_btnNovoEvento.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovoEvento.gridx = 0;
		gbc_btnNovoEvento.gridy = 0;
		add(btnNovoEvento, gbc_btnNovoEvento);
		
		JButton btnAbrirEvento = new JButton("Abrir Evento");
		GridBagConstraints gbc_btnAbrirEvento = new GridBagConstraints();
		gbc_btnAbrirEvento.gridx = 1;
		gbc_btnAbrirEvento.gridy = 0;
		add(btnAbrirEvento, gbc_btnAbrirEvento);
		
		this.event_controller = EventController.getInstance();
	}
	
	protected void newEvento() {
		this.event_controller.newEvent();
	}

}
