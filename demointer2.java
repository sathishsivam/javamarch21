
interface one
 {
    public void welcome();
 }

interface two extends one
 {
    public void welcome1();
 }

class sample implements two
 {
    public void welcome()
	{ 
	  System.out.println("from one");
	}
    public void welcome1()
	{	
	  System.out.println("from two");
	}
 }

class demointer2
 {
   public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.welcome();
	   obj.welcome1();
	}
 }
