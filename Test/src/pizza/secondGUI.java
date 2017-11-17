package pizza;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JLabel;

public class secondGUI extends JFrame
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					secondGUI frame = new secondGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public secondGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 544, 364);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblPizza = new JLabel("Pizza:");
		GridBagConstraints gbc_lblPizza = new GridBagConstraints();
		gbc_lblPizza.anchor = GridBagConstraints.WEST;
		gbc_lblPizza.gridwidth = 3;
		gbc_lblPizza.insets = new Insets(0, 0, 5, 5);
		gbc_lblPizza.gridx = 0;
		gbc_lblPizza.gridy = 0;
		contentPane.add(lblPizza, gbc_lblPizza);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 6;
		gbc_comboBox.insets = new Insets(0, 0, 5, 0);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 3;
		gbc_comboBox.gridy = 0;
		contentPane.add(comboBox, gbc_comboBox);
		
		JLabel lblExtras = new JLabel("Extras:");
		GridBagConstraints gbc_lblExtras = new GridBagConstraints();
		gbc_lblExtras.anchor = GridBagConstraints.WEST;
		gbc_lblExtras.gridwidth = 3;
		gbc_lblExtras.insets = new Insets(0, 0, 5, 5);
		gbc_lblExtras.gridx = 0;
		gbc_lblExtras.gridy = 1;
		contentPane.add(lblExtras, gbc_lblExtras);
		
		JComboBox comboBox_1 = new JComboBox();
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 3;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 3;
		gbc_comboBox_1.gridy = 1;
		contentPane.add(comboBox_1, gbc_comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.gridwidth = 3;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 6;
		gbc_comboBox_2.gridy = 1;
		contentPane.add(comboBox_2, gbc_comboBox_2);
	}

}
