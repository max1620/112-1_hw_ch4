package hw_ch4_2;

public class P41 { 
	
	public static void main(String[] args)	//P38
	{
		Car5 car1 = new Car5(1234, 20.5);
		car1.vshow();
		car1.mshow();
	}
}


interface iVehicle1
{
	void vshow();
}

interface iMaterial
{
	void mshow();
}

class Car5 implements iVehicle1,iMaterial
{
	private int num;
	private double gas;
	
	public Car5(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void vshow()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	
	public void mshow()
	{
		System.out.println("車子的材質是鐵");
	}
}

