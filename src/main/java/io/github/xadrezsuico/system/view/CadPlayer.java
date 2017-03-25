package io.github.xadrezsuico.system.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import io.github.xadrezsuico.system.common.enums.Sex;
import io.github.xadrezsuico.system.common.enums.Title;
import javax.swing.JButton;

public class CadPlayer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadReferee frame = new CadReferee();
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
	public CadPlayer() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 478, 403);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{144, 228, 147, 0};
		gbl_contentPane.rowHeights = new int[]{96, 88, 79, 0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridheight = 2;
		gbc_panel.gridwidth = 2;
		gbc_panel.insets = new Insets(0, 0, 5, 5);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{126, 57, 33, 41, 86, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblStartN = new JLabel("Start N\u00BA:");
		GridBagConstraints gbc_lblStartN = new GridBagConstraints();
		gbc_lblStartN.anchor = GridBagConstraints.EAST;
		gbc_lblStartN.insets = new Insets(0, 0, 5, 5);
		gbc_lblStartN.gridx = 0;
		gbc_lblStartN.gridy = 0;
		panel.add(lblStartN, gbc_lblStartN);
		
		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 0;
		panel.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name:");
		GridBagConstraints gbc_lblFirstName = new GridBagConstraints();
		gbc_lblFirstName.insets = new Insets(0, 0, 5, 5);
		gbc_lblFirstName.anchor = GridBagConstraints.EAST;
		gbc_lblFirstName.gridx = 0;
		gbc_lblFirstName.gridy = 1;
		panel.add(lblFirstName, gbc_lblFirstName);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 0);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 1;
		panel.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name:");
		GridBagConstraints gbc_lblLastName = new GridBagConstraints();
		gbc_lblLastName.anchor = GridBagConstraints.EAST;
		gbc_lblLastName.insets = new Insets(0, 0, 5, 5);
		gbc_lblLastName.gridx = 0;
		gbc_lblLastName.gridy = 2;
		panel.add(lblLastName, gbc_lblLastName);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 0);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 2;
		panel.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex:");
		GridBagConstraints gbc_lblSex = new GridBagConstraints();
		gbc_lblSex.anchor = GridBagConstraints.EAST;
		gbc_lblSex.insets = new Insets(0, 0, 5, 5);
		gbc_lblSex.gridx = 0;
		gbc_lblSex.gridy = 3;
		panel.add(lblSex, gbc_lblSex);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(Sex.values()));
		comboBox.setToolTipText("");
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 2;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		panel.add(comboBox, gbc_comboBox);
		
		JLabel lblTitle = new JLabel("Title");
		GridBagConstraints gbc_lblTitle = new GridBagConstraints();
		gbc_lblTitle.anchor = GridBagConstraints.EAST;
		gbc_lblTitle.insets = new Insets(0, 0, 5, 5);
		gbc_lblTitle.gridx = 3;
		gbc_lblTitle.gridy = 3;
		panel.add(lblTitle, gbc_lblTitle);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(Title.values()));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 3;
		panel.add(comboBox_1, gbc_comboBox_1);
		
		JLabel lblBirthDate = new JLabel("Birth Date:");
		GridBagConstraints gbc_lblBirthDate = new GridBagConstraints();
		gbc_lblBirthDate.anchor = GridBagConstraints.EAST;
		gbc_lblBirthDate.insets = new Insets(0, 0, 5, 5);
		gbc_lblBirthDate.gridx = 0;
		gbc_lblBirthDate.gridy = 4;
		panel.add(lblBirthDate, gbc_lblBirthDate);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 4;
		panel.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblRegistryNumber = new JLabel("Registration document:");
		GridBagConstraints gbc_lblRegistryNumber = new GridBagConstraints();
		gbc_lblRegistryNumber.anchor = GridBagConstraints.EAST;
		gbc_lblRegistryNumber.insets = new Insets(0, 0, 5, 5);
		gbc_lblRegistryNumber.gridx = 0;
		gbc_lblRegistryNumber.gridy = 5;
		panel.add(lblRegistryNumber, gbc_lblRegistryNumber);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 5;
		panel.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblCity = new JLabel("City:");
		GridBagConstraints gbc_lblCity = new GridBagConstraints();
		gbc_lblCity.anchor = GridBagConstraints.EAST;
		gbc_lblCity.insets = new Insets(0, 0, 0, 5);
		gbc_lblCity.gridx = 0;
		gbc_lblCity.gridy = 6;
		panel.add(lblCity, gbc_lblCity);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.gridwidth = 2;
		gbc_textField_5.insets = new Insets(0, 0, 0, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 6;
		panel.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridheight = 4;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 2;
		gbc_panel_3.gridy = 0;
		contentPane.add(panel_3, gbc_panel_3);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{25, 25, 0, 0, 0, 0};
		gbl_panel_3.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JButton btnOk = new JButton("OK");
		GridBagConstraints gbc_btnOk = new GridBagConstraints();
		gbc_btnOk.insets = new Insets(0, 0, 5, 0);
		gbc_btnOk.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnOk.gridwidth = 4;
		gbc_btnOk.gridx = 1;
		gbc_btnOk.gridy = 1;
		panel_3.add(btnOk, gbc_btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnCancel.gridwidth = 4;
		gbc_btnCancel.insets = new Insets(0, 0, 5, 0);
		gbc_btnCancel.gridx = 1;
		gbc_btnCancel.gridy = 2;
		panel_3.add(btnCancel, gbc_btnCancel);
		
		JButton btnAddNew = new JButton("Add New");
		GridBagConstraints gbc_btnAddNew = new GridBagConstraints();
		gbc_btnAddNew.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnAddNew.gridwidth = 4;
		gbc_btnAddNew.insets = new Insets(0, 0, 5, 0);
		gbc_btnAddNew.gridx = 1;
		gbc_btnAddNew.gridy = 3;
		panel_3.add(btnAddNew, gbc_btnAddNew);
		
		JButton btnNext = new JButton("Next");
		GridBagConstraints gbc_btnNext = new GridBagConstraints();
		gbc_btnNext.gridwidth = 4;
		gbc_btnNext.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNext.insets = new Insets(0, 0, 5, 0);
		gbc_btnNext.gridx = 1;
		gbc_btnNext.gridy = 7;
		panel_3.add(btnNext, gbc_btnNext);
		
		JButton btnPrevious = new JButton("Previous");
		GridBagConstraints gbc_btnPrevious = new GridBagConstraints();
		gbc_btnPrevious.insets = new Insets(0, 0, 5, 0);
		gbc_btnPrevious.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnPrevious.gridwidth = 4;
		gbc_btnPrevious.gridx = 1;
		gbc_btnPrevious.gridy = 8;
		panel_3.add(btnPrevious, gbc_btnPrevious);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 2;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{60, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblCountry = new JLabel("Country:");
		GridBagConstraints gbc_lblCountry = new GridBagConstraints();
		gbc_lblCountry.anchor = GridBagConstraints.EAST;
		gbc_lblCountry.insets = new Insets(0, 0, 5, 5);
		gbc_lblCountry.gridx = 0;
		gbc_lblCountry.gridy = 0;
		panel_1.add(lblCountry, gbc_lblCountry);
		
		textField_6 = new JTextField();
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 1;
		gbc_textField_6.gridy = 0;
		panel_1.add(textField_6, gbc_textField_6);
		textField_6.setColumns(10);
		
		JLabel lblId = new JLabel("Id:");
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.anchor = GridBagConstraints.EAST;
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 0;
		panel_1.add(lblId, gbc_lblId);
		
		textField_9 = new JTextField();
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.gridwidth = 3;
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 0;
		panel_1.add(textField_9, gbc_textField_9);
		textField_9.setColumns(10);
		
		JLabel lblLocalRtg = new JLabel("Local Rtg:");
		GridBagConstraints gbc_lblLocalRtg = new GridBagConstraints();
		gbc_lblLocalRtg.anchor = GridBagConstraints.EAST;
		gbc_lblLocalRtg.insets = new Insets(0, 0, 5, 5);
		gbc_lblLocalRtg.gridx = 0;
		gbc_lblLocalRtg.gridy = 1;
		panel_1.add(lblLocalRtg, gbc_lblLocalRtg);
		
		textField_7 = new JTextField();
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 1;
		gbc_textField_7.gridy = 1;
		panel_1.add(textField_7, gbc_textField_7);
		textField_7.setColumns(10);
		
		JLabel lblId_1 = new JLabel("Id:");
		GridBagConstraints gbc_lblId_1 = new GridBagConstraints();
		gbc_lblId_1.anchor = GridBagConstraints.EAST;
		gbc_lblId_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblId_1.gridx = 3;
		gbc_lblId_1.gridy = 1;
		panel_1.add(lblId_1, gbc_lblId_1);
		
		textField_10 = new JTextField();
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.gridwidth = 3;
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 4;
		gbc_textField_10.gridy = 1;
		panel_1.add(textField_10, gbc_textField_10);
		textField_10.setColumns(10);
		
		JLabel lblIntlRtg = new JLabel("Intl Rtg:");
		GridBagConstraints gbc_lblIntlRtg = new GridBagConstraints();
		gbc_lblIntlRtg.insets = new Insets(0, 0, 0, 5);
		gbc_lblIntlRtg.anchor = GridBagConstraints.EAST;
		gbc_lblIntlRtg.gridx = 0;
		gbc_lblIntlRtg.gridy = 2;
		panel_1.add(lblIntlRtg, gbc_lblIntlRtg);
		
		textField_8 = new JTextField();
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 0, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 1;
		gbc_textField_8.gridy = 2;
		panel_1.add(textField_8, gbc_textField_8);
		textField_8.setColumns(10);
		
		JLabel lblId_2 = new JLabel("Id:");
		GridBagConstraints gbc_lblId_2 = new GridBagConstraints();
		gbc_lblId_2.anchor = GridBagConstraints.EAST;
		gbc_lblId_2.insets = new Insets(0, 0, 0, 5);
		gbc_lblId_2.gridx = 3;
		gbc_lblId_2.gridy = 2;
		panel_1.add(lblId_2, gbc_lblId_2);
		
		textField_11 = new JTextField();
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.gridwidth = 3;
		gbc_textField_11.insets = new Insets(0, 0, 0, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 4;
		gbc_textField_11.gridy = 2;
		panel_1.add(textField_11, gbc_textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 2;
		gbc_panel_2.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 3;
		contentPane.add(panel_2, gbc_panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		gbl_panel_2.rowHeights = new int[]{0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblFederation = new JLabel("Federation:");
		GridBagConstraints gbc_lblFederation = new GridBagConstraints();
		gbc_lblFederation.anchor = GridBagConstraints.EAST;
		gbc_lblFederation.insets = new Insets(0, 0, 5, 5);
		gbc_lblFederation.gridx = 0;
		gbc_lblFederation.gridy = 0;
		panel_2.add(lblFederation, gbc_lblFederation);
		
		textField_12 = new JTextField();
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.gridx = 1;
		gbc_textField_12.gridy = 0;
		panel_2.add(textField_12, gbc_textField_12);
		textField_12.setColumns(10);
		
		JLabel lblClub = new JLabel("Club:");
		GridBagConstraints gbc_lblClub = new GridBagConstraints();
		gbc_lblClub.insets = new Insets(0, 0, 5, 5);
		gbc_lblClub.anchor = GridBagConstraints.EAST;
		gbc_lblClub.gridx = 0;
		gbc_lblClub.gridy = 1;
		panel_2.add(lblClub, gbc_lblClub);
		
		textField_13 = new JTextField();
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridwidth = 4;
		gbc_textField_13.insets = new Insets(0, 0, 5, 0);
		gbc_textField_13.gridx = 1;
		gbc_textField_13.gridy = 1;
		panel_2.add(textField_13, gbc_textField_13);
		textField_13.setColumns(10);
		
		JCheckBox chckbxActive = new JCheckBox("Active");
		GridBagConstraints gbc_chckbxActive = new GridBagConstraints();
		gbc_chckbxActive.gridx = 4;
		gbc_chckbxActive.gridy = 2;
		panel_2.add(chckbxActive, gbc_chckbxActive);
	}

}
