class Car{
	
	private String brand;
	private String model;
	private String registration_no;
	private int yearmade;



	public Car(){

	// important comments
	}

	public Car(String brand, String model, String registration_no, int yearmade){

	 this.brand = brand;
	 this.model = model;
	 this.registration_no = registration_no;
	 this.yearmade = yearmade;
	}

	public String getBrand(){

	return this.brand;

	}

	public String getModel(){

	return this.model;
	}

	public String getRegistrationNo(){

	return this.registration_no;
	}


	public int getYearmade(){

	return this.yearmade;
	}


	public void setBrand(String brand){

	this.brand = brand;
	}

	public void setModel(String model){

	this.model = model;
	}

	public void setRegistrationno(String registratio_no){

	this.registration_no = registration_no;
	}

	public void setYearmade(int yearmade){

	this.yearmade = yearmade;
	}
















}