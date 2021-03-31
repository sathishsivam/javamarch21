class sample
 {
   int x=10,y=12;

    sample()
	{
  	   if(!false)
	   {
	     System.out.println("this will getting executed");	
	   }
	   else if(false)
	    {
	     System.out.println("this will getting executed on behalf of else");
	    }
	   else if (true && false)
	   {
	     System.out.println("this will getting executed on behalf of else2");
	   }
	   else
	       {

		}

	}
 }


class demologic
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }

//  logical operations are always used to compare the relational operations 