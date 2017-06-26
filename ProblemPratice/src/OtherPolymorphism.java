
public class OtherPolymorphism {
	ChildPolymorphism child;
	
	public OtherPolymorphism(Polymorphism polymorphism)
	{
		
	}
public static void main(String args[])
{
	OtherPolymorphism other=new OtherPolymorphism(new ChildPolymorphism());
	System.out.println("i am other");
	
}
}
