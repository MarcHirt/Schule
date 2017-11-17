package vererbung;

public class Adresse
{
	private String strasse = "";
	private int plz;
	private String ort = "";
	
	
	//Konstruktoren (Leeres "Formular")
	public Adresse()
	{
	}
	public Adresse(String strasse, int plz, String ort)
	{
		this.strasse = strasse;
		this.plz = plz;
		this.ort = ort;
	}
	
	//Getter / Setter
	public String getStrasse()
	{
		return strasse;
	}
	public void setStrasse(String strasse)
	{
		this.strasse = strasse;
	}
	
	
	public int getPlz()
	{
		return plz;
	}
	public void setPlz(int plz)
	{
		this.plz = plz;
	}
	
	
	public String getOrt()
	{
		return ort;
	}
	public void setOrt(String ort)
	{
		this.ort = ort;
	}
}	