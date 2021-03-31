interface hi
 {
   public void welcome();
 }

class mydata implements hi
  {
    public void welcome()
	{
	  System.out.println("welcome from mydata class");
	}
  }

class mychilddata implements hi
 {
     public void welcome()
	{
	  System.out.println("welcome from mychilddata class");
	}	
  }

class demointer1
 {
   public static void main(String asd[])
	{
	 hi obj=new mydata();
	 obj.welcome();

        } 
 }