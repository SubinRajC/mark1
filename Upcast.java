package PATTERNS;
public class Upcast 
{
	int size=10;
	
	void display()
	{
		System.out.println("HD is supported");
	}
}	
class Keyboard
{
	int b=20;
	
	void type()
	{
		System.out.println("Keyboard is typing");
	}
}
class composition
{
	static Upcast m=new Upcast();
	Keyboard k=new Keyboard();
}
class Main{
	public static void main(String[] args) {
		System.out.println(composition.m.size);
		composition.m.display();
		composition c=new composition();
		c.k.type();
		System.out.println(c.k.b);
	}
	
}
