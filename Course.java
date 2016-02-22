class Course{
	
	private String courseid;
	private String name;
	private String credits;



	public Course(){

	}
	public Course(String courseid, String name, String credits){

		this.courseid = courseid;
		this.name = name;
		this.credits = credits;

	}

	public void setCourseid(String courseid){

		this.courseid = courseid;
	}

	public void setName(String name){

		this.name = name;
	}

	public void setCredits(String credits){

		this.credits = credits;
	}

	public String getCourseid(){

		return this.courseid;
	}


	public String getName(){

		return this.name;
	}

	public String getCredits(){

		return this.credits;
	}

	public String toString(){

		return (this.courseid + ": "+ this.name + " " + this.credits + " cr");
	}
















}