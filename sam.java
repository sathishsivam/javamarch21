class sam extends Thread
 {
	public void run()
	{
		System.out.println(t.isAlive());
		t.setName("Vinith");
		System.out.println(""+t.getName());
		System.out.println(t.getPriority());
	
	}

   public static void main(String asd[])
	{
	    sam obj=new sam();
	    sam obj1=new sam();
		obj.start();
		obj1.start();

	}
 }

