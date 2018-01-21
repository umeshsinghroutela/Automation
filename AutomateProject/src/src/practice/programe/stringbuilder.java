package src.practice.programe;


public class stringbuilder {
	public static void main(String[] args) {

		StringBuilder s1= new StringBuilder("tintu");

		StringBuilder s2= new StringBuilder("umesh");

		System.out.println(	s1.hashCode());

		System.out.println(	s2.hashCode());

		if(s1.equals(s2))
		{
			System.out.println("print1");
		}
		else
		{
			System.out.println("dont print");
		}
	}
}
