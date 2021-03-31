interface draw
 {
    public void draw();
 }

class circle implements draw
 {
    public void draw()
	{
	   System.out.println("this is circle");
	}
     
 }

class rect implements draw
 {
    public void draw()
	{
	   System.out.println("this is Rect");
	}
     
 }

class demointer
 {
   public static void main(String asd[])
	{
	   draw obj=new rect();
	   obj.draw();
	}
 }