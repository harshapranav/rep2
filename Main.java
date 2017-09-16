import java.util.Date;
public class Main {

	public static void main(String[] args) {
		
		StudentGroup stg=new StudentGroup(10);

	Date d=new Date(1999,9,10);
	Student s1=new Student(20,"abc",d,89.0);

                stg.addFirst(s1);

              System.out.println(stg.getStudent(0).getId());






	}

}
