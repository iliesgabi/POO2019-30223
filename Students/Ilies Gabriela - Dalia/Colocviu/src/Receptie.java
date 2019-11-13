import java.util.Arrays;

public class Receptie {
	public static void main(String[] argv)
	{
		Client[] client=new Client[5];
		client[0]=new Client(1,"Marcel","07");
		client[1]=new Client(2,"Ioana","07");
		client[2]=new Client(3,"Bianca","07");
		client[3]=new Client(4,"Lucian","07");
		client[4]=new Client(8,"Cosmin","08");
		Client[] clientiCamera1=new Client[2];
		clientiCamera1[0]=client[0];
		clientiCamera1[1]=client[1];
		
		Angajat[] angajat=new Angajat[3];
		angajat[0]=new Angajat(5,"Sclav1","09","14.03.2017",2);
		angajat[1]=new Angajat(6,"Sclav2","09","14.03.2017",1);
		angajat[2]=new Angajat(7,"Sclav3","09","14.03.2017",5);
		
		
		Camera[] camera=new Camera[3];
		camera[0]=new Camera(1,3,100,130);
		camera[1]=new Camera(2,2,90,120);
		camera[2]=new Camera(3,2,90,120);
		
		System.out.println(camera[0].getNrOaspeti());
		angajat[0].cazeazaClient(client[4], camera[0], "normal","10.11.2019");
		angajat[0].cazeazaClient(client[0], camera[0], "normal","10.11.2019");
		angajat[0].cazeazaClient(client[1], camera[0], "normal","10.11.2019");
		angajat[0].cazeazaClient(client[2], camera[0], "normal","10.11.2019");
		angajat[0].cazeazaClient(client[3], camera[0], "normal","10.11.2019");
		
		System.out.println(camera[0].getNrOaspeti());
		angajat[0].decazeazaClient(client[4], camera[0], "11.11.2019");
		angajat[0].decazeazaClient(client[1], camera[0], "11.11.2019");
		angajat[0].decazeazaClient(client[2], camera[0], "11.11.2019");
		angajat[0].decazeazaClient(client[3], camera[0], "11.11.2019");
		angajat[0].decazeazaClient(client[0], camera[0], "11.11.2019");
		
		System.out.println(camera[0].getNrOaspeti());
		
		Hotel hotel=new Hotel(angajat,client,camera);
		
		hotel.afiseazaClienti();
		hotel.afiseazaAngajati();
		hotel.afiseazaStatistici();
		hotel.afiseazaCamereLibere("12.11.2019");
	}
}
