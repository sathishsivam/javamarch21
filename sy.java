class callme
 {
   public void call(String msg)
	{
	  System.out.println(msg);	
	  display();
	}

	public void display()
	{
 	   for(int i=0;i<10;i++)
		{
		  System.out.println(""+i);
		}
	
	}
 }



class caller extends Thread
 { 
    Thread t=new Thread(this);
    callme targ;   	
    String str;
   
  caller(callme target,String str)
	{
	 targ=target;
	  t.start();
 	  this.str=str;
 	}
	
	public void run()
	{
	   targ.call(str);  
	}

  }


class sy
 {
   public static void main(String asd[])
	{
	   callme t=new callme();
	   caller obj1=new caller(t,"hi");
	   caller obj2=new caller(t,"vinith");
	   caller obj3=new caller(t,"how are u");
	   caller obj4=new caller(t,"Am good sir");


	}
 }