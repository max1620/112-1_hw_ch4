package hw_ch4;

public class P24_P25_P26 {
	
	/*
	public static void main(String[] args){	//P24
		
		Car1 car1=new Car1();
		car1.setCar1(1234, 20.5);
		System.out.println(car1);
	}*/
	
	/*
	public static void main(String[] args){	//P25
		
		Car1 car1=new Car1();
		Car1 car2=new Car1();
		
		Car1 car3;
		car3=car1;
		
		System.out.println("car1與car2相同"+car1.equals(car2));
		System.out.println("car1與car3相同"+car1.equals(car3));
	}*/
	
	public static void main(String[] args){	//P26
		
		Car1 car1s[]=new Car1[2];
		
		car1s[0]=new Car1();
		car1s[1]=new RacingCar1();
		
		for(int i=0;i<car1s.length;i++) {
			Class cl = car1s[i].getClass();
			System.out.println("第"+(i+1)+"個物件的類別是"+cl);
		}
		
	}
}


class Car1
{
	protected int num;
	protected double gas;
	
	public Car1()
	{
		num = 0;
		gas = 0.0;
		System.out.println("生產了車子");
	}
	
	public void setCar1(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"，汽油量設為"+gas);
	}
	
	public String toString() 
	{
		String str = "車號"+num+"汽油量"+gas;
		return str;
	}
}

class RacingCar1 extends Car1
{
	public RacingCar1()
	{
		System.out.println("生產了賽車");
	}
}