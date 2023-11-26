package hw_ch4_2;

public class P38 { 
	
	public static void main(String[] args)	//P38
	{
		iVehicle[] ivc = new iVehicle[2];
		
		ivc[0] = new Car4(1234, 20.2);
		ivc[1] = new Plane1(232);
		
		for(int i=0;i<ivc.length;i++)
		{
			ivc[i].show();
		}
	}
}


interface iVehicle
{
	int weight = 1000;
	void show();
}

class Car4 implements iVehicle
{
	private int num;
	private double gas;
	
	public Car4(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
}

class Plane1 implements iVehicle
{
	private int flight;
	
	public Plane1(int f)
	{
		flight = f;
		System.out.println("生產了"+flight+"班次的飛機");
	}
	
	public void show()
	{
		System.out.println("飛機的班次是"+flight);
	}
}

