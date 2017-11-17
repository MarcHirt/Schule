package vererbung;

public class Chef extends Mitarbeiter
{
	private double lohn;
	
	private Integer id;
	private static int anzahl = 0;
	
	
	
	
	public Chef(String name, double lohn)
	{
		this.setName(name);
		this.lohn = lohn;
		
		anzahl++;
		id = new Integer(anzahl);
	}

	public void gebeAus()
	{
		try
		{
			//super.gebeAus();		
			System.out.println("Gehalt: "+this.getLohn());
		}
		catch(Exception e)
		{
		}
	}
	
	public double getLohn()
	{
		return lohn;
	}	
}