import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class NaturalOrdering {

	public static void main(String[] args) {
		Student st1=new Student(100,"Lyhov");
		Student st2=new Student(10,"love");
		Student st3=new Student(1010,"you");
		Student st4=new Student(60,"paneth");
		Student st5=new Student(600,"I miss you so much bab");
		
		List <Student> list=new ArrayList <Student>();
		
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		list.add(st5);
		
		System.out.println("Before sorting");
		System.out.println(list);
		
		Collections.sort (list);
		//st1.compareTo(st2);
		System.out.println("After Sorting");
		System.out.println(list.toString());

	}

}
