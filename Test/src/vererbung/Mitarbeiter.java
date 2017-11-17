package vererbung;

public abstract class Mitarbeiter
{
	private String name;
	private Adresse wohnort;
	
	private Integer id;
	private static int anzahl = 0;
	
	
	//Konstruktoren ("Leeres "Formular")
	public Mitarbeiter()
	{
		anzahl++;
		id = new Integer(anzahl);
	}
	public Mitarbeiter(String name)
	{
		this.setName(name);
		
		anzahl++;
		id = new Integer(anzahl);
	}
	public Mitarbeiter(String name, Adresse wohnort)
	{
		this.setName(name);
		this.wohnort = wohnort;
		
		anzahl++;
		id = new Integer(anzahl);
	}
	
	//Methoden
	public abstract void gebeAus();
	
	public double berechneEntgelt()
	{
		return 0;
	}	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public Integer getId()
	{
		return id;
	}
	public static int getAnzahl()
	{
		return anzahl;
	}

	
}	