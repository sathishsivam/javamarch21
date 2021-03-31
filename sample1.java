class simple 
 {
    simple()
	{

	}
 }


class sample extends simple implement Runnable 
 {
   Thread t=new Thread(this);
    sample()
	{
	  System.out.println(""+t.getName());
	}
	
	public void run(){}

 }

class sample1
 {
//   Thread t=new Thread(this);

    public static void main(String ads[])
	{
    	 Thread t=Thread.currentThread();
	   sample obj=new sample();
	   System.out.println(""+t.getName());

	}
 }


