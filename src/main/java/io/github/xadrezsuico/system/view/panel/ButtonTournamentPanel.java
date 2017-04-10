package io.github.xadrezsuico.system.view.panel;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;

public class ButtonTournamentPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ButtonTournamentPanel() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JButton btnNovoTorneio = new JButton("Novo Torneio");
		GridBagConstraints gbc_btnNovoTorneio = new GridBagConstraints();
		gbc_btnNovoTorneio.gridx = 0;
		gbc_btnNovoTorneio.gridy = 0;
		add(btnNovoTorneio, gbc_btnNovoTorneio);

	}

}
