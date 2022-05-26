package io.github.xadrezsuico.system.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import io.github.xadrezsuico.system.controller.EventController;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventView extends JFrame {

	private JPanel contentPane;
	private JTextField tf_nome;
	private JTextField tf_data_inicio;
	private JTextField tf_data_fim;
	private JTextField tf_tempo;
	
	private EventController eventController;

	/**
	 * Create the frame.
	 */
	public EventView() {
		setTitle("Novo Evento");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 388, 257);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNome = new JLabel("Nome:");
		GridBagConstraints gbc_lblNome = new GridBagConstraints();
		gbc_lblNome.gridwidth = 7;
		gbc_lblNome.insets = new Insets(0, 0, 5, 0);
		gbc_lblNome.anchor = GridBagConstraints.WEST;
		gbc_lblNome.gridx = 0;
		gbc_lblNome.gridy = 0;
		contentPane.add(lblNome, gbc_lblNome);
		
		tf_nome = new JTextField();
		GridBagConstraints gbc_tf_nome = new GridBagConstraints();
		gbc_tf_nome.gridwidth = 7;
		gbc_tf_nome.insets = new Insets(0, 0, 5, 0);
		gbc_tf_nome.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_nome.gridx = 0;
		gbc_tf_nome.gridy = 1;
		contentPane.add(tf_nome, gbc_tf_nome);
		tf_nome.setColumns(10);
		
		JLabel lblDataInicio = new JLabel("Data Inicio:");
		GridBagConstraints gbc_lblDataInicio = new GridBagConstraints();
		gbc_lblDataInicio.gridwidth = 4;
		gbc_lblDataInicio.anchor = GridBagConstraints.WEST;
		gbc_lblDataInicio.insets = new Insets(0, 0, 5, 5);
		gbc_lblDataInicio.gridx = 0;
		gbc_lblDataInicio.gridy = 2;
		contentPane.add(lblDataInicio, gbc_lblDataInicio);
		
		JLabel lblDataFim = new JLabel("Data Fim:");
		GridBagConstraints gbc_lblDataFim = new GridBagConstraints();
		gbc_lblDataFim.gridwidth = 3;
		gbc_lblDataFim.insets = new Insets(0, 0, 5, 0);
		gbc_lblDataFim.anchor = GridBagConstraints.WEST;
		gbc_lblDataFim.gridx = 4;
		gbc_lblDataFim.gridy = 2;
		contentPane.add(lblDataFim, gbc_lblDataFim);
		
		tf_data_inicio = new JTextField();
		GridBagConstraints gbc_tf_data_inicio = new GridBagConstraints();
		gbc_tf_data_inicio.gridwidth = 3;
		gbc_tf_data_inicio.insets = new Insets(0, 0, 5, 5);
		gbc_tf_data_inicio.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_data_inicio.gridx = 0;
		gbc_tf_data_inicio.gridy = 3;
		contentPane.add(tf_data_inicio, gbc_tf_data_inicio);
		tf_data_inicio.setColumns(10);
		
		tf_data_fim = new JTextField();
		GridBagConstraints gbc_tf_data_fim = new GridBagConstraints();
		gbc_tf_data_fim.gridwidth = 3;
		gbc_tf_data_fim.insets = new Insets(0, 0, 5, 0);
		gbc_tf_data_fim.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_data_fim.gridx = 4;
		gbc_tf_data_fim.gridy = 3;
		contentPane.add(tf_data_fim, gbc_tf_data_fim);
		tf_data_fim.setColumns(10);
		
		JLabel lblTipoDeModalidade = new JLabel("Tempo de Jogo");
		GridBagConstraints gbc_lblTipoDeModalidade = new GridBagConstraints();
		gbc_lblTipoDeModalidade.anchor = GridBagConstraints.WEST;
		gbc_lblTipoDeModalidade.gridwidth = 7;
		gbc_lblTipoDeModalidade.insets = new Insets(0, 0, 5, 0);
		gbc_lblTipoDeModalidade.gridx = 0;
		gbc_lblTipoDeModalidade.gridy = 4;
		contentPane.add(lblTipoDeModalidade, gbc_lblTipoDeModalidade);
		
		tf_tempo = new JTextField();
		GridBagConstraints gbc_tf_tempo = new GridBagConstraints();
		gbc_tf_tempo.gridwidth = 7;
		gbc_tf_tempo.insets = new Insets(0, 0, 5, 0);
		gbc_tf_tempo.fill = GridBagConstraints.HORIZONTAL;
		gbc_tf_tempo.gridx = 0;
		gbc_tf_tempo.gridy = 5;
		contentPane.add(tf_tempo, gbc_tf_tempo);
		tf_tempo.setColumns(10);
		
		JLabel lblModalidade = new JLabel("Modalidade");
		GridBagConstraints gbc_lblModalidade = new GridBagConstraints();
		gbc_lblModalidade.gridwidth = 7;
		gbc_lblModalidade.anchor = GridBagConstraints.WEST;
		gbc_lblModalidade.insets = new Insets(0, 0, 5, 0);
		gbc_lblModalidade.gridx = 0;
		gbc_lblModalidade.gridy = 6;
		contentPane.add(lblModalidade, gbc_lblModalidade);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 7;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 0;
		gbc_comboBox.gridy = 7;
		contentPane.add(comboBox, gbc_comboBox);
		
		JButton btnCancelar = new JButton("Cancelar");
		GridBagConstraints gbc_btnCancelar = new GridBagConstraints();
		gbc_btnCancelar.gridwidth = 3;
		gbc_btnCancelar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancelar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCancelar.gridx = 0;
		gbc_btnCancelar.gridy = 8;
		contentPane.add(btnCancelar, gbc_btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				save();
			}
		});
		GridBagConstraints gbc_btnSalvar = new GridBagConstraints();
		gbc_btnSalvar.insets = new Insets(0, 0, 0, 5);
		gbc_btnSalvar.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnSalvar.gridwidth = 3;
		gbc_btnSalvar.gridx = 4;
		gbc_btnSalvar.gridy = 8;
		contentPane.add(btnSalvar, gbc_btnSalvar);
		
		this.eventController = EventController.getInstance();
	}
	
	public void save() {
		this.eventController.open("");
	}

}
