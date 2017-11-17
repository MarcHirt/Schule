package vererbung;

public class Arbeiter extends Mitarbeiter
{
	private double lohnStd;
	private double anzStd;
	
	private Integer id;
	private static int anzahl = 0;
	
	
	//Konstruktoren (Leeres "Formular")
	public Arbeiter()
	{
		anzahl++;
		id = new Integer(anzahl);
	}
	public Arbeiter(String name, double lohnStd, double anzStd)
	{
		this.setName(name);
		this.lohnStd = lohnStd;
		this.anzStd = anzStd;
		
		anzahl++;
		id = new Integer(anzahl);
	}

	//Methoden
	public double berechneEntgelt()
	{
		return this.getAnzStd() * this.getLohnStd();
	}
	
	public void gebeAus()
	{
		try
		{
			//super.gebeAus();		
			System.out.println("Stundenlohn: "+this.getLohnStd());
			System.out.println("Anzahl Stunden: "+this.getAnzStd());
			
			System.out.println("Entgelt: "+this.berechneEntgelt());
		}
		catch(Exception e)
		{
		}
	}
	
	public double getLohnStd()
	{
		return lohnStd;
	}
	public void setLohnStd(double lohnStd)
	{
		this.lohnStd = lohnStd;
	}
	
	
	
	public double getAnzStd()
	{
		return anzStd;
	}
	public void setAnzStd(double anzStd)
	{
		this.anzStd = anzStd;
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