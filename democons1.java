class sample
 {
    sample()
       {
          System.out.println("Enter your name");
       }

    sample(int x,int y)
       {
          System.out.println("mY age  is x and my Roll.no is y");
       }

    sample(String a)
       {
          System.out.println(" "+a);
       }

    sample(float b)
       {
          System.out.println("The average mark is"+(b/b));
       }
 }

class democons1
 {
   public static void main(String asd[])
	{
        new sample();
        new sample(10,12);
	new sample("i18nsolutions");
      	new sample(12.1f);
	}
 }


