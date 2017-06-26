
public class GenericClassExample<T1,T2> {
	
	T1 a;
	T2 b;
	public GenericClassExample(T1 a, T2 b) {
		super();
		this.a = a;
		this.b = b;
	}
	public T1 getA() {
		return a;
	}
	
	public T2 getB() {
		return b;
	}
	public static void main (String args[])
	{
		GenericClassExample generic=new GenericClassExample(3,"hello");
		System.out.println(generic.getA());
		System.out.println(generic.getB());	
	}
	
	
	

}
