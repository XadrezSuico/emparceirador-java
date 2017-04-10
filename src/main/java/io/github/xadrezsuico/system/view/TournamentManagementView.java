package io.github.xadrezsuico.system.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JTabbedPane;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class TournamentManagementView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TournamentManagementView frame = new TournamentManagementView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TournamentManagementView() {
		setTitle("Tela Torneio");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 3;
		gbc_tabbedPane.gridwidth = 2;
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 0;
		gbc_tabbedPane.gridy = 0;
		contentPane.add(tabbedPane, gbc_tabbedPane);
		
		JPanel tab_lista_incritos = new JPanel();
		tabbedPane.addTab("Inscritos", null, tab_lista_incritos, null);
		GridBagLayout gbl_tab_lista_incritos = new GridBagLayout();
		gbl_tab_lista_incritos.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_tab_lista_incritos.rowHeights = new int[]{0, 0, 0};
		gbl_tab_lista_incritos.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_tab_lista_incritos.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		tab_lista_incritos.setLayout(gbl_tab_lista_incritos);
		
		JButton btnNovo = new JButton("Novo");
		GridBagConstraints gbc_btnNovo = new GridBagConstraints();
		gbc_btnNovo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovo.gridx = 0;
		gbc_btnNovo.gridy = 0;
		tab_lista_incritos.add(btnNovo, gbc_btnNovo);
		
		JButton btnEditar = new JButton("Editar");
		GridBagConstraints gbc_btnEditar = new GridBagConstraints();
		gbc_btnEditar.insets = new Insets(0, 0, 5, 5);
		gbc_btnEditar.gridx = 1;
		gbc_btnEditar.gridy = 0;
		tab_lista_incritos.add(btnEditar, gbc_btnEditar);
		
		JButton btnExcluir = new JButton("Excluir");
		GridBagConstraints gbc_btnExcluir = new GridBagConstraints();
		gbc_btnExcluir.insets = new Insets(0, 0, 5, 5);
		gbc_btnExcluir.gridx = 2;
		gbc_btnExcluir.gridy = 0;
		tab_lista_incritos.add(btnExcluir, gbc_btnExcluir);
		
		JButton btnImprimir = new JButton("Imprimir");
		GridBagConstraints gbc_btnImprimir = new GridBagConstraints();
		gbc_btnImprimir.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimir.gridx = 3;
		gbc_btnImprimir.gridy = 0;
		tab_lista_incritos.add(btnImprimir, gbc_btnImprimir);
		
		table = new JTable();
		GridBagConstraints gbc_table = new GridBagConstraints();
		gbc_table.gridwidth = 11;
		gbc_table.fill = GridBagConstraints.BOTH;
		gbc_table.gridx = 0;
		gbc_table.gridy = 1;
		tab_lista_incritos.add(table, gbc_table);
		
		JPanel tab_rodada = new JPanel();
		tabbedPane.addTab("Rodada", null, tab_rodada, null);
		GridBagLayout gbl_tab_rodada = new GridBagLayout();
		gbl_tab_rodada.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_tab_rodada.rowHeights = new int[]{0, 0, 0, 0};
		gbl_tab_rodada.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_tab_rodada.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		tab_rodada.setLayout(gbl_tab_rodada);
		
		JButton btnNovaRodada = new JButton("Nova Rodada");
		GridBagConstraints gbc_btnNovaRodada = new GridBagConstraints();
		gbc_btnNovaRodada.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNovaRodada.gridwidth = 2;
		gbc_btnNovaRodada.insets = new Insets(0, 0, 5, 5);
		gbc_btnNovaRodada.gridx = 0;
		gbc_btnNovaRodada.gridy = 0;
		tab_rodada.add(btnNovaRodada, gbc_btnNovaRodada);
		
		JButton btnDesfazer = new JButton("Desfazer Rodada");
		GridBagConstraints gbc_btnDesfazer = new GridBagConstraints();
		gbc_btnDesfazer.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDesfazer.gridwidth = 2;
		gbc_btnDesfazer.insets = new Insets(0, 0, 5, 5);
		gbc_btnDesfazer.gridx = 2;
		gbc_btnDesfazer.gridy = 0;
		tab_rodada.add(btnDesfazer, gbc_btnDesfazer);
		
		JButton btnImprimirRodada = new JButton("Imprimir Rodada");
		GridBagConstraints gbc_btnImprimirRodada = new GridBagConstraints();
		gbc_btnImprimirRodada.gridwidth = 2;
		gbc_btnImprimirRodada.insets = new Insets(0, 0, 5, 5);
		gbc_btnImprimirRodada.gridx = 4;
		gbc_btnImprimirRodada.gridy = 0;
		tab_rodada.add(btnImprimirRodada, gbc_btnImprimirRodada);
		
		table_1 = new JTable();
		GridBagConstraints gbc_table_1 = new GridBagConstraints();
		gbc_table_1.insets = new Insets(0, 0, 5, 0);
		gbc_table_1.gridwidth = 15;
		gbc_table_1.fill = GridBagConstraints.BOTH;
		gbc_table_1.gridx = 0;
		gbc_table_1.gridy = 1;
		tab_rodada.add(table_1, gbc_table_1);
		
		JButton button_2 = new JButton("1:0");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_2.insets = new Insets(0, 0, 0, 5);
		gbc_button_2.gridx = 0;
		gbc_button_2.gridy = 2;
		tab_rodada.add(button_2, gbc_button_2);
		
		JButton button_1 = new JButton("0:0");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_1.insets = new Insets(0, 0, 0, 5);
		gbc_button_1.gridx = 1;
		gbc_button_1.gridy = 2;
		tab_rodada.add(button_1, gbc_button_1);
		
		JButton button = new JButton("0:1");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.fill = GridBagConstraints.HORIZONTAL;
		gbc_button.insets = new Insets(0, 0, 0, 5);
		gbc_button.gridx = 2;
		gbc_button.gridy = 2;
		tab_rodada.add(button, gbc_button);
		
		JButton button_3 = new JButton(".5:.5");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_3.insets = new Insets(0, 0, 0, 5);
		gbc_button_3.gridx = 3;
		gbc_button_3.gridy = 2;
		tab_rodada.add(button_3, gbc_button_3);
		
		JButton button_4 = new JButton(".5:0");
		GridBagConstraints gbc_button_4 = new GridBagConstraints();
		gbc_button_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_4.insets = new Insets(0, 0, 0, 5);
		gbc_button_4.gridx = 4;
		gbc_button_4.gridy = 2;
		tab_rodada.add(button_4, gbc_button_4);
		
		JButton button_5 = new JButton("0:.5");
		GridBagConstraints gbc_button_5 = new GridBagConstraints();
		gbc_button_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_button_5.insets = new Insets(0, 0, 0, 5);
		gbc_button_5.gridx = 5;
		gbc_button_5.gridy = 2;
		tab_rodada.add(button_5, gbc_button_5);
		
		JButton btnW = new JButton("W:o");
		GridBagConstraints gbc_btnW = new GridBagConstraints();
		gbc_btnW.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnW.insets = new Insets(0, 0, 0, 5);
		gbc_btnW.gridx = 6;
		gbc_btnW.gridy = 2;
		tab_rodada.add(btnW, gbc_btnW);
		
		JButton btnw = new JButton("o:W");
		GridBagConstraints gbc_btnw = new GridBagConstraints();
		gbc_btnw.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnw.insets = new Insets(0, 0, 0, 5);
		gbc_btnw.gridx = 7;
		gbc_btnw.gridy = 2;
		tab_rodada.add(btnw, gbc_btnw);
		
		JButton btnOo = new JButton("o:o");
		GridBagConstraints gbc_btnOo = new GridBagConstraints();
		gbc_btnOo.insets = new Insets(0, 0, 0, 5);
		gbc_btnOo.gridx = 8;
		gbc_btnOo.gridy = 2;
		tab_rodada.add(btnOo, gbc_btnOo);
		
		JPanel tab_classificaco = new JPanel();
		tabbedPane.addTab("Classifica\u00E7\u00E3o", null, tab_classificaco, null);
	}

}
