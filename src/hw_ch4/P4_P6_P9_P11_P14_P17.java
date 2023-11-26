package hw_ch4;


public class P4_P6_P9_P11_P14_P17 {
	
	/*
	public static void main(String[] args){	//P4
		
		RacingCar rccar1 = new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
	}*/
	
	/*
	public static void main(String[] args){	//P6
		
		RacingCar rccar1 = new RacingCar(1234,20.5,5);
	}*/
	
	/*
	public static void main(String[] args){	//P9
		
		RacingCar rccar1 = new RacingCar();
		rccar1.newShow();
	}*/	

	/*
	public static void main(String[] args){	//P11
		
		RacingCar rccar1 = new RacingCar();
		rccar1.setCar(1234, 20.5);
		rccar1.setCourse(5);
		
		rccar1.show();
	}*/
	
	/*
	public static void main(String[] args){	//P14
		
		Car car1 = new RacingCar();
		car1.setCar(1234,20.5);
		car1.show();
	}*/
	
	public static void main(String[] args){	//P17
		
		Car cars[]=new Car[2];
		
		cars[0]=new Car();
		cars[0].setCar(1234, 20.5);
		
		cars[1]=new RacingCar();
		cars[1].setCar(4567, 30.5);
		
		for(int i=0;i<cars.length;i++) {
			cars[i].show();
		}
	}
	
	

}


class Car	//父類別
{
	//private int num;
	//private double gas;
	
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public Car(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("生產了車號為"+num+"，汽油量為"+gas+"的車子");
	}
	
	public void  setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，將汽油量設為"+gas);
	}
	
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油輛是"+gas);
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("生產了賽車");
	}
	
	public RacingCar(int n,double g, int c)
	{
		super(n,g);
		course = c;
		System.out.println("生產了編號為"+course+"的賽車");
	}
	
	public void setCourse(int c) 
	{
		course = c;
		System.out.println("將賽車編號設為"+course);
	}
	
	public void newShow()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
	
	public void show()
	{
		System.out.println("賽車的車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("賽車編號是"+course);
	}
}
