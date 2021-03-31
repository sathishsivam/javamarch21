class sample extends Thread
 {
    Thread t=new Thread(this);
    sample()
	{
	   for(int i=0;i<10;i++)
	     {
	       try{
			 System.out.println(""+i);
			  t.sleep(500);
		  }catch(InterruptedException s){}
	     }
		 
	}
 }


class demothread
 {
    public static void main(String asd[])
	{ 
           Thread t=Thread.currentThread();
	   sample obj=new sample();

	   for(int i=0;i<10;i++)
		{
		try{
		   System.out.println(""+i);
		   t.sleep(1000);
		}catch(Exception d){}
		}
	}
 }