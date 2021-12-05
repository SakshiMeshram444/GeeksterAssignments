
public class Dog_1{
	public void speak()
    {
        System.out.println("woof!");
    }

    public static void main(String[] args)
    {
        Dog_1 d = new Dog_1();
        d.speak();
        Dog_1 b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dog_1
{
    public void speak()
    {
        System.out.println("arf arf");
    }
}

