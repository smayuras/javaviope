import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class CarList{
	
	Scanner reader = new Scanner(System.in);
	List<Car> carlist = new ArrayList<Car>();

	public void menudisplayer(){
		int menuoption;
		do{
		
		System.out.println("1. Add car");
		System.out.println("2. Print cars");
		System.out.println("0. Exit");
		System.out.print("Choose (0 - 2)");

			menuoption = reader.nextInt();
		
		switch(menuoption){

			case 1:
			addCar();
			break;

			case 2:
			printCars();
			break;

			case 0:
			break;
			
			default:
			System.out.println("Invalid choice");


		}

	} while(menuoption !=0);
}





	public void addCar(){

		System.out.print("Type a brand: ");
		String brand = reader.next();
		//String brand = reader.nextLine();
		//System.out.println("--------------");
		System.out.print("Type a model: ");
		String model = reader.next();
		System.out.print("Type a registration number: ");
		String registration_no = reader.next();
		System.out.print("Type a year made: ");
		int yearmade = reader.nextInt();
		Car car =new Car(brand, model, registration_no, yearmade);
		carlist.add(car);
		
	}



	public void printCars(){

		for(Car c : carlist){

			System.out.println(c.getBrand() + " "+c.getModel()+ ", "+ c.getYearmade()+ ", "+ c.getRegistrationNo());

		}

	}
	public static void main(String a[]){

	CarList demo =new CarList();	
	demo.menudisplayer();

	}
}