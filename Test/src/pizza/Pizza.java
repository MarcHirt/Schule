package pizza;

public class Pizza
{
	private String name;
	private float preis;
	private float extrapreis;
	private String groesse;
	private String extra;
	
	public Pizza(String name, float preis, String groesse,String extra, float extrapreis)
	{
		this.name = name;
		this.preis = preis;
		this.groesse = groesse;
		this.extra = extra;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public float getPreis()
	{
		return preis;
	}
	public void setPreis(float preis)
	{
		this.preis = preis;
	}
	
	public String ToString()
	{
		return name + " : " + groesse + " : " + extra;
	}
	
}