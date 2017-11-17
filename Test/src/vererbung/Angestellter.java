package vererbung;

public class Angestellter extends Mitarbeiter
{
	private double gehalt;
	private double zulage;
	
	private Integer id;
	private static int anzahl = 0;
	
	
	//Konstruktoren (Leeres "Formular")
	public Angestellter()
	{
		anzahl++;
		id = new Integer(anzahl);
	}
	public Angestellter(String name, double gehalt, double zulage)
	{
		this.setName(name);
		this.gehalt = gehalt;
		this.zulage = zulage;
		
		anzahl++;
		id = new Integer(anzahl);
	}

	//Methoden
	
	public void gebeAus()
	{
		try
		{
			//super.gebeAus();		
			System.out.println("Gehalt: "+this.getGehalt());
			System.out.println("Zulage: "+this.getZulage());
			
			System.out.println("Entgelt: "+this.berechneEntgelt());
		}
		catch(Exception e)
		{
		}
	}
	public double berechneEntgelt()
	{
		return this.getGehalt() + this.getZulage();
	}
	
	public double getGehalt()
	{
		return gehalt;
	}
	public void setGehalt(double gehalt)
	{
		this.gehalt = gehalt;
	}
	
	
	
	public double getZulage()
	{
		return zulage;
	}
	public void setZulage(double zulage)
	{
		this.zulage = zulage;
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