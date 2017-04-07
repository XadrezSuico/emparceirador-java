package io.github.xadrezsuico.system.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import javax.swing.JDesktopPane;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JTabbedPane;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setForeground(new Color(0, 0, 0));
		menuBar.setBackground(Color.WHITE);
		setJMenuBar(menuBar);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 38, 21, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNovoTorneio = new JButton("Novo Torneio");
		GridBagConstraints gbc_btnNovoTorneio = new GridBagConstraints();
		gbc_btnNovoTorneio.insets = new Insets(0, 0, 0, 5);
		gbc_btnNovoTorneio.gridx = 0;
		gbc_btnNovoTorneio.gridy = 0;
		panel.add(btnNovoTorneio, gbc_btnNovoTorneio);
		
		JButton btnAbrirTorneio = new JButton("Abrir Torneio");
		GridBagConstraints gbc_btnAbrirTorneio = new GridBagConstraints();
		gbc_btnAbrirTorneio.gridx = 1;
		gbc_btnAbrirTorneio.gridy = 0;
		panel.add(btnAbrirTorneio, gbc_btnAbrirTorneio);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(Color.LIGHT_GRAY);
		GridBagConstraints gbc_desktopPane = new GridBagConstraints();
		gbc_desktopPane.gridheight = 6;
		gbc_desktopPane.insets = new Insets(0, 0, 5, 0);
		gbc_desktopPane.fill = GridBagConstraints.BOTH;
		gbc_desktopPane.gridx = 0;
		gbc_desktopPane.gridy = 1;
		contentPane.add(desktopPane, gbc_desktopPane);
		
		
		JTextPane textPane = new JTextPane();
		GridBagConstraints gbc_textPane = new GridBagConstraints();
		gbc_textPane.fill = GridBagConstraints.BOTH;
		gbc_textPane.gridx = 0;
		gbc_textPane.gridy = 7;
		contentPane.add(textPane, gbc_textPane);
		

	}
}
