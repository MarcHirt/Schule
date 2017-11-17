package pizza;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends Frame
{
	private JLabel l_Pizza;
	private JLabel l_Extras;
	private JLabel l_Groesse;
	private JLabel l_Gesamtpreis;
	private JLabel l_PreisAusgabe;
	
	private JButton b_Hinzufuegen;
	private JButton b_Entfernen;
	private JButton b_Drucken;
	private JButton b_Hardcopy;
	
	private TextField t_Extras;
	private TextField t_ExtrasPreis;
	
	private List li_Liste;
	
	private Choice c_PizzaAuswahl;
	private Choice c_GroesseAuswahl;
		
	public static void main(String[] args)
	{
		GUI gui = new GUI();
	}
	
	public GUI()
	{
		initialize();
	}
	
	private void initialize()
	{
		setLayout(new GridBagLayout());
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.anchor = GridBagConstraints.WEST;
		gbc.fill = GridBagConstraints.BOTH;
		
		l_Groesse = new JLabel("Grösse: ");
		gbc.gridx =3;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(l_Groesse,gbc);
		
		l_PreisAusgabe = new JLabel("HIER DER PREIS");
		gbc.gridx = 1;
		gbc.gridy = 12;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		add(l_PreisAusgabe,gbc);
		
		l_Gesamtpreis = new JLabel("Gesamtpreis: ");
		gbc.gridx = 0;
		gbc.gridy = 12;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(l_Gesamtpreis,gbc);
		
		l_Extras = new JLabel("Extras: ");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(l_Extras,gbc);
		
		l_Pizza = new JLabel("Pizza: ");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(l_Pizza,gbc);
		
		b_Hinzufuegen = new JButton("Hinzufügen");
		gbc.gridx = 4;
		gbc.gridy = 2;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(b_Hinzufuegen,gbc);
		
		b_Hinzufuegen.addActionListener(e -> hinzufuegen());
		
		b_Entfernen = new JButton("Entfernen");
		gbc.gridx = 4;
		gbc.gridy = 3;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(b_Entfernen,gbc);
		
		b_Entfernen.addActionListener(e -> entfernen());
		
		b_Drucken = new JButton("Drucken");
		gbc.gridx = 3;
		gbc.gridy = 12;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(b_Drucken,gbc);
		
		b_Drucken.addActionListener(e -> drucken());
		
		b_Hardcopy = new JButton("Hardcopy");
		gbc.gridx = 4;
		gbc.gridy = 12;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(b_Hardcopy,gbc);
		
		b_Hardcopy.addActionListener(e -> hardcopy());
		
		t_ExtrasPreis = new TextField();
		gbc.gridx = 4;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(t_ExtrasPreis,gbc);
		
		t_Extras = new TextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 3;
		gbc.gridheight = 1;
		add(t_Extras,gbc);
		
		c_GroesseAuswahl = new Choice();
		c_GroesseAuswahl.addItem("Small");
		c_GroesseAuswahl.addItem("Classic");
		c_GroesseAuswahl.addItem("Large");
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		add(c_GroesseAuswahl,gbc);
		
		c_PizzaAuswahl = new Choice();
		c_PizzaAuswahl.addItem("Schinken");
		c_PizzaAuswahl.addItem("Schinken Champingons");
		c_PizzaAuswahl.addItem("Steak n Beacon");
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 2;
		gbc.gridheight = 1;
		add(c_PizzaAuswahl,gbc);
		
		
		gbc.fill = GridBagConstraints.BOTH;
		li_Liste = new List();
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.gridwidth = 4;
		gbc.gridheight = 8;
		add(li_Liste,gbc);
				
		
		
		
		
		
		
		this.setSize(600,400);
		this.setVisible(true);
		this.setTitle("Pizzabestellung");
		
		
		addWindowListener( new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
	}
	public void hinzufuegen()
	{
		Pizza p = new Pizza(c_PizzaAuswahl.getSelectedItem(),12.50f,c_GroesseAuswahl.getSelectedItem(),t_Extras.getText(), Float.valueOf(t_ExtrasPreis.getText()));
		
		li_Liste.add(p.ToString());
	}
	public void entfernen()
	{
	}
	public void drucken()
	{
	}
	public void hardcopy()
	{
	}
	
	
}