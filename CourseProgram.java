import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

class CourseProgram{
	


	public static void main(String a[]){

		Scanner reader = new Scanner(System.in);
		Map<String, Course> coursemapper = new HashMap<String, Course>();

		for(int i = 0; i < 4; i++){
			System.out.print("Type a course ID: ");
			String courseid = reader.nextLine();

			System.out.print("Type a Course name: ");
			String name = reader.nextLine();

			System.out.print("Type the credits: ");
			String credits = reader.nextLine();

			Course course =new Course(courseid, name, credits);
			coursemapper.put(courseid, course);

		}

		/*for(Course c: coursemapper){

			System.out.println(c.getCourseid() + ": "+c.getName()+" "+ c.getCredits()+" cr" );
		} */

		String nextCourseid;
		Course nextCourse;
		Set<String> keys = coursemapper.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()){
			nextCourseid = it.next();
			nextCourse = coursemapper.get(nextCourseid);
			System.out.println(nextCourse.toString());
		}

	}
}