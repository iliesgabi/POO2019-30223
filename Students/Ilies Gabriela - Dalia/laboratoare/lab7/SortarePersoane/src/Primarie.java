
import java.util.Arrays;

public class Primarie {
	public static void main(String argv[])
	{
		Persoana[] persoana=new Persoana[4];
		
		persoana[0]=new Persoana("Moldovan","Bianca",16);
		persoana[1]=new Persoana("Apostol","Ovidiu",20);
		persoana[2]=new Persoana("Coroian","Darius",66);
		persoana[3]=new Persoana("Moholea","Lavinia",5);
		
		Arrays.sort(persoana);
		for(int i=0; i<4; i++)
			System.out.print(persoana[i].toString()+"\n");
		
	}
}
