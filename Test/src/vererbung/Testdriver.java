package vererbung;

public class Testdriver
{
	public Testdriver()
	{
		main2();
	}
	public static void main(String arg[])
	{
		new Testdriver();
	}
	public void main2()
	{
		Mitarbeiter[] daten = new Mitarbeiter[4];
		
		Arbeiter paul = new Arbeiter("Paul",17.20,140);
		Angestellter kurt = new Angestellter("Kurt",4000,500);
		Praktikant olga = new Praktikant("Olga",500);
		Chef otto = new Chef("Otto",7000);
		
		daten[0] = paul;
		daten[1] = kurt;
		daten[2] = olga;
		daten[3] = otto;
		
		
		for(int i = 0; i < daten.length; i++)
		{
			daten[i].gebeAus();
		}
		
	}
}